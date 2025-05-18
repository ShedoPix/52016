const ventilador = { encendido: true, desactivar: function() { this.encendido = false; }, activar: function() { this.encendido = true; }, ajustar: function(valor) { this.valor = valor; } };
if (ventilador.encendido === true) {
    velocidad.ajustar(50);
}
