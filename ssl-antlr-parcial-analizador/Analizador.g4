grammar Analizador;

// Parser rules
regla
    : 'cuando' condicion 'entonces' accion ';'
    ;

condicion
    : nombre_dispositivo estado_condicion valor_condicion
    ;

nombre_dispositivo
    : IDENTIFICADOR
    ;

estado_condicion
    : 'es'
    | 'mayor que'
    | 'menor que'
    ;

valor_condicion
    : estado
    | NUMERO
    ;

estado
    : 'encendido'
    | 'apagado'
    ;

accion
    : accion_simple
    ;

accion_simple
    : activar
    | desactivar
    | ajustar
    ;

activar
    : 'activar' nombre_dispositivo
    ;

desactivar
    : 'desactivar' nombre_dispositivo
    ;

ajustar
    : 'ajustar' nombre_dispositivo 'a' NUMERO
    ;

// Lexer rules
IDENTIFICADOR
    : LETRA (LETRA | DIGITO | '_')*
    ;

NUMERO
    : DIGITO+
    ;

fragment DIGITO
    : [0-9]
    ;

fragment LETRA
    : [a-zA-Z]
    ;

// Ignorar espacios en blanco y saltos de línea
WS
    : [ \t\r\n]+ -> skip
    ;