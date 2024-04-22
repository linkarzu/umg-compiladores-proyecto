# Contenido

<!-- toc -->

- [Descripcion del proyecto](#descripcion-del-proyecto)
- [Tarea 1: Definir la gramatica del proyecto](#tarea-1-definir-la-gramatica-del-proyecto)
  - [Participantes tarea 1](#participantes-tarea-1)
  - [Descripcion tarea 1](#descripcion-tarea-1)
  - [Resumen tarea 1](#resumen-tarea-1)
  - [Creacion de tokens](#creacion-de-tokens)
  - [Creacion de la sintaxis](#creacion-de-la-sintaxis)
  - [Ejemplos de la sintaxis](#ejemplos-de-la-sintaxis)
- [Tarea 2: Instalar herramienta generacion compiladores](#tarea-2-instalar-herramienta-generacion-compiladores)
  - [Participantes tarea 2](#participantes-tarea-2)
  - [Descripcion tarea 2](#descripcion-tarea-2)
  - [Resumen tarea 2](#resumen-tarea-2)
  - [Instalar ANTLR en macOS](#instalar-antlr-en-macos)
  - [Instalar ANTRL en Windows](#instalar-antrl-en-windows)
  - [Instalar ANTLR en Linux](#instalar-antlr-en-linux)
  - [Creacion de la Gramatica en ANTLR](#creacion-de-la-gramatica-en-antlr)
  - [Prueba de la gramatica con ANTLR](#prueba-de-la-gramatica-con-antlr)
- [Tarea 3: Arbol sintactico](#tarea-3-arbol-sintactico)
  - [Participantes tarea 3](#participantes-tarea-3)
  - [Descripcion tarea 3](#descripcion-tarea-3)
  - [Resumen tarea 3](#resumen-tarea-3)
  - [Creacion arboles sintacticos](#creacion-arboles-sintacticos)

<!-- tocstop -->

## Descripcion del proyecto

- Objetivo:
  - Desarrollar un analizador léxico y sintáctico para un lenguaje que permita
    controlar un dron, que tenga al menos 6 funciones específicas:
- Descripción:
  - Diseñe un lenguaje para que controle un dron con las siguientes funciones:
    - a. Encender motor
    - b. Apagar motor
    - c. Girar a la derecha o a la izquierda
    - d. Elevarse en vertical
    - e. Rotar hacia adelante o hacia atrás
    - f. Regresar al punto de partida
- Consideraciones:
  - El lenguaje debe diseñarlo Ud. y con una herramienta (la que Ud. seleccione)
    para generar compiladores, genere el analizador léxico y sintáctico del
    mismo.
- Entregable:
  - Bitácora de todo lo realizado en el proyecto Definición clara de la
    gramática utilizada Limitaciones encontradas Retos superados Presentación
    para la clase.

## Tarea 1: Definir la gramatica del proyecto

### Participantes tarea 1

| Nombre         | Participación |
| -------------- | ------------- |
| Christian Arzu | 100%          |
| Bryan Orellana | 100%          |

### Descripcion tarea 1

- Definir la gramatica del proyecto

### Resumen tarea 1

- Después de la entrega de la tarea 1, recapacitamos y nos dimos cuenta de que
  vamos a empezar con algo más sencillo, vamos a empezar con una gramática
  sencilla que abarque los seis comandos básicos mencionados en la descriptición
  del proyecto
- El ingeniero durante la clase nos indicó que podíamos utilizar notación BNF
  (Backus-Naur Form), por lo que haremos esto para una mejor claridad.
- Crearemos una gramática que interprete comandos simples. Cada comando se
  traducirá en una acción específica del dron. El objetivo principal de esta
  tarea como grupo, es entender cómo cada parte de la gramática se relaciona con
  los comandos que el dron puede ejecutar.

### Creacion de tokens

- Los tokens son los elementos básicos de programación, como identificadores,
  palabras clave, constantes, operadores, y signos de puntuación.
- De primero vamos a definir los tokens básicos

```bash
ENCENDER_MOTOR -> 'ENCENDER_MOTOR'
APAGAR_MOTOR -> 'APAGAR_MOTOR'
GIRAR -> 'GIRAR' ('DERECHA' | 'IZQUIERDA')
ELEVARSE -> 'ELEVARSE'
BAJAR -> 'BAJAR'
ROTAR -> 'ROTAR' ('ADELANTE' | 'ATRAS')
REGRESAR_BASE -> 'REGRESAR_BASE'
NUMERO -> [0-9]+ ('.' [0-9]+)?
```

### Creacion de la sintaxis

- La sintaxis define cómo se organizan los tokens para formar instrucciones.

```bash
<comando> ::= <accion>
<accion> ::= ENCENDER_MOTOR
           | APAGAR_MOTOR
           | GIRAR <direccion> <cantidad>
           | ELEVARSE <cantidad>
           | BAJAR <cantidad>
           | ROTAR <direccion> <cantidad>
           | REGRESAR_BASE

<direccion> ::= 'DERECHA' | 'IZQUIERDA' | 'ADELANTE' | 'ATRAS'
<cantidad> ::= NUMERO
```

- A continuación vamos a definir cada uno de los elementos de nuestra sintaxis
  - `<comando>`: Define una instrucción completa para el dron. Algunos comandos
    pueden requerir parámetros adicionales.
  - `<accion>`: Representa una acción específica que el dron puede realizar.
  - `<direccion>`: Usada con los comandos de girar y rotar para especificar la
    dirección.
  - `<cantidad>`: Representa un valor numérico utilizado para especificar cuánto
    debe elevarse el dron.

### Ejemplos de la sintaxis

- Para entender mejor cómo utilizar la sintaxis, a continuación dejamos unos
  ejemplos
  - `ENCENDER_MOTOR` (Enciende el motor del dron)
  - `ELEVARSE 10` (Eleva el dron a 10 metros de altura sobre su posición actual)
  - `BAJAR 5` (Baja el dron 5 metros sobre su posición actual)
  - `GIRAR DERECHA 90` (Gira el dron 90 grados hacia la derecha)
  - `ROTAR ADELANTE 30` (Mueve el dron 30 metros hacia adelante)
  - `REGRESAR_BASE` (El dron vuelve al punto de partida o posición inicial)
  - `APAGAR_MOTOR` (Apaga el motor del dron)

## Tarea 2: Instalar herramienta generacion compiladores

### Participantes tarea 2

| Nombre         | Participación |
| -------------- | ------------- |
| Christian Arzu | 100%          |
| Bryan Orellana | 100%          |

### Descripcion tarea 2

- Utilizando una herramienta de generación de compiladores, instale sus
  componentes y traslade la gramática (por lo menos un par de instrucciones de
  la gramática definida) a la herramienta seleccionada.

### Resumen tarea 2

- Como vimos en clase, y citamos textualmente
- "Herramientas para construir y desarrollar compiladores, las cuales están
  especializadas en las diferentes fases del proceso de compilación."
- | Tradicionales | Nueva generación |
  | ------------- | ---------------- |
  | Goldparser    | ANTLR            |
  | Yacc          | JAVACC           |
  | Cup           |                  |
- No todos en el grupo utilizamos el mismo sistema operativo, algunos utilizan
  macOS otros windows, por lo que estuvimos buscando una herramienta compatible
  para ambos sistemas operativos fácil de utilizar, por lo que probaremos ANTLR

### Instalar ANTLR en macOS

- Instrucciones para instalar en macOS se pueden
  [encontrar acá](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#unix)
- Lo primero que me pide es instalar Java 11 o más reciente

```bash
brew install openjdk
```

- Encontrar la ubicación del openjdk

```bash
brew --prefix openjdk
```

```bash
linkarzu.@.mini/usr/local/lib🔒 via ☕
[24/03/24 21:48:25]
❯ brew --prefix openjdk

/opt/homebrew/opt/openjdk
```

- Agregar esto al archivo .zshrc para habilitar java

```bash
export JAVA_HOME="/opt/homebrew/opt/openjdk"
export PATH="$JAVA_HOME/bin:$PATH"
```

- Cargar nuestro archivo .zshrc

```bash
source ~/.zshrc
```

- Después de esto java debería de estar instalado

```bash
java -version
```

```bash
linkarzu.@.mini/usr/local/lib🔒 via ☕ v21.0.2 took 7s
[24/03/24 21:52:14]
❯ java -version
openjdk version "21.0.2" 2024-01-16
OpenJDK Runtime Environment Homebrew (build 21.0.2)
OpenJDK 64-Bit Server VM Homebrew (build 21.0.2, mixed mode, sharing)
```

- Después descargo antlr

```bash
cd /usr/local/lib
sudo curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
```

- Tengo que agregar `antlr-4.13.1-complete.jar` a mi `CLASSPATH`

```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH"
```

- Crear aliases para ANTLR Tool y para TestRig en mi archivo .zshrc

```bash
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
```

### Instalar ANTRL en Windows

- Los pasos para instalarlo se
  [encuentran acá](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#windows)

### Instalar ANTLR en Linux

- Para instalar ANTLR se tienen que instalar los siguientes requerimientos desde
  PIP.

```bash
pip install antlr4-tools
```

- Con esto se instalaran los siguientes paquetes

```bash
pip show antlr4-tools
Name: antlr4-tools
Version: 0.2.1
Summary: Tools to run ANTLR4 tool and grammar interpreter/profiler
Home-page: http://www.antlr.org
Author: Terence Parr
Author-email: parrt@antlr.org
License: BSD
Location: /home/borellana/.local/lib/python3.11/site-packages
Requires: install-jdk
Required-by:
pip show antlr4-tools
Name: antlr4-tools
Version: 0.2.1
Summary: Tools to run ANTLR4 tool and grammar interpreter/profiler
Home-page: http://www.antlr.org
Author: Terence Parr
Author-email: parrt@antlr.org
License: BSD
Location: /home/borellana/.local/lib/python3.11/site-packages
Requires: install-jdk
Required-by:
```

### Creacion de la Gramatica en ANTLR

- Voy a crear el siguiente archivo `comandosDron.g4` con los comandos a
  continuación

```bash
mkdir -p ~/github/compiladores-proyecto
cd ~/github/compiladores-proyecto
touch comandosDron.g4
```

- Este archivo es en donde voy a especificar las reglas de gramática en formato
  ANTLR
- Acá está el contenido del archivo en donde paso mi gramática a formato ANTLR

```bash
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
```

- Una vez creado el archivo, voy a ejecutar antlr en el archivo

```bash
antlr4 comandosDron.g4
```

```bash
linkarzu.@.mini~/github/compiladores-proyecto
[24/03/24 22:11:54]
❯ antlr4 comandosDron.g4
```

- Notar todos los archivos que se generaron

```bash
linkarzu.@.mini~/github/compiladores-proyecto via ☕ v21.0.2
[24/03/24 22:45:28]
❯ ll
Permissions Size User     Group Date Modified Name
.rw-r--r--   902 linkarzu staff 24 Mar 22:45  comandosDron.g4
.rw-r--r--  1.3k linkarzu staff 24 Mar 22:45  comandosDron.interp
.rw-r--r--   290 linkarzu staff 24 Mar 22:45  comandosDron.tokens
.rw-r--r--  2.4k linkarzu staff 24 Mar 22:45  comandosDronBaseListener.java
.rw-r--r--  4.9k linkarzu staff 24 Mar 22:45  comandosDronLexer.interp
.rw-r--r--   10k linkarzu staff 24 Mar 22:45  comandosDronLexer.java
.rw-r--r--   290 linkarzu staff 24 Mar 22:45  comandosDronLexer.tokens
.rw-r--r--  1.6k linkarzu staff 24 Mar 22:45  comandosDronListener.java
.rw-r--r--   12k linkarzu staff 24 Mar 22:45  comandosDronParser.java
```

- Ahora voy a compilar los archivos generados

```bash
javac comandosDron*.java
```

```bash
linkarzu.@.mini~/github/compiladores-proyecto via ☕ v21.0.2
[24/03/24 22:13:52]
❯ javac comandosDron*.java
```

- Notar ahora los nuevos archivos generados

```bash
linkarzu.@.mini~/github/compiladores-proyecto via ☕ v21.0.2
[24/03/24 22:45:53]
❯ ll
Permissions Size User     Group Date Modified Name
.rw-r--r--   902 linkarzu staff 24 Mar 22:45  comandosDron.g4
.rw-r--r--  1.3k linkarzu staff 24 Mar 22:45  comandosDron.interp
.rw-r--r--   290 linkarzu staff 24 Mar 22:45  comandosDron.tokens
.rw-r--r--  1.5k linkarzu staff 24 Mar 22:45  comandosDronBaseListener.class
.rw-r--r--  2.4k linkarzu staff 24 Mar 22:45  comandosDronBaseListener.java
.rw-r--r--  5.9k linkarzu staff 24 Mar 22:45  comandosDronLexer.class
.rw-r--r--  4.9k linkarzu staff 24 Mar 22:45  comandosDronLexer.interp
.rw-r--r--   10k linkarzu staff 24 Mar 22:45  comandosDronLexer.java
.rw-r--r--   290 linkarzu staff 24 Mar 22:45  comandosDronLexer.tokens
.rw-r--r--   829 linkarzu staff 24 Mar 22:45  comandosDronListener.class
.rw-r--r--  1.6k linkarzu staff 24 Mar 22:45  comandosDronListener.java
.rw-r--r--  1.7k linkarzu staff 24 Mar 22:45  comandosDronParser$AccionContext.class
.rw-r--r--   963 linkarzu staff 24 Mar 22:45  comandosDronParser$CantidadContext.class
.rw-r--r--  1.2k linkarzu staff 24 Mar 22:45  comandosDronParser$ComandoContext.class
.rw-r--r--  1.1k linkarzu staff 24 Mar 22:45  comandosDronParser$DireccionContext.class
.rw-r--r--  7.8k linkarzu staff 24 Mar 22:45  comandosDronParser.class
.rw-r--r--   12k linkarzu staff 24 Mar 22:45  comandosDronParser.java
```

### Prueba de la gramatica con ANTLR

- De primero vamos a probar varios comandos mostrando los tokens reconocidos por
  nuestro analizador, para esto utilizamos la flag `-tokens`
- A continuación se muestran 7 comandos para probar:

```bash
echo 'ENCENDER_MOTOR' | grun comandosDron comando -tokens
```

```bash
echo 'ELEVARSE 10' | grun comandosDron comando -tokens
```

```bash
echo 'GIRAR DERECHA 90' | grun comandosDron comando -tokens
```

```bash
echo 'ROTAR ADELANTE 30' | grun comandosDron comando -tokens
```

```bash
echo 'BAJAR 5' | grun comandosDron comando -tokens
```

```bash
echo 'REGRESAR_BASE' | grun comandosDron comando -tokens
```

```bash
❯ echo 'ENCENDER_MOTOR' | grun comandosDron comando -tokens
[@0,0:13='ENCENDER_MOTOR',<'ENCENDER_MOTOR'>,1:0]
[@1,15:14='<EOF>',<EOF>,2:0]

❯ echo 'ELEVARSE 10' | grun comandosDron comando -tokens
[@0,0:7='ELEVARSE',<'ELEVARSE'>,1:0]
[@1,9:10='10',<NUMERO>,1:9]
[@2,12:11='<EOF>',<EOF>,2:0]

❯ echo 'GIRAR DERECHA 90' | grun comandosDron comando -tokens
[@0,0:4='GIRAR',<'GIRAR'>,1:0]
[@1,6:12='DERECHA',<'DERECHA'>,1:6]
[@2,14:15='90',<NUMERO>,1:14]
[@3,17:16='<EOF>',<EOF>,2:0]

❯ echo 'ROTAR ADELANTE 30' | grun comandosDron comando -tokens
[@0,0:4='ROTAR',<'ROTAR'>,1:0]
[@1,6:13='ADELANTE',<'ADELANTE'>,1:6]
[@2,15:16='30',<NUMERO>,1:15]
[@3,18:17='<EOF>',<EOF>,2:0]

❯ echo 'BAJAR 5' | grun comandosDron comando -tokens
[@0,0:4='BAJAR',<'BAJAR'>,1:0]
[@1,6:6='5',<NUMERO>,1:6]
[@2,8:7='<EOF>',<EOF>,2:0]

❯ echo 'REGRESAR_BASE' | grun comandosDron comando -tokens
[@0,0:12='REGRESAR_BASE',<'REGRESAR_BASE'>,1:0]
[@1,14:13='<EOF>',<EOF>,2:0]

❯ echo 'APAGAR_MOTOR' | grun comandosDron comando -tokens
[@0,0:11='APAGAR_MOTOR',<'APAGAR_MOTOR'>,1:0]
[@1,13:12='<EOF>',<EOF>,2:0]
```

---

- Esta otra prueba es para ver el árbol de análisis sintáctico, pero en modo de
  texto, utilizamos la flag `-tree`
- Acá dejamos 3 comandos para probar:

```bash
echo 'ENCENDER_MOTOR' | grun comandosDron comando -tree
```

```bash
echo 'GIRAR DERECHA 90' | grun comandosDron comando -tree
```

```bash
echo 'ROTAR ADELANTE 30' | grun comandosDron comando -tree
```

```bash
❯ echo 'ENCENDER_MOTOR' | grun comandosDron comando -tree
(comando (accion ENCENDER_MOTOR) <EOF>)
```

```bash
❯ echo 'GIRAR DERECHA 90' | grun comandosDron comando -tree
(comando (accion GIRAR (direccion DERECHA)) (parametro 90) <EOF>)
```

```bash
❯ echo 'ROTAR ADELANTE 30' | grun comandosDron comando -tree
(comando (accion ROTAR (direccion ADELANTE)) (parametro 30) <EOF>)
```

## Tarea 3: Arbol sintactico

### Participantes tarea 3

| Nombre         | Participación |
| -------------- | ------------- |
| Christian Arzu | 100%          |
| Bryan Orellana | 100%          |

### Descripcion tarea 3

- Elabore el árbol sintáctico para cada una de las instrucciones de la gramática
  de su proyecto.
- Utilice entradas a manera de ejemplo de la gramática que ha diseñado para su
  proyecto.

### Resumen tarea 3

- Vamos a realizar un arbol sintactico para cada una de las acciones del
  lenguaje creado, para esto vamos a usar las una flag de grun la cual validara
  graficamente el arbol con la entrada que ingresemos `-gui`

### Creacion arboles sintacticos

```bash
echo 'ENCENDER_MOTOR' | grun comandosDron comando -gui
```

<div align="center">
  <img
    src="https://github.com/linkarzu/umg-compiladores-proyecto/blob/master/imagenes/arbol-sintactico/01-ENCENDER_MOTOR.png?raw=true"
    alt=""
    width="400"
  />
</div>

---

```bash
echo 'APAGAR_MOTOR' | grun comandosDron comando -gui
```

<div align="center">
  <img
    src="https://github.com/linkarzu/umg-compiladores-proyecto/blob/master/imagenes/arbol-sintactico/02-APAGAR_MOTOR.png?raw=true"
    alt=""
    width="400"
  />
</div>

---

```bash
echo 'GIRAR DERECHA 90' | grun comandosDron comando -gui
```

<div align="center">
  <img
    src="https://github.com/linkarzu/umg-compiladores-proyecto/blob/master/imagenes/arbol-sintactico/03-GIRAR-DERECHA-90.png?raw=true"
    alt=""
    width="400"
  />
</div>

---

```bash
echo 'ELEVARSE 10' | grun comandosDron comando -gui
```

<div align="center">
  <img
    src="https://github.com/linkarzu/umg-compiladores-proyecto/blob/master/imagenes/arbol-sintactico/04-ELEVARSE-10.png?raw=true"
    alt=""
    width="400"
  />
</div>

---

```bash
echo 'BAJAR 5' | grun comandosDron comando -gui
```

<div align="center">
  <img
    src="https://github.com/linkarzu/umg-compiladores-proyecto/blob/master/imagenes/arbol-sintactico/05-BAJAR-5.png?raw=true"
    alt=""
    width="400"
  />
</div>

---

```bash
echo 'ROTAR IZQUIERDA 30' | grun comandosDron comando -gui
```

<div align="center">
  <img
    src="https://github.com/linkarzu/umg-compiladores-proyecto/blob/master/imagenes/arbol-sintactico/06-ROTAR-IZQUIERDA-30.png?raw=true"
    alt=""
    width="400"
  />
</div>

---

```bash
echo 'REGRESAR_BASE' | grun comandosDron comando -gui
```

<div align="center">
  <img
    src="https://github.com/linkarzu/umg-compiladores-proyecto/blob/master/imagenes/arbol-sintactico/07-REGRESAR-BASE.png?raw=true"
    alt=""
    width="400"
  />
</div>
