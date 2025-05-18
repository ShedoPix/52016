import antlr4 from 'antlr4';
import fs from 'fs';
import AnalizadorLexer from './generated/AnalizadorLexer.js';
import AnalizadorParser from './generated/AnalizadorParser.js';
import AnalizadorListener from './generated/AnalizadorListener.js';

// Leer input.txt
const inputCode = fs.readFileSync('input.txt', 'utf8');
console.log("Código de entrada:\n");
console.log(inputCode);

// Lexer
const inputStream = new antlr4.InputStream(inputCode);
const lexer = new AnalizadorLexer(inputStream);
const tokenStream = new antlr4.CommonTokenStream(lexer);
tokenStream.fill();

// Mostrar tokens
console.log("\n--- TABLA DE TOKENS ---\n");
tokenStream.tokens.forEach(token => {
    if (token.type !== -1) {
        const tokenName = lexer.symbolicNames?.[token.type] || `TOKEN_${token.type}`;
        console.log(`TOKEN: ${tokenName} => '${token.text}'`);
    }
});

// Parser
const parser = new AnalizadorParser(tokenStream);
parser.buildParseTrees = true;
const tree = parser.regla();

// Traductor
class AnalizadorToJS extends AnalizadorListener {
    constructor() {
        super();
        this.output = '';
        this.dispositivos = new Set();
    }

    enterRegla(ctx) {
        const dispositivo = ctx.condicion().nombre_dispositivo().getText();
        const estado = ctx.condicion().valor_condicion().getText();
        const operador = ctx.condicion().estado_condicion().getText();

        // Definir dispositivo si no está definido
        if (!this.dispositivos.has(dispositivo)) {
            this.dispositivos.add(dispositivo);
            if (estado === 'encendido' || estado === 'apagado') {
                const valorBool = estado === 'encendido' ? 'true' : 'false';
                this.output += `const ${dispositivo} = { encendido: ${valorBool}, desactivar: function() { this.encendido = false; }, activar: function() { this.encendido = true; }, ajustar: function(valor) { this.valor = valor; } };\n`;
            } else {
                this.output += `const ${dispositivo} = { valor: ${estado}, desactivar: function() { this.encendido = false; }, activar: function() { this.encendido = true; }, ajustar: function(valor) { this.valor = valor; } };\n`;
            }
        }

        // Condición traducida
        let condicionJS = '';
        if (operador === 'es') {
            condicionJS = `${dispositivo}.encendido === ${estado === 'encendido' ? 'true' : 'false'}`;
        } else if (operador === 'mayor que') {
            condicionJS = `${dispositivo}.valor > ${estado}`;
        } else if (operador === 'menor que') {
            condicionJS = `${dispositivo}.valor < ${estado}`;
        }

        this.output += `if (${condicionJS}) {\n`;
    }

    exitRegla(ctx) {
        this.output += '}\n';
    }

    enterAccion_simple(ctx) {
        if (ctx.activar()) {
            const dispositivo = ctx.activar().nombre_dispositivo().getText();
            this.output += `    ${dispositivo}.activar();\n`;
        } else if (ctx.desactivar()) {
            const dispositivo = ctx.desactivar().nombre_dispositivo().getText();
            this.output += `    ${dispositivo}.desactivar();\n`;
        } else if (ctx.ajustar()) {
            const dispositivo = ctx.ajustar().nombre_dispositivo().getText();
            const valor = ctx.ajustar().NUMERO().getText();
            this.output += `    ${dispositivo}.ajustar(${valor});\n`;
        }
    }
}

const listener = new AnalizadorToJS();
antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

console.log("\n--- CÓDIGO JAVASCRIPT GENERADO ---\n");
console.log(listener.output);

// Guardar salida
fs.writeFileSync('output.js', listener.output);
console.log("\n Código traducido guardado en output.js");