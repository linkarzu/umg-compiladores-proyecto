grammar comandosDron;

// Definición de la estructura de los comandos
comando
    : accion EOF
    ;

accion
    : ENCENDER_MOTOR
    | APAGAR_MOTOR
    | GIRAR direccion cantidad // 'GIRAR' requiere una dirección y una cantidad
    | ELEVARSE cantidad
    | BAJAR cantidad
    | ROTAR direccion cantidad // 'ROTAR' también requiere una dirección y una cantidad
    | REGRESAR_BASE
    ;

direccion: DERECHA | IZQUIERDA | ADELANTE | ATRAS;
cantidad: NUMERO;

// Tokens
ENCENDER_MOTOR : 'ENCENDER_MOTOR';
APAGAR_MOTOR   : 'APAGAR_MOTOR';
GIRAR          : 'GIRAR';
ELEVARSE       : 'ELEVARSE';
BAJAR          : 'BAJAR';
ROTAR          : 'ROTAR';
REGRESAR_BASE  : 'REGRESAR_BASE';
DERECHA        : 'DERECHA';
IZQUIERDA      : 'IZQUIERDA';
ADELANTE       : 'ADELANTE';
ATRAS          : 'ATRAS';
NUMERO         : [0-9]+ ('.' [0-9]+)?;
WS             : [ \t\r\n]+ -> skip; // Ignorar espacios en blanco

