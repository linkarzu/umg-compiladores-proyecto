grammar comandosDron;

// Definir un bloque de código que se insertará como un miembro de la clase del parser generada
@parser::members {
    // Crear una instancia del listener DroneListener y del contexto DroneContext
    // para realizar acciones y validaciones personalizadas durante el análisis sintáctico.
    //
    // El listener se encargará de manejar las reglas semánticas y las acciones específicas
    // para cada comando reconocido por la gramática, utilizando el contexto del dron.
    private DroneListener droneListener = new DroneListener(new DroneContext());
}

comando
    : accion EOF
    ;

accion
    : ENCENDER_MOTOR
    | APAGAR_MOTOR
    // Notar que GIRAR utiliza 'direccionGiro'
    | GIRAR direccionGiro cantidad
    | ELEVARSE cantidad
    | BAJAR cantidad
    // Notar que ROTAR utiliza 'direccionRotacion'
    | ROTAR direccionRotacion cantidad
    | REGRESAR_BASE
    | HELP
    | STATUS
    ;

// Modificamos el parámetro 'dirección' y agregamos direcciónGiro y
// direccionRotacion
direccionGiro: DERECHA | IZQUIERDA;
direccionRotacion: ADELANTE | ATRAS;
cantidad: NUMERO;

// Tokens
// Agregamos 2 nuevos tokens, 'HELP' y 'STATUS'
HELP           : 'help';
STATUS         : 'status';
ENCENDER_MOTOR : 'encender_motor';
APAGAR_MOTOR   : 'apagar_motor';
GIRAR          : 'girar';
ELEVARSE       : 'elevarse';
BAJAR          : 'bajar';
ROTAR          : 'rotar';
REGRESAR_BASE  : 'regresar_base';
DERECHA        : 'derecha';
IZQUIERDA      : 'izquierda';
ADELANTE       : 'adelante';
ATRAS          : 'atras';
NUMERO         : [0-9]+ ('.' [0-9]+)?;
WS             : [ \t\r\n]+ -> skip; // Ignorar espacios en blanco

