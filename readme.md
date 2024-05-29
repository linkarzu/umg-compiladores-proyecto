# Contenido

<!-- toc -->

- [Descripcion del proyecto](#descripcion-del-proyecto)
- [Tarea 1: Definir la gramatica del proyecto](#tarea-1-definir-la-gramatica-del-proyecto)
  * [Participantes tarea 1](#participantes-tarea-1)
  * [Descripcion tarea 1](#descripcion-tarea-1)
  * [Resumen tarea 1](#resumen-tarea-1)
  * [Creacion de tokens](#creacion-de-tokens)
  * [Creacion de la sintaxis](#creacion-de-la-sintaxis)
  * [Ejemplos de la sintaxis](#ejemplos-de-la-sintaxis)
- [Tarea 2: Instalar herramienta generacion compiladores](#tarea-2-instalar-herramienta-generacion-compiladores)
  * [Participantes tarea 2](#participantes-tarea-2)
  * [Descripcion tarea 2](#descripcion-tarea-2)
  * [Resumen tarea 2](#resumen-tarea-2)
  * [Instalar ANTLR en macOS](#instalar-antlr-en-macos)
  * [Instalar ANTRL en Windows](#instalar-antrl-en-windows)
  * [Instalar ANTLR en Linux](#instalar-antlr-en-linux)
  * [Creacion de la Gramatica en ANTLR](#creacion-de-la-gramatica-en-antlr)
  * [Prueba de la gramatica con ANTLR](#prueba-de-la-gramatica-con-antlr)
- [Tarea 3: Arbol sintactico](#tarea-3-arbol-sintactico)
  * [Participantes tarea 3](#participantes-tarea-3)
  * [Descripcion tarea 3](#descripcion-tarea-3)
  * [Resumen tarea 3](#resumen-tarea-3)
  * [Creacion arboles sintacticos](#creacion-arboles-sintacticos)
- [Tarea 4: Analisis semantico errores](#tarea-4-analisis-semantico-errores)
  * [Participantes tarea 4](#participantes-tarea-4)
  * [Descripcion tarea 4](#descripcion-tarea-4)
  * [Resumen tarea 4](#resumen-tarea-4)
  * [Descripcion de errores semanticos](#descripcion-de-errores-semanticos)
  * [Casos que NO son errores semanticos (pero parecen)](#casos-que-no-son-errores-semanticos-pero-parecen)
- [Tarea 5: Entrega Final](#tarea-5-entrega-final)
  * [Participantes tarea 5](#participantes-tarea-5)
  * [Descripcion tarea 5](#descripcion-tarea-5)
  * [Herramienta utilizada y porque](#herramienta-utilizada-y-porque)
  * [Gramatica del lenguaje](#gramatica-del-lenguaje)
  * [Evidencias de la ejecucion](#evidencias-de-la-ejecucion)

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
  - Esto lo tengo que agregar a mi archivo .zshrc

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
    // 'GIRAR' requiere una dirección y una cantidad
    | GIRAR direccion cantidad
    | ELEVARSE cantidad
    | BAJAR cantidad
    // 'ROTAR' requiere una dirección y una cantidad
    | ROTAR direccion cantidad
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

## Tarea 4: Analisis semantico errores

### Participantes tarea 4

| Nombre         | Participación |
| -------------- | ------------- |
| Christian Arzu | 100%          |
| Bryan Orellana | 100%          |

### Descripcion tarea 4

- Describa los errores semánticos que podrían darse en la gramática definida
  para su proyecto.
- Describa el manejo de errores para los errores identificados en el inciso
  anterior.
- No olvidar colocar la producción correspondiente de la gramática.

### Resumen tarea 4

- Esta tarea no nos pide arreglar errores semánticos, sino que nos pide
  describir los posibles errores que podríamos encontrar y cómo los
  manejaríamos. Por lo que incluímos una lista de los posibles errores y la
  forma de solucionarlos

### Descripcion de errores semanticos

- Como hemos en visto en las últimas sesiones en la clase, los errores
  semánticos son los que tienen instrucciones sintácticamente válidas, pero
  carecen de coherencia por lo que no es posible ejecutarlas.
- En nuestro proyecto de drones, esto significaría ingresar comandos válidos al
  dron, como por ejemplo tratar de mover el dron si está apagado.
  - El comando para mover el dron es válido, pero por lógica, sabemos que no
    podemos mover el dron si está apagado.
- A continuación, describimos algunos errores semánticos posibles y cómo
  manejarlos para la gramática definida:

---

- 1. Comando de movimiento sin motor encendido
  - **Producción gramatical**: `<comando> ::= <accion>`
  - **ERROR SEMÁNTICO**: Ejecutar cualquier acción de movimiento (`GIRAR`,
    `ELEVARSE`, `BAJAR`, `ROTAR`, `REGRESAR_BASE`) cuando el motor está apagado.
  - **Manejo del error**: Antes de ejecutar un comando de movimiento, verificar
    si el motor está encendido. Si no, generar un error específico:
    - `Motor apagado: No se puede ejecutar el comando <comando>.`

---

- 2. Encender un motor ya encendido
  - **Producción gramatical**: `<accion> ::= ENCENDER_MOTOR`
  - **ERROR SEMÁNTICO**: Intentar encender el motor cuando ya está encendido.
  - **Manejo del error**: Mantener un estado del motor dentro del sistema. Si se
    envía el comando `ENCENDER_MOTOR` y el motor ya está encendido, generar un
    error:
    - `Motor ya encendido.`

---

- 3. Apagar un motor ya apagado
  - **Producción gramatical**: `<accion> ::= APAGAR_MOTOR`
  - **ERROR SEMÁNTICO**: Intentar apagar el motor cuando ya está apagado.
  - **Manejo del error**: Si se envía el comando `APAGAR_MOTOR` y el motor está
    apagado, generar un error:
    - `Motor ya apagado.`

---

- 4. Comando `REGRESAR_BASE` ejecutado sin condiciones adecuadas
  - **Producción gramatical**: `<accion> ::= REGRESAR_BASE`
  - **ERROR SEMÁNTICO**: Ejecutar el comando `REGRESAR_BASE` sin haber realizado
    movimientos previos o sin estar en modo de vuelo activo.
  - **Manejo del error**: Validar que se hayan realizado movimientos previos o
    que el dron esté en un estado adecuado para regresar a la base. Si no,
    emitir un error:
    - `Operación no válida: No se puede regresar a la base sin haberse movido`

---

- 5. Bajar más de lo que se ha subido
  - **Producción gramatical**: `<accion> ::= BAJAR <cantidad>`
  - **ERROR SEMÁNTICO**: Intentar bajar el dron una cantidad mayor a la que
    previamente se elevó.
  - **Manejo del error**: Verificar la altura actual del dron antes de permitir
    un movimiento descendente. Si la cantidad a bajar supera la altura acumulada
    por ascensos previos, generar un error:
    - `Operación no válida: Intento de bajar más de lo ascendido. Altura máxima excedida.`

---

- 6. Mover el dron más allá de sus límites operativos
  - **Producción gramatical**:
    - `<accion> ::= GIRAR <direccion> <cantidad>`
    - `ELEVARSE <cantidad>`
    - `ROTAR <direccion> <cantidad>`
  - **ERROR SEMÁNTICO**: Intentar mover el dron en cualquier dirección más allá
    de los límites físicos o de seguridad establecidos.
  - **Manejo del error**: Antes de ejecutar movimientos, verificar que las
    dimensiones del movimiento no excedan los límites establecidos. Si se
    intenta un movimiento que excede estos límites, emitir un error:
    - `Operación no válida: Movimiento excede los límites seguros del dron.`

---

- 7. Mover el dron en una cantidad no válida
  - **Producción gramatical**:
    - `<accion> ::= GIRAR <direccion> <cantidad>`
    - `ROTAR <direccion> <cantidad>`
    - `ELEVARSE <cantidad>`
    - `BAJAR <cantidad>`
  - **ERROR SEMÁNTICO**: Intentar mover el dron una cantidad negativa o cero
    grados.
  - **Manejo del error**: Validar que la cantidad especificada para mover el
    dron sea mayor a cero. Si se ingresa una cantidad no válida, generar un
    error:
    - `Operación no válida: La cantidad para mover el dron debe ser mayor a cero.`

---

### Casos que NO son errores semanticos (pero parecen)

- Uso de valores no numéricos en comandos que requieren números
  - Esto no es un ERROR SEMÁNTICO, ya que nuestra gramática especificamente
    solicita que la cantidad sea un número
- Comando `GIRAR` o `ROTAR` sin especificación de dirección o cantidad
  - Esto no es un ERROR SEMÁNTICO, ya que la gramática solicita que se ingrese
    una dirección y cantidad al ingresar cualquiera de los comandos GIRAR o
    ROTAR

## Tarea 5: Entrega Final

### Participantes tarea 5

| Nombre         | Participación |
| -------------- | ------------- |
| Christian Arzu | 100%          |
| Bryan Orellana | 100%          |

### Descripcion tarea 5

- Elaborar un compilador para un lenguaje que permita controlar un DRON.
- Presentar el proyecto con el siguiente contenido:
  - Herramienta utilizada y ¿por qué?
  - Gramática del lenguaje
  - Reglas semánticas más importantes
  - Evidencias de la ejecución

### Herramienta utilizada y porque

- Como vimos en clase, y citamos textualmente
- "Herramientas para construir y desarrollar compiladores, las cuales están
  especializadas en las diferentes fases del proceso de compilación."
- | Tradicionales | Nueva generación |
  | ------------- | ---------------- |
  | Goldparser    | ANTLR            |
  | Yacc          | JAVACC           |
  | Cup           |                  |
- No todos en el grupo utilizamos el mismo sistema operativo, algunos utilizan
  macOS otros windows, otros Linux por lo que estuvimos buscando una herramienta
  compatible para varios sistemas operativos y que fuera fácil de utilizar
- Después de investigar y comparar las diferentes opciones, decidimos utilizar
  ANTLR (ANother Tool for Language Recognition) por las siguientes razones:
  - Es una herramienta de nueva generación ampliamente utilizada y la
    documentación que encontramos es buena.
  - Tiene soporte multiplataforma, cosa que era muy importante y nos permite
    trabajar en diferentes sistemas operativos sin problemas de compatibilidad.
  - Ofrece integración con varios lenguajes de programación, incluyendo Java,
    que es el lenguaje que estamos utilizando para este proyecto.

### Gramatica del lenguaje

- Partiendo de la gramática original que se encuentra en el archivo
  `comandosDron.g4` que se muestra a continuación

```java
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

- Vamos a hacer modificaciones para agregar la lógica de las reglas semánticas y
  acciones personalizadas utilizando un listener.
- Esto permitirá realizar validaciones y ejecutar acciones específicas para cada
  comando reconocido por la gramática
- Con los cambios realizados, el archivo `comandosDron.g4` queda de la siguiente
  manera:

```java
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
```

- Después creamos la clase `DroneContext` que representa el contexto del dron y
  contiene la información relevante
- Para esto creamos el archivo `DroneContext.java` en el directorio principal

```java
public class DroneContext {
    private boolean motorEncendido = false;
    private int alturaActual = 0;

    public boolean getMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public int getAlturaActual() {
        return alturaActual;
    }

    public void setAlturaActual(int alturaActual) {
        this.alturaActual = alturaActual;
    }
}
```

- Después creamos la clase `DroneListener` que extiende la clase base generada
  por ANTLR (`comandosDronBaseListener`) y define el método `exitAccion` para
  implementar las reglas semánticas y las acciones personalizadas
  - Para esto creamos el archivo `DroneListener.java` en el directorio principal

```java
public class DroneListener extends comandosDronBaseListener {
    private DroneContext droneContext;

    public DroneListener(DroneContext droneContext) {
        this.droneContext = droneContext;
    }

    @Override
    public void exitAccion(comandosDronParser.AccionContext ctx) {
        if (ctx.ENCENDER_MOTOR() != null) {
            encenderMotor();
        } else if (ctx.APAGAR_MOTOR() != null) {
            apagarMotor();
        } else if (ctx.ELEVARSE() != null) {
            elevarse(ctx.cantidad().getText());
        } else if (ctx.BAJAR() != null) {
            bajar(ctx.cantidad().getText());
        } else if (ctx.GIRAR() != null) {
            girar(ctx.direccionGiro().getText(), ctx.cantidad().getText());
        } else if (ctx.ROTAR() != null) {
            rotar(ctx.direccionRotacion().getText(), ctx.cantidad().getText());
        } else if (ctx.REGRESAR_BASE() != null) {
            regresarBase();
        } else if (ctx.HELP() != null) {
            mostrarAyuda();
        } else if (ctx.STATUS() != null) {
            mostrarEstado();

    }
        // System.out.println("Comando procesado: " + ctx.getText());
    }

    private void encenderMotor() {
        if (droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: El motor ya está encendido.");
        } else {
            droneContext.setMotorEncendido(true);
            System.out.println("Motor encendido");
        }
    }

    private void apagarMotor() {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: El motor ya está apagado.");
        } else {
            if (droneContext.getAlturaActual() != 0) {
                int alturaActual = droneContext.getAlturaActual();
                System.out.println("ERROR SEMÁNTICO: No se puede apagar el motor si el dron no está en la base. Altura actual: " + alturaActual + " unidades.");
            } else {
                droneContext.setMotorEncendido(false);
                System.out.println("Motor apagado");
            }
        }
    }

    private void elevarse(String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede elevar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            int nuevaAltura = droneContext.getAlturaActual() + cantidad;
            if (nuevaAltura > 300) {
                System.out.println("ERROR SEMÁNTICO: No se puede elevar el dron por encima de 300 unidades.");
            } else {
                droneContext.setAlturaActual(nuevaAltura);
                System.out.println("El dron se elevó " + cantidad + " unidades.");
            }
        }
    }

    private void bajar(String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede bajar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            int nuevaAltura = droneContext.getAlturaActual() - cantidad;
            if (nuevaAltura < 0) {
                System.out.println("ERROR SEMÁNTICO: No se puede bajar el dron por debajo de la altura cero.");
            } else {
                droneContext.setAlturaActual(nuevaAltura);
                System.out.println("El dron bajó " + cantidad + " unidades.");
            }
        }
    }

    private void girar(String direccionGiro, String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede girar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            System.out.println("Giró " + cantidad + " grados hacia " + direccionGiro + ".");
        }
    }

    private void rotar(String direccionRotacion, String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede rotar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            System.out.println("Rotó " + cantidad + " metros hacia " + direccionRotacion + ".");
        }
    }

    private void regresarBase() {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede regresar a la base con el motor apagado.");
        } else {
            System.out.println("El dron está regresando a la base.");
            droneContext.setAlturaActual(0);
        }
    }

    private void mostrarAyuda() {
      System.out.println("comandos disponibles:");
      System.out.println("- encender_motor");
      System.out.println("- apagar_motor");
      System.out.println("- elevarse <cantidad>");
      System.out.println("- bajar <cantidad>");
      System.out.println("- girar <direccionGiro> <cantidad>");
      System.out.println("  - girar derecha|izquierda grados");
      System.out.println("  - girar derecha 90");
      System.out.println("  - Gira el dron 90 grados hacia la derecha");
      System.out.println("- rotar <direccionRotacion> <cantidad>");
      System.out.println("  - rotar adelante|atras metros");
      System.out.println("  - rotar adelante 30");
      System.out.println("  - mueve el dron 30 metros hacia adelante");
      System.out.println("- regresar_base");
      System.out.println("- help");
    }

    private void mostrarEstado() {
        String estado = droneContext.getMotorEncendido() ? "Encendido" : "Apagado";
        int alturaActual = droneContext.getAlturaActual();

        System.out.println("Estado del dron:");
        System.out.println("- Motor: " + estado);
        System.out.println("- Altura actual: " + alturaActual + " unidades");
    }
}
```

- Después creamos la clase principal `Main` donde se instancia el lexer, el
  parser, el listener y se procesa la entrada
  - Para esto creamos el archivo `Main.java` en el directorio principal

```java
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DroneContext droneContext = new DroneContext();
        DroneListener droneListener = new DroneListener(droneContext);

        while (true) {
            System.out.print("> ");
            String input = reader.readLine();
            if (input == null || input.equals("exit")) {
                break;
            }

            ANTLRInputStream antlrInput = new ANTLRInputStream(input);
            comandosDronLexer lexer = new comandosDronLexer(antlrInput);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            comandosDronParser parser = new comandosDronParser(tokens);
            ParseTree tree = parser.comando();

            ParseTreeWalker.DEFAULT.walk(droneListener, tree);

            // Agregamos una linea en blanco entre comandos
            System.out.println();
        }
    }
}
```

- Después de esto generamos los archivos de parser y lexer a partir del archivo
  de la gramática
- Compilamos todos los archivos Java, incluyendo los generados por ANTLR y los
  que creamos (DroneContext.java, DroneListener.java y Main.java)
- **Cada vez que relizamos cambios, compilamos con estos 2 comandos**

```bash
antlr4 comandosDron.g4
javac *.java
```

- Una vez que la compilación sea exitosa, ejecutamos la clase `Main` utilizando
  el comando java

```java
java Main
```

### Evidencias de la ejecucion

```bash
❯ java Main

> status
Estado del dron:
- Motor: Apagado
- Altura actual: 0 unidades

> help
comandos disponibles:
- encender_motor
- apagar_motor
- elevarse <cantidad>
- bajar <cantidad>
- girar <direccionGiro> <cantidad>
  - girar derecha|izquierda grados
  - girar derecha 90
  - Gira el dron 90 grados hacia la derecha
- rotar <direccionRotacion> <cantidad>
  - rotar adelante|atras metros
  - rotar adelante 30
  - mueve el dron 30 metros hacia adelante
- regresar_base
- help

> apagar_motor
ERROR SEMÁNTICO: El motor ya está apagado.

> encender_motor

Motor encendido
> status
Estado del dron:
- Motor: Encendido
- Altura actual: 0 unidades

> elevarse 400
ERROR SEMÁNTICO: No se puede elevar el dron por encima de 300 unidades.

> status
Estado del dron:
- Motor: Encendido
- Altura actual: 0 unidades

> elevarse 299
El dron se elevó 299 unidades.

> status
Estado del dron:
- Motor: Encendido
- Altura actual: 299 unidades
> elevarse 2

ERROR SEMÁNTICO: No se puede elevar el dron por encima de 300 unidades.

> status
Estado del dron:
- Motor: Encendido
- Altura actual: 299 unidades

> regresar_base
El dron está regresando a la base.

> status
Estado del dron:
- Motor: Encendido
- Altura actual: 0 unidades

> apagar_motor
Motor apagado

> eeeencender_motor
line 1:0 token recognition error at: 'ee'
line 1:2 token recognition error at: 'ee'
line 1:4 token recognition error at: 'n'
line 1:5 token recognition error at: 'c'
line 1:6 token recognition error at: 'end'
line 1:9 token recognition error at: 'er'
line 1:11 token recognition error at: '_'
line 1:12 token recognition error at: 'm'
line 1:13 token recognition error at: 'o'
line 1:14 token recognition error at: 't'
line 1:15 token recognition error at: 'o'
line 1:16 token recognition error at: 'r'
line 1:17 mismatched input '<EOF>' expecting {'help', 'status', 'encender_motor', 'apagar_motor', 'girar', 'elevarse', 'bajar', 'rotar', 'regresar_base'}
```
