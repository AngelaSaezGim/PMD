USAR EXTENSION MARKDOWN PREVIEW -
USAR EXTENSIÓN MARKDOWN ALL IN ONE

Poner;

/**
 \* Descripcion programa
 \* 
 \* @author Angela
 \* @version 1.0
 */

 /**
 \* Descripcion Funcion
 \* @param nombreParametro descripcion
 \* @return devuelve el resultado descripcion
 */

# GUIA KOTLIN

## Índice
- [GUIA KOTLIN](#guia-kotlin)
  - [Índice](#índice)
  - [1. Variables](#1-variables)
    - [1.1 Declaración](#11-declaración)
    - [1.2 Tipos de variables](#12-tipos-de-variables)
      - [1.3 Mutabilidad en val](#13-mutabilidad-en-val)
      - [1.4 Const](#14-const)
      - [1.5 Type Inference](#15-type-inference)
      - [1.6 Variables Any](#16-variables-any)
        - [1.6.1 Uso Unit](#161-uso-unit)
  - [2. Strings y Caracteres](#2-strings-y-caracteres)
    - [2.1 Atajos de caracteres](#21-atajos-de-caracteres)
    - [2.2 String templates y raw Strings](#22-string-templates-y-raw-strings)
      - [2.1.1 String template](#211-string-template)
      - [2.1.2 Raw string](#212-raw-string)
  - [3. User input](#3-user-input)
  - [4. Operaciones y Números](#4-operaciones-y-números)
    - [4.1 Operaciones Básicas](#41-operaciones-básicas)
    - [4.2 Math Library](#42-math-library)
  - [5. Arrays](#5-arrays)
    - [5.1 Declaración de Arrays](#51-declaración-de-arrays)
      - [5.1.1 Declaración Básica](#511-declaración-básica)
      - [5.1.2 Size + Lambda](#512-size--lambda)
      - [5.1.3 it y -it](#513-it-y--it)
    - [5.2 Uso Arrays](#52-uso-arrays)
    - [5.3 Arrays multidimensionales](#53-arrays-multidimensionales)
  - [6. Conversión de tipos](#6-conversión-de-tipos)
  - [7. Null Safety](#7-null-safety)
    - [7.1 Símbolo ?](#71-símbolo-)
    - [7.2 Operador Elvis ?:](#72-operador-elvis-)
    - [7.3 Operador !!](#73-operador-)
  - [8. Expresiones Regulares](#8-expresiones-regulares)
    - [8.1 clase Regex](#81-clase-regex)
    - [8.2 Reglas de Construcción](#82-reglas-de-construcción)
      - [8.2.1 Agrupación](#821-agrupación)
      - [8.2.2 Cantidad de caracteres](#822-cantidad-de-caracteres)
      - [8.2.3 Inicio – fin](#823-inicio--fin)
      - [8.2.4 Otros](#824-otros)
    - [8.3 Ejemplo Uso Regex](#83-ejemplo-uso-regex)
  - [9. Excepciones](#9-excepciones)
  - [10. Control de flujo](#10-control-de-flujo)
    - [10.1 Guia estilo llaves {}](#101-guia-estilo-llaves-)
    - [10.2 when](#102-when)
      - [10.2.1 Uso in o !in](#1021-uso-in-o-in)
      - [10.2.2 Uso is o !is](#1022-uso-is-o-is)
    - [10.3 for - Rangos y Progresiones](#103-for---rangos-y-progresiones)
      - [10.3.1 Crear rangos y progresiones](#1031-crear-rangos-y-progresiones)
      - [10.3.2 Keyword in](#1032-keyword-in)
      - [10.3.3 Iterator](#1033-iterator)
    - [10.4 while y do-while](#104-while-y-do-while)
    - [10.5 repeat](#105-repeat)
    - [10.6 break, continue y return](#106-break-continue-y-return)
  - [11. Colecciones](#11-colecciones)
    - [11.1 Operaciones generales sobre Colecciones](#111-operaciones-generales-sobre-colecciones)
      - [11.1.1 Return Coleccion](#1111-return-coleccion)
    - [11.2 Tipos de colecciones](#112-tipos-de-colecciones)
    - [11.3 Mutables e Inmutables](#113-mutables-e-inmutables)
    - [11.4 List](#114-list)
      - [11.4.1 List Normal](#1141-list-normal)
      - [11.4.2 List Mutable](#1142-list-mutable)
      - [11.4.3 Operaciones List](#1143-operaciones-list)
      - [11.4.4 Operaciones MutableList (las que modifican)](#1144-operaciones-mutablelist-las-que-modifican)
    - [11.5 Set](#115-set)
      - [11.5.1 Set Normal](#1151-set-normal)
      - [11.5.2 Set Mutable](#1152-set-mutable)
      - [11.5.3 Operaciones Set](#1153-operaciones-set)
      - [11.5.4 Operaciones MutableSet (las que modifican)](#1154-operaciones-mutableset-las-que-modifican)
    - [11.6 Map](#116-map)
      - [11.6.1 Map normal](#1161-map-normal)
      - [11.6.2 Map Mutable](#1162-map-mutable)
      - [11.6.3 Operaciones Map](#1163-operaciones-map)
      - [11.6.4 Operaciones MutableMap(las que modifican)](#1164-operaciones-mutablemaplas-que-modifican)
  - [12. Funciones](#12-funciones)
    - [12.1 Built-in functions](#121-built-in-functions)
    - [12.2 Declarar y llamar funciones](#122-declarar-y-llamar-funciones)
    - [12.3 Parámetros](#123-parámetros)
      - [12.3.1 Trailing coma](#1231-trailing-coma)
      - [12.3.2 Parámetros de entrada Inmutables](#1232-parámetros-de-entrada-inmutables)
      - [12.3.3 Llaves y Funciones](#1233-llaves-y-funciones)
      - [12.3.4 Llamada función con nombres](#1234-llamada-función-con-nombres)
      - [12.3.5 Valor por defecto parámetros](#1235-valor-por-defecto-parámetros)
      - [12.3.6 Declarar número variable de parámetros](#1236-declarar-número-variable-de-parámetros)
      - [12.3.7 Sobrecarga de funciones](#1237-sobrecarga-de-funciones)
    - [12.4 Ámbito y tipo de las funciones](#124-ámbito-y-tipo-de-las-funciones)
      - [12.4.1 Nivel Superior (top level)](#1241-nivel-superior-top-level)
      - [12.4.2 Local](#1242-local)
      - [12.4.3 Miembro](#1243-miembro)
      - [12.4.4 De extensión](#1244-de-extensión)
      - [12.4.5 Ambito de funciones y Sobrecarga](#1245-ambito-de-funciones-y-sobrecarga)
  - [13. Programación Orientada a Objetos](#13-programación-orientada-a-objetos)
    - [13.1. Definición de clase en Kotlin](#131-definición-de-clase-en-kotlin)
      - [13.1.1. Clase Any](#1311-clase-any)
    - [13.2. Getters y Setters](#132-getters-y-setters)
    - [13.3. Contructores](#133-contructores)
      - [13.3.1. Usar más de un constructor](#1331-usar-más-de-un-constructor)
      - [13.3.2. Sin constructor](#1332-sin-constructor)
      - [13.3.3 init y constructores](#1333-init-y-constructores)
    - [13.4. Visibilidad en clases](#134-visibilidad-en-clases)
      - [13.4.1. private set y private get](#1341-private-set-y-private-get)
    - [13.5 Modificador estático - companion object](#135-modificador-estático---companion-object)
    - [13.6 Funciones Miembro (Métodos)](#136-funciones-miembro-métodos)
      - [13.6.1 Override en funciones](#1361-override-en-funciones)
    - [13.7. Singleton](#137-singleton)
    - [13.8. Herencia - open class](#138-herencia---open-class)
    - [13.9. Clases Abstractas](#139-clases-abstractas)
      - [13.9.1 abstract](#1391-abstract)
  - [14. Enum y Data class](#14-enum-y-data-class)
    - [14.1 Enum class](#141-enum-class)
    - [14.2 Data class](#142-data-class)
      - [14.2.1 Uso Copy](#1421-uso-copy)
      - [14.2.2 Deconstruir Data Class \_](#1422-deconstruir-data-class-_)
  - [15. Funciones Específicas Kotlin](#15-funciones-específicas-kotlin)
    - [15.1 Funciones de Extensión](#151-funciones-de-extensión)
      - [15.1.1 Funciones de Extensión y funciones miembro](#1511-funciones-de-extensión-y-funciones-miembro)
    - [15.2 Funciones de Alcance](#152-funciones-de-alcance)
      - [15.2.1 let](#1521-let)
      - [15.2.2 run](#1522-run)
      - [15.2.3 also](#1523-also)
      - [15.2.4 apply](#1524-apply)
      - [15.2.5 with](#1525-with)
    - [15.3 Funciones Lambda](#153-funciones-lambda)
      - [15.3.1. Funciones flecha](#1531-funciones-flecha)
      - [15.3.2. Utilidad y Sintaxis Lambdas;](#1532-utilidad-y-sintaxis-lambdas)
      - [15.3.3. Crear funciones callback](#1533-crear-funciones-callback)
      - [15.3.4. Devolver diferentes respuestas desde una función](#1534-devolver-diferentes-respuestas-desde-una-función)
      - [15.3.5. Ofrecer al programador que introduzca su propia lógica](#1535-ofrecer-al-programador-que-introduzca-su-propia-lógica)


## 1. Variables

### 1.1 Declaración
- **Con valor:** 
```kotlin
var variableName: Type = value
```

- **Sin inicializar:** 
```kotlin
var variableName: Type
```

### 1.2 Tipos de variables
- **Mutable:** 
```kotlin
`var variableName: Type = value`
```
- **Inmutable:** 
```kotlin
`val variableName: Type = value`
```

#### 1.3 Mutabilidad en val
*Sí que se pueden asignar durante la ejecución del programa ej tras pedir un dato al usuario
```kotlin
val age: Int
age = readln().toInt()
```

*No puedes cambiar la instancia que almacena - pero SÍ cambiar valores
```kotlin
val numbers = arrayof(1, 2, 3, 4, 0)
numbers[4] = 5 // Se puede cambiar el contenido de los elementos
```
~numbers = array0f(1, 2) ~

#### 1.4 Const
Se puede usar la palabra reservada const = declarar constantes de valores conocidos
```kotlin
const val PI = 3.1416 //Deben estar fuera de las funciones (no asignadas en ejecución)
```
*Sí se pueden declarar en objetos singleton
```kotlin
object Constants {
const val PI = 3.1416 
}
```

#### 1.5 Type Inference
El compilador puede "adivinar" el tipo de la variable
```kotlin
var lightsOn: Boolean = true
var lightsOn = true
```

#### 1.6 Variables Any

Super Clase Any (Java Object)
*Se puede declarar una variable indicando el tipo Any y luego asignar cualquier tipo de dato.
```kotlin
var number: Any = 6
var name: Any = "Rick Sanchez"
```

##### 1.6.1 Uso Unit
Para poder usar una variable esta DEBE almacenar un valor
¿Y si la queremos dejar vacía? = USO Any + Unit (Java void)
```kotlin
val variable2: Any = Unit
println("valor de variable: $variable2") // Funciona correctamente
```
## 2. Strings y Caracteres

### 2.1 Atajos de caracteres

| Atajo | Significado              |
| ----- | ------------------------ |
| \t    | Tabulación               |
| \b    | Retroceso                |
| \r    | Retorno de carro         |
| \n    | Salto de línea           |
| \ '   | Retorno de carro (junto) |
| \ '   | Apostrofe (junto)        |
| \ "   | Comilla doble (junto)    |
| \ \   | Backslash (junto)        |
| \ $   | Símbolo de dólar         |

### 2.2 String templates y raw Strings 

* Se recomienda siempre el uso de string templates y de raw strings. - concatenar NO
* Evitar el uso de varias instrucciones seguidas con println.

#### 2.1.1 String template

```kotlin
println("Hello, $variableName!")
```
--> Si variable es un objeto o se quiere operar con ella se debe envolver en llaves { }
```kotlin
  println("is ${product.price})
  println("is ${notebookPrice + penPrice})
 ```

#### 2.1.2 Raw string

Con las triples comillas dobles la cadena admite saltos de línea naturales
```kotlin
println("""|A veces no soy yo 
|Busco un 
disfraz mejor""".trimMargin())
```

*por defecto(|)
*eliminar los espacios en blanco del principio y del final y los márgenes de la izquierda -.trimMargin()

## 3. User input

```kotlin
var name = readLine()
```

## 4. Operaciones y Números

### 4.1 Operaciones Básicas

```kotlin
println("The product of 6 and 2, is ${6 * 2}") 
```

*Kotlin permite el uso del carácter guion bajo en los literales numéricos ej 2_0

| Significado | Operación        |
| ----------- | ---------------- |
| Add         | a = a + b	a += b |
| Subtract    | a = a - b	a -= b |
| Multiply    | a = a * b	a *= b |
| Divide      | a = a / b	a /= b |
| Mod         | a = a % b	a %= b |

### 4.2 Math Library

```kotlin
Math.pow(5.0, 3.0) // 125.0
Math.min(5, 3) // 3
Math.random() // 0.3335735290527727 /between 0 and 1
Math.round(15.7) // 16
```

## 5. Arrays

### 5.1 Declaración de Arrays

#### 5.1.1 Declaración Básica

```kotlin
var numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
var names = arrayOf("Rick", "Morty", "Summer")
```

#### 5.1.2 Size + Lambda

*Se puede usar constructor size + lambda
```kotlin
var array = Array(10) { } // array de 10 elementos vacios (Unit)
var emptys = Array(5) { "" } // array de 5 cadenas todas ""
```

#### 5.1.3 it y -it

```kotlin
var serie = Array(100) {it} // array de 100 enteros: 0, 1, 2 .. 99
var reverse = Array( 50) {50-it} // array de 50 enteros: 50, 49, 48 .. 0
```

### 5.2 Uso Arrays

Uso corchetes [] - get y set NO 
```kotlin
printin(numbers[1]) - numbers[3] = 12
println("Hay ${names.size} nombres");
```

### 5.3 Arrays multidimensionales
```kotlin
    val matrix  = arrayOf(
        arrayOf(5, 3, 2, 0),
        arrayOf (4, 9, 4, 5),
        arrayOf(8, 1, 7, 6)
    )
```
*Recorrerlo o cambiar valores
```kotlin
 matrix[1][3] = 8

    for (row in matrix) {
        for (column in row) {
            print("$column ")
        }
        println()
    }
```

Output;

5 3 2 0 
4 9 4 8 
8 1 7 6 

*con función
```kotlin
// Matriz de 6x5 cadenas inicializadas a ""
var matrix0fStrings = Array(6) {Array(5) { "" } }
```


## 6. Conversión de tipos

| Conversiones |
| ------------ |
| toDouble()   |
| toFloat()    |
| toLong()     |
| toInt()      |
| toChar()     |
| toShort()    |
| toByte()     |
| toString()   |

*con readln()
```kotlin
readln().toInt()
```

## 7. Null Safety 

Error = NullPointerException = no inicialización objeto
*Por defecto kotlin no permite asignar null (evitar ese error) -
```kotlin
var name:String = null //error
```

Pero si que tiene soporte para el valor null = Null Safety

### 7.1 Símbolo ?
Declarar variables que puedan almacenar null
símbolo ? (detrás tipo de dato)
```kotlin
var nullableName: String? = "hola"
nullableName = null
```

*Ahora podemos hacer comprobaciones;
```kotlin
var nullableName: String? = "Morty"
if (nullableName != null) {
println("Hola $nullableName!")
} else {
println("Hola invitado!")
}
```

? nos permite comprobaciones MAS SENCILLAS;
```kotlin
var nullableName: String? = "Morty Smith"
println("${nullableName?.length}") //si tiene lo mostraremos
```
Ej obtener ciudad a partir de user y address. Si alguno es nulo, city también
```kotlin
val city: String? = user?.address?.city
```

### 7.2 Operador Elvis ?:

Permite ofrecer un valor por defecto cuando una variable almacene el valor nulo.
```kotlin
var nullableName = null
println(nullableName ?: "desconocido")
```

*Sirve para conseguir un valor distinto de null cuando una propiedad es null o devuelve null

*También se puede usar para LANZAR UNA EXCEPCIÓN
```kotlin
var nullableName: String? = "Morty Smith"
val name = nullableName ?: throw IllegalArgumentException("El nombre es nulo")
```
*Si se necesita ejecutar varias instrucciones tras el operador Elvis = bloque tipo run { }

### 7.3 Operador !!
!! = muy seguro de que una variable que puede almacenar null NO lo almacena (evitar comprobación kotlin)
```kotlin
var nullableName: String? = "Morty Smith"
println(nullableName!!.uppercase())
```

## 8. Expresiones Regulares

Comprobar valores cumplen condiciones
patrones de caracteres - comprobar

### 8.1 clase Regex
```kotlin
val check = Regex("expresión_regular", RegexOption.IGNORE_CASE)
```

### 8.2 Reglas de Construcción

#### 8.2.1 Agrupación

 [ ] [abc] contiene cualquier carácter de entre los indicados.
 [^ ] [^abc] contiene cualquier carácter que no sea de los indicados.
 [ - ] [0-9] contiene cualquier carácter que se encuentre en el rango.
 [^ - ] [^A-B] contiene cualquier carácter que no esté en el rango.
 ( | ) (x|y) contiene uno de los caracteres (separador |).

#### 8.2.2 Cantidad de caracteres

 { } a{3} contiene exactamente 3 'a' seguidas.
 { ,} a{3,} contiene 3 o más 'a' seguidas.
 { , } a{3,5} contiene 3, 4 o 5 'a' seguidas.
 * a* contiene 0 o más 'a'. Similar: a{0, }
 + a+ contiene 1 o más 'a'. Similar: a{1, }
 ? a? contiene 0 o 1 'a'. Similar: a{0,1}


#### 8.2.3 Inicio – fin
 ^ ^hola empieza con "hola".
 \$ hola\$ acaba con "hola".
 ^\$ ^hola\$ exactamente "hola".

#### 8.2.4 Otros
 \\\s el carácter espacio en blanco.
 \\\S cualquier carácter que no sea espacio en blanco.
 \\\w cualquier carácter menos símbolos.
 \\\W solo símbolos.
 \\\C no es una letra.
 \\\d un dígito. Similar: [0-9]
 \\\D no es un dígito. Similar: [^0-9]

### 8.3 Ejemplo Uso Regex
Comprobar si una variable cumple una expresión regular
Podemos usar = métodos clase String y métodos Regex

```kotlin
val name = "Rick"
// Empieza con mayuscula y le siguen al menos dos minusculas
val checkName = Regex( pattern: "^A[A-Z][a-z]{2,}$")
// Comprobacion con String
println(name.contains(checkName))
// Comprobacidon con Regex
println(checkName.matches(name))
```

## 9. Excepciones

bloques try-catch + lanzar excepciones

```kotlin
val number: Int
try {
      println("Introduce un numero entre 1 y 100:")
      number = readln().toInt()
      if(number<1 || number>100) throw Exception("Numero fuera de rango")
      } catch (e: NumberFormatException) {
        println("Error: No se ha introducido un nUmero")
      } catch (e: Exception) {
        println("Error: ${e.message}")
      }
    }
```

## 10. Control de flujo

Básicos;
 if
 if – else
 if – else if – else
 when
 for
 while
 do – while
 repeat

### 10.1 Guia estilo llaves {}

No son necesarias ->  (no tengan mas de una rama + una sola linea) - when, if
Necesarias -> (cualquier caso) - for,do, while (incluso cuerpo vació o una sola línea)

Preferible
```kotlin
if (number == 0) println("ELl numero es cero") 
```
a 
```kotlin
if (number == 0) {
println("El numero es cero")
}
```
o
```kotlin
if (number1 > number2) higherNumber = number1 else higherNumber = number2
```

-> if como una expresión
Es OBLIGATORIO incluir la rama else
```kotlin
higherNumber = if (number1 > number2) number1 else number2
```

Utilizar las llaves - última instrucción de las llaves debe ser el valor a asignar.
```kotlin
var highNumber = if (number1 > number2) {
// instrucciones
number1
} else {
// instrucciones
number2
}
println("El mayor es $highNumber")
```


### 10.2 when

Kotlin - Condición con múltiples ramas (switch Java):

```kotlin
when (number) {
1 -> {
//intrucciones
println("La variable es 1")
}
2 ->{
//intrucciones
 println(“La variable es 2")
}
else -> println ("La variable no es ni 1 ni 2")
}
```

Con when se pueden agrupar valores

Sin expresiones
```kotlin
when (position) {
1, 2, 3 -> println("En el podio")
else -> println("Sigue intentandolo")
}
```

Con expresiones
```kotlin
var number:Int = 2
var position:String = "5"

when (number) {
parseInt(position) -> printin("coincide el valor numérico")
else -> println("no coincide el valor numérico")
}
```


Rama else obligatoria en When - ej si el resultado de la expresión es booleano

NO;
```kotlin
// No compila ya que NO se evaluan todas las posibilidades
when (number1 > number2) {
true -> println("$number1 es mayor que $number2")
}
```

Cuando compilará = Cuando se  evalúen todas las posibilidades

-Primera posibilidad
```kotlin
when (number1 > number2) {
true -> println(“$number1 es mayor que $number2")
else -> println(“$number1 no es mayor que $number2")
}
```
-Segunda Posibilidad
```kotlin
// no se necesita el else porque ya están todas las posibilidades
var result: String = when (number1 > number2) {
true -> "$number1 es mayor que $number2"
false -> "$number1 no es mayor que $number2"
}
```

#### 10.2.1 Uso in o !in

Usar rangos y colecciones a evaluar

Con rangos
```kotlin
when (position) {
in 1 <= .. <= 10 -> println("En el top 10")
!in 11 <= .. <= 15 -> println("En la mitad")
else -> println("Muy atras")
Con colecciones
val numbers = listOf(1, 2, 3, 4, 5)
when (position) {
in numbers -> println("Top 5")
else -> println("Sigue intentandolo")
}
```

#### 10.2.2 Uso is o !is

Saber si variable es de un tipo o no
```kotlin
var variable:Any = "Rick"

when (variable) {
is Int -> println("Es un numero")
!is String -> print("No es una cadena")
else -> println("Es de otro tipo")
}
```

### 10.3 for - Rangos y Progresiones

Diferentes en kotlin - Utilizan rangos, progresiones y colecciones - Iteraciones

->Rangos: serie ascendente/descendente de Int, Long o Char.

->Progresiones: como un rango pero con un parámetro que indica el paso entre los elementos de la progresión.

->Colecciones*: conjuntos de elementos como arrays

#### 10.3.1 Crear rangos y progresiones

Todos los RANGOS se pueden usar como progresiones con paso 1 por defecto
```kotlin
0.rangeTo(10) // rango de 0 a 10 incluido
0..10 // rango de 0 a 10 incluido
0.rangeUntil(10) // rango de 0 a 9 incluido
0 until 10 // rango de 0 a 9 incluido
```

O si indicamos el paso explícitamente = PROGRESIONES
```kotlin
10.downTo(0) // Progresion de 10 a 0 incluido de 1 en 1
0..10 step 2 // Progresión de 0 a 10 incluido de 2 en 2
```

#### 10.3.2 Keyword in
For - Usa rangos, progresiones y coleciones + keyword in
```kotlin
for (1 in 10 >= downTo >= 0 step 2) {
// 10, 8, 6, 4, 2, 0
}
```
O
```kotlin
for (i in 1 <= .. <= 3) print("$i ") // 1, 2, 3
```

*ej rango de caracteres
```kotlin
for (letter in 'c' <= .. <= 'j') {
//c d e f g h i j
}
```

#### 10.3.3 Iterator

for = recorrer objetos que provean un iterator como strings, listas,
arrays o colecciones.

Dos maneras de acceder a la posición
-Manera 1
```kotlin
var letters = listOf('a', 'b', 'c', 'd')
for (letter: Char in letters) {
}
for (letter: Char in "String") {
}
```

Manera 2
```kotlin
var myArray = (0 <= until < 9).toList()

for (i in myArray.indices) {
println(myArray[i])
}

for ((index, value) in myArray.withIndex()) {
println("$index.- $value")
}
```

### 10.4 while y do-while

### 10.5 repeat

Repetir el código del cuerpo las veces indicadas - internamente ejecuta un bucle for.
```kotlin
repeat (times: 100) { 
  index -> println("${index+1}.- Los 'Billetes Bart' no son de curso legal.")
}
```

### 10.6 break, continue y return

romper el flujo de un bucle;

 return: finaliza el bucle y la función donde se encuentre el mismo.
 break: finaliza el bucle donde se encuentre.
 continue: finaliza la iteración actual del bucle donde se encuentre.

*Kotlin - los podemos etiquetar - carácter @

nombreEtiqueta@ 
*Un break finalizará el bucle al que esté
etiquetando.

```kotlin
firstFor@ for (i in 1 <= .. <= 10) {
  for (j in 1 <= .. <= 5) {
    if (i%2 == 0 && j == 2) break@firstFor
     println("$i - $j")
    }
}
```

## 11. Colecciones

Tipo de dato - almacenar (principalmente elementos del mismo dato)
Si son diferentes -> Cuidado
Pueden almacenar null (todos o un elemento)

### 11.1 Operaciones generales sobre Colecciones

#### 11.1.1 Return Coleccion

Operaciones a elementos + return colección
"recorren la función"
*Admiten función lambda {instrucción} + Disponible it

*Ejercicios matrices - una línea

->forEach - Recorre todos los elementos de colección (for)

```kotlin
val numbersForEach = listOf(1, 2, 3, 4, 5)
// Recorremos todos los elementos con forEach
numbersForEach.forEach {
  println("Siguiente a numero actual: ${it + 1}")
}
// También puedes usar una referencia de función
numbersForEach.forEach(::println)
```

->filter - Devuelve colección con elementos que cumplan condición

```kotlin
val numbersFilter = listOf(1, 2, 3, 4, 5, 6)

// Filtramos los números pares
val evenNumbers = numbersFilter.filter { it % 2 == 0 }
println("Números pares: $evenNumbers") // [2, 4, 6]

// Filtramos los números mayores a 3
val greaterThanThree = numbersFilter.filter { it > 3 }
println("Números mayores a 3: $greaterThanThree") // [4, 5, 6]
```

->map - Devuelve colección con elementos transformados

```kotlin
val numbersMap = listOf(1, 2, 3, 4, 5)

// Multiplicamos cada número por 2
val doubledNumbers = numbersMap.map { it * 2 }
println("Números duplicados: $doubledNumbers") // [2, 4, 6, 8, 10]

// Transformamos los números en strings
val numberStrings = numbersMap.map { "Número $it" }
println("Números como strings: $numberStrings") // ["Número 1", "Número 2", ...]
```


### 11.2 Tipos de colecciones

Son 4

| Array                                           |
| ----------------------------------------------- |
| Con índice posición.                            |
| Elementos Repetibles                            |
| No iguales aunque mismo elemento misma posición |
| No modo mutable                                 |

| List                                                     |
| -------------------------------------------------------- |
| Colección Ordenada                                       |
| Con índice posición.                                     |
| Elementos Repetibles                                     |
| Igualdad de lists (si mismos elementos y misma posición) |

| Set                                                      |
| -------------------------------------------------------- |
| Colección elementos sin orden                            |
| No Repetibles (elemetos)                                 |
| Igualdad de sets - (mismos elementos sin importar orden) |

| Map/Diccionario                                                |
| -------------------------------------------------------------- |
| Conjunto clave-valor (key-value)                               |
| No repetibles (claves)                                         |
| Igualdad de maps - si mismos pares claves-valor da igual orden |

### 11.3 Mutables e Inmutables 

LIST, SET y MAP - DOS VERSIONES
(tanto val o var) 

-> Inmutables
Ni añadir, ni eliminar elementos (*modificar)
*Funcionamiento interno permite que se puedan modificar o no

-> Mutables
Permite Añadir, eliminar y modificar elementos

### 11.4 List

#### 11.4.1 List Normal

```kotlin
// Indicando tipo de dato (List<String>)
val numbers1: List<String> = listOf("uno", "dos", "tres")

// Se deduce el tipo de dato (todos son iguales)
val numbers2 = listOf("uno", "dos", "tres", "cuatro", "cinco")

// Indicando tipo de dato (List<Any) - elementos diferentes
val list1: List<Any> = listOf("Rick", 70, "c-137", 'H')

//Se deduce el tipo de dato (Any) - elementos diferentes
val list2 = listOf("Rick", 79, "c-137", 'H')
```

#### 11.4.2 List Mutable

```kotlin
// Indicando tipo dato (MutableList<Int>) -> NO AÑADIMOS DATOS
val mutableNumbers1: MutableList<Int> = mutableListOf()

// Indicando tipo de dato + datos
val mutableNumbers2: MutableList<Int> = mutableListOf(1, 2, 3, 4)

// Se deduce el tipo de dato (Int-iguales)
val mutableNumbers3 = mutableListOf(1, 2, 3, 4)

// Se indica el tipo de dato - diferentes tipos
var mutableList1: MutableList<Any> = mutableListOf(1, 'a', "quenty", true)

//Se deduce el tipo de dato (Any) - Diferente tipos
val mutableList2 =  mutableListOf(1, 'a', "querty", true)
```

#### 11.4.3 Operaciones List

```kotlin
//Operaciones modificar LISTS
val list = listOf("uno", "dos", "tres")
list.size //valor 3
list[2] //Devuelve "tres"
list.indexOf("uno") //Devuelve 0
list.lastIndexOf("dos") //Devuelve 1
list.subList(1,3) //Devuelve LISTA ["dos","tres"]
```

#### 11.4.4 Operaciones MutableList (las que modifican)

```kotlin
val mutableList = mutableListOf(1,2,6,3,4,5)
mutableList.add(6) //Añade elemento 6 - AL FINAL DE LA LISTA
mutableList.add(2,100) //Añade elemento 100 a posición 2 desplazando resto a derecha
mutableList.removeAt(4) //elimina elemento de la posición 4
mutableList[1] = 99 //Cambia valor elemento pos 1 a 99
mutableList.contains(3) //true/false si se encuentra el valor
mutableList.sort() //ordena
mutableList.sortDescending()
mutableList.max() //Devuelve elemento mayor
mutableList.min() //Devuelve elemento menor
mutableList.isEmpty() //true/false si esta vacio
mutableList.isNotEmpty() //true/false si NO está vacio
mutableList.shuffle() //Desordena aleatoriamente el array
mutableList.shuffled() //Devuelve array con elemento desordenadas
mutableList.first() //Devuelve primer elemento
mutableList.last() //Devuelve último elemento
mutableList.count() //Devuelve cantidad elementos array
mutableList.reverse() //Da la vuelta el array
mutableList.reversed() //Devuelve array al revés
```

### 11.5 Set

#### 11.5.1 Set Normal

```kotlin
val names1: Set<String> = setOf("Ana", "Jorge", "Marta")
val names2 = setOf("Ana", "Jorge", "Marta")
val set1: Set<Any> = setOf("Valencia", 2022, "ES", 'V')
val set2 = setOf("Valencia", 2022, "ES", 'V')
```

#### 11.5.2 Set Mutable

```kotlin
val namesMutable1: MutableSet<String> = mutableSetOf("Ana","Jorge","Lucia")
val namesMutable2 = mutableSetOf("Ana","Jorge","Lucia")
val set1Mutable: MutableSet<Any> = mutableSetOf("Valencia",2022,"ES",'V')
val set2Mutable = mutableSetOf("Valencia",2022,"ES",'V')
```

#### 11.5.3 Operaciones Set

```kotlin
val setOp1 = setOf(1,3,4,8,7,12,15)
val setOp2 = setOf(24,7,5,1,8,6)

val joinedGroups = setOp1 union setOp2 //Devuelve un set con elementos de los dos sets - SIN REPETICIONES
val commonElements = setOp1 intersect setOp2 //Devuelve un set con elementos COMUNES de los dos sets
val differentElements = setOp1 subtract setOp2 //Devuelve un set con elementos de SET2 QUE SE ENCUENTREN en SET1
```

#### 11.5.4 Operaciones MutableSet (las que modifican)

```kotlin
val namesMutableOp = mutableListOf("Ana","Jorge","Lucia")
namesMutableOp.add("Luca") //Añade al final de la lista
namesMutableOp.add("Ana") //No añade ya que ya existe
namesMutableOp.remove("Jorge") //true/false - elimina elemento si lo encuentra
namesMutableOp.contains("ana") //true/false si encuentra valor
// Parecido a métodos List...
```

### 11.6 Map

#### 11.6.1 Map normal

```kotlin
val person1: Map<String, String> = mapOf(
    "name" to "Rick Sanchez",
    "age" to "70",
    "estado" to "vivo",
    "dimension" to "c-137"
)
val person2 = mapOf(
    "name" to "Rick Sanchez",
    "age" to "70",
    "estado" to "vivo",
    "dimension" to "c-137"
)
val person3: Map<String, Any> = mapOf(
    "name" to "Rick Sanchez",
    "age" to 70,
    "estado" to "vivo",
    "dimension" to 'c'
)
```

#### 11.6.2 Map Mutable

```kotlin
val mutablePerson: Map<String, Any> = mutableMapOf(
    "name" to "Rick Sanchez",
    "age" to 70,
    "alive" to true,
    "dimension" to 'c'
)
```

#### 11.6.3 Operaciones Map

```kotlin
val personOp: Map<String, Any> = mapOf(
    "name" to "Rick Sanchez",
    "age" to 70,
    "estado" to "vivo",
    "dimension" to 'c'
)

personOp.keys //Devuelve lista con las claves
personOp.values //Devuelve lista con valores
personOp.size //Devuelve la cantidad de pares claves-valor

//IMPORTANTE - Recorrer un Map (o MutableMap)
for((key,value) in personOp){
    println("$key -> $value")
}
```

#### 11.6.4 Operaciones MutableMap(las que modifican)

```kotlin
//Operaciones modificar MUTABLE MAPS
//Las operaciones que modifcan son solo aplicables a mutable Maps
val mutablePersonOp = mutableMapOf(
    "name" to "Rick Sanchez",
    "age" to 70,
    "alive" to true,
)

mutablePersonOp.put("dimension", 'A') //Añade en el map la clave-valor indicada
mutablePersonOp.remove("age") //Elimina y Devuelve elementos que coincidan con la clave
mutablePersonOp.clear() //Vacía el map
```

## 12. Funciones

### 12.1 Built-in functions
Funciones incluidas en el sistema
```kotlin
print(tallestMountain.length) // Prints: 13
println(name.capitalize()) //Angela
```
-Para Arrays
min() max() isEmpty() indexOf() sort() sorted() reverse() reversedArray()

### 12.2 Declarar y llamar funciones

keyword fun

Declararla;

```kotlin
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
```

Llamarla;

```kotlin
isEven(16)
```

*Las funciones pueden no recibir parámetros ni devolver valores

*Si no se indica valor de retorno - Devuelve tipo Unit
(=void) - Si no se devuelve nada se puede omitir con :Unit 

```kotlin
fun greetingPerson(name: String){
    println("Hola $name")
}

//Lo mismo;
fun greeting(){
    println("Hola")
}

fun greeting2():Unit {
    println("Hola")
}
```

### 12.3 Parámetros

#### 12.3.1 Trailing coma
Parámetros de entrada se separan por comas
*Uso trailing comma = coma final

```kotlin
fun areEqual(
    num1: Int,
    num2: Int,
): Boolean {
    return if (num1==num2) true else false
}

areEqual(26,123)
```

#### 12.3.2 Parámetros de entrada Inmutables
*Son inmutables (val)
*No se pueden cambiar su valor desde el cuerpo - error 

```kotlin
//ERROR
fun addOne1(number: Int): Int{
    number++
    return number
}
var myNumber1 =(0 ..  100).random()
myNumber1 = addOne1(myNumber1)
```

¿Cómo los modificamos?
-Creamos copia
```kotlin
fun addOne2(number: Int): Int {
    val newNumber = number + 1
    return newNumber
}

var myNumber2 = (0  .. 100).random()
myNumber2 = addOne2(myNumber2)
```
#### 12.3.3 Llaves y Funciones
Si podemos escribirla en una sola línea = No llaves y usar = antes del cuerpo

//NO;
```kotlin
//NO PREFERIBLE;
fun areEqual2(
    num1: Int,
    num2: Int,
): Boolean {
    return if (num1==num2) true else false
}
```
```kotlin
//SÍ; (Sin llaves y con =)
fun areEqual22(
    num1: Int,
    num2: Int,
): Boolean = if (num1==num2) true else false
//Si no se indica el tipo de dato de retorno kotlin lo deduce
fun inRange(num: Int, min: Int, max: Int) = num in min .. max
```

#### 12.3.4 Llamada función con nombres
Se puede usar el nombre de los parámetros en las llamadas a la función- Útil cambiar el
orden de los parámetros.

```kotlin
fun greeting2(
    name: String,
    surname: String,
): String {
    return "Hola $name $surname"
}

greeting2(name="Rick", "Sanchez")
greeting2(surname="Sanchez", name="Rick")
```

Si se usan parámetros con y sin nombre en la llamada, los argumentos con
nombre deben de ser los últimos a no ser que ocupen su lugar.

```kotlin
fun greeting3(
    name: String,
    surname1: String,
    surname2: String,
): String {
    return "Hola $name $surname1 $surname2"
}

greeting3("Ana", surname2="Sanz", surname1="Lopez")
greeting3(surname2="Sanz", name="Ana", surname1="Lopez")
//NO;
greeting3("Lopez", surname2="Sanz", name="Ana")
```

#### 12.3.5 Valor por defecto parámetros

*Se permite definir un valor por defecto a los parámetros de entrada desde la llamada
Asi podemos omitir parametros si queremos

```kotlin
fun finalPrice(
    price: Double,
    vat: Int = 21,
    discount: Int = 0,
): Double {
    var finalPrice: Double = price
    if(discount != 0) finalPrice -= price * discount / 100
        return finalPrice + finalPrice * vat / 100
}

finalPrice(355.0,10,5) //Sin por defecto
finalPrice(355.0,10) // Usamos 0 discount
finalPrice(355.0) // 21 vat y 0 discount
```

Si se usa valor por defecto en la definición de la función y nombres de
parámetros en la llamada a la función, se pueden omitir parámetros
intermedios en la llamada.

```kotlin
fun finalPrice2(
    price: Double,
    vat: Int = 21,
    discount: Int = 0,
): Double {
    var finalPrice: Double = price
    if(discount != 0) finalPrice -= price * discount / 100
        return finalPrice + finalPrice * vat / 100
}

finalPrice2(244.0,10,5)
finalPrice(355.0, discount=20) // vat = valor por defecto
```

#### 12.3.6 Declarar número variable de parámetros

Parámetro con la palabra vararg (habitualmente el último), si no lo es, deberá usarse un nombre

```kotlin
fun max(vararg numbers: Int): Int {
    var max: Int = numbers[0]
    for (number in numbers) {
        if (number > max) max = number
    }
    return max
}
```
*Con un intArray o una colección que se pueda convertir a intArray se puede usar * (operador spread)
para pasarlo completamente como parámetro vararg.

```kotlin
    max(5,32,45,32,57)
    val numbersVararg = intArrayOf(4,75,3,8,5)
    //Uso *
    max(* numbersVararg)
    max(3,5,2,*numbersVararg,6)
```


#### 12.3.7 Sobrecarga de funciones

Kotlin permite la sobrecarga de funciones - aunque estas no estén definidas en una clase

ej - max() sobrecarga

```kotlin
fun addition() = println("No puedo sumar sin valores")
fun addition(num1: Int, num2 : Int) = println("$num1 + $num2 = ${num1 + num2}")
fun addition(num1: Double, num2: Double) = println("$num1 + $num2 = ${num1 + num2}")
```


### 12.4 Ámbito y tipo de las funciones

Tipos de funciones Kotlin
 Nivel superior (top level)
 Local
 Miembro
 De extensión

*Según el tipo se podrá usar en una parte de código u otra.

#### 12.4.1 Nivel Superior (top level)

Se definen sin estar dentro de ningún bloque { } o clase.

Biblioteca de funciones - funciones que se podrán usar en cualquier parte

#### 12.4.2 Local

Dentro de otra función y se podrá usar en todo el bloque { } de esa función, incluso desde otras
funciones locales 

Debe estar definida antes de cualquier llamada a ella.

```kotlin
 fun main(){
    fun greeting() = println("Hola") //local

    fun welcome(){  //local
        greeting()
        println("Bienvenido")
    }
}
```

#### 12.4.3 Miembro

Se definen dentro de las clases u objetos. (métodos) -> POO

#### 12.4.4 De extensión

Kotlin permite extender la funcionalidad de las clases añadiendo funciones a ellas.

Estas funciones solo existen en el ámbito en el que se definen.

```kotlin
 fun main(){
    val number = (0 .. 100).random()
    if(number.isOdd()) println("$numer es impar")
    else println("$numer es par")
}

//Se añade función a la clase int
fun Int.isOdd(): Boolean {
    return this % 2 != 0
}
```

#### 12.4.5 Ambito de funciones y Sobrecarga

Si se intenta sobrecargar una función del sistema con una función de Nivel superior con los mismos parámetros -- >  Kotlin ignorará esa sobrecarga.

```kotlin
fun max(num1 : Int, num2 : Int): Int {
  return when{
    num1 > num2 -> num1
    num2 > num1 -> num2
    else -> num1
  }
}

fun main(){
  println(max(3,5))
}
```
Si se intenta sobrecargar una función del sistema con una función local con los mismos parámetros --> Kotlin sobreescribirá la función del sistema.
```kotlin
fun main(){
  fun max(num1 : Int, num2 : Int): Int {
  return when{
    num1 > num2 -> num1
    num2 > num1 -> num2
    else -> num1
  }
}

println(max(3,5))

```

## 13. Programación Orientada a Objetos

Crear clases - palabra reservada class (como en Java)

*Kotlin permite que en un mismo archivo .kt se definan más de una clase
públicas (esto no se permite en Java).

Si en un archivo .kt solo se define una clase -> nombre del archivo = nombre de la clase.
Si en un archivo .kt se definen varias clases -> nombre representativo.

### 13.1. Definición de clase en Kotlin
```kotlin
class Person{

}
```
Kotlin es tan conciso que una clase sin cuerpo se puede definir así:
```kotlin
class Person
//Aun sin cuerpo se puede instanciar un objeto de esta clase:
val morty = Person()
```

Usar una clase
Una vez declarada (parecido a Java) - notación de punto acceder a propiedades
```kotlin
//sin new (diferencia java)
val product = Product("PS3",434)
println("${product.name}: ${product.finalPrice(10.0)} euros")
```

#### 13.1.1. Clase Any

TODAS LAS CLASES HEREDA DE LA CLASE Any - (Java=Object)

La clase Any define tres métodos que heredarán sus hijas:
*equals → indica si un objeto es igual a otro
*hashCode → devuelve el código hash de un objeto
*toString → devuelve la representación en String de un objeto

### 13.2. Getters y Setters

Los getters y setters se deben definir tras cada propiedad.

VERSION LARGA
```kotlin
class Product{
  var name: String
      get(){
        return field
      }
      set(name: String){
      field = name
      }
  var price: Double
      get(){
          return field
      }
      set(price:Double) {
        field = price
      }
}
```
VERSION ACORTADA (Recomendada)
```kotlin
//Util si quiero ponerles modificadores de visibilidad
class Product{
  var name: String
      //acortando el get
      get() = field
      set(name: String){
      field = name
      }
  var price: Double
      get() = field
      set(price:Double) {
        field = price
      }

      //Contructor...
}
```

VERSION MÁS ACORTADA - GETTERS Y SETTERS IMPLÍCITOS (ni se ponen)
```kotlin
class Product{
  var name: String
  var price: Double

  //Contructor...
}
```


### 13.3. Contructores
El constructor se define con la palabra constructor.

```kotlin
class Product{
  var name: String
  var price: Double

    constructor(name:String, price:Double){
      this.name = name
      this.price = price
    }
}
```

VERSION ACORTADA CONSTRUCTOR (Recomendada)
CONSTRUCTOR IMPLÍCITO (ni se pone) = es el constructor primario

```kotlin 
//ES LO MISMO QUE LO DE ARRIBA
// Ya tendriamos setters, getters y constructor IMPLÍCITOS
class Product(var name: String, var price: Double)
```

//Uso (main)
```kotlin
val pa5 = Product("PS5",499.99)
ps5.name = "PlayStation NewUpdate"
println(ps5.name)
```

#### 13.3.1. Usar más de un constructor
¿QUE PASA SI QUIERO USAR MAS CONSTRUCTORES?

-Constructores Secundarios -> Se incluirán en el cuerpo de la clase

VERSION LARGA
```kotlin
class Product{
  var name: String
  var price: Double = -1.0

    constructor(name:String, price:Double){
      this.name = name
      this.price = price
    }

    //constructor secundario - SOBRECARGA
    constructor(name:String){
      this.name = name
    }
}
```

VERSION CORTA
```kotlin       //Constructor primario
class Product (var name: String, var price: Double = -1.0){
  
    //constructor secundario (this, es como super, hereda del primario)
    //SE DEBE USAR LA PALABRA this (si combinamos con primarios)
    constructor(name:String): this(name,-1.0)
    //this pondra el precio a -1.0, mientras que el name será lo q establezcamos
}

//Solo un parámetro (name) - price es OPCIONAL
class Product(var name: String){
  var price: Double = -1.0 //Price está aqui (a parte)

  constructor(name:String, price: Double) : this(name){
    //Se establece MANUALMENTE price
      this.price = price
    }
}
```

USO (como vemos es igual)

```kotlin
val game = Product("GTA", 39)
val controller = Product("Dual Sense")
```

#### 13.3.2. Sin constructor

NO constructores

Puede no haber constructores 

```kotlin
class Product{
  var name: String = "" 
  var price: Double = -1.0
}
```

Se deberá asignar valor en la llamada al objeto
```kotlin
val game = Product(){
  game.name = "GTA VI"
  println("Se vende ${game.name})
}
```

#### 13.3.3 init y constructores

Constructor primario - > Requerimos realizar acciones sobre propiedades
NADA MAS CREARSE EL OBJETO SE ACTIVARÁ (nombre que insertemos pone mayúscula)

```kotlin
class Product(var name: String, var price: Double){
  init{
    name = name.uppercase()
  }
}

//Uso
val product = Product("Switch",456)
println("Se vende ${product.name}) //Pondra SWITCH
```

### 13.4. Visibilidad en clases

Si no se indica lo contrario las clases, propiedades y
métodos por defecto son públicas (public)

modificadores (podemos escribirlos):
public
private
protected
internal → visible en el mismo módulo (paquete)

*Verás que no es recomendable poner las propiedades privadas a saco (mejor get y set concretos)

```kotlin
class Product{
  var name: String
  var price: Double
  //lo hace concreto - Pero si son AMBOS mejor usar lo de abajo
      private get(){
          return field
      }
      private set(price:Double) {
        field = price
      }
    constructor(name:String, price:Double){
      this.name = name
      this.price = price
    }
}
```
```kotlin
//LOS GETTERS U SETTERS DE name y price SERAN PRIVADOS
class Product(private var name: String){
    private var price: Double = -1.0
  //getters y setters ímplicitos
    constructor(name:String, price:Double) : this(name){
      this.price = price
    }
}
```
Al ser IMPLÍCITOS, los getters y los setters tendrán el mismo tipo de acceso que se defina para las propiedades, y esto no se puede cambiar.

PROBLEMA - si quiero hacer concretamente el set o get privado no puedo (deben ser ambos) - DIFICULTA ENCAPSULACIÓN
-No se tendrá acceso a las propiedades cuando se usen los objetos de la clase.

```kotlin
//usando el objeto de antes
//ME DARÁ ERROR (no reconoce name ni price ya que son privados)
val product = Product("Test")
product.name = "PS5" //error
product.price = 456.23 //error
```

#### 13.4.1. private set y private get

Solución

Solución de Java -> Crear metodos públicos para acceder (Java) - NO RECOMENDABLE EN KOTLIN

Solución recomendada en Kotlin

Concretar -> Si una propiedad es pública se pueden definir el get y
el set de manera privada para así proteger el acceso.

```kotlin
//LOS GETTERS U SETTERS DE name y price SERAN PRIVADOS
class Product(var name: String, var price: Double){
  
  //get de ambas sigue publico - set no 
  var name: String = name
    private set
  var price: Double = price
    private set
  //Si se necesita cambiar el valor de la propiedad se necesitará definir una función para ello
}
```

### 13.5 Modificador estático - companion object

Se pueden definir propiedades y funciones estáticas
Uso companion object (dentro de la clase)

Todo lo que se declare dentro, será estático (podra usarse directamente con el nombre de la clase)

```kotlin
class Product(var name: String, var price: Double){
  init{
      quantityOfProducts++ //cuando creamos un producto, sumamos 
  }

  companion object{
    //propiedad estática cantidad de productos inicializada a 0
    var quantityOfProducts = 0
    
    //método estático que resetea cantidad
    fun resetQuantity(){
      quantityOfProducts = 0
    }
  }
}
```
```kotlin
//Uso
val product = Product("Switch",456)
val product = Product("Ps5",45336)

//Se aplica a todos los productos directamente (estático)
println(Product.quantityOfProducts)
Product.resetQuantity()
println(Product.quantityOfProducts)

```

### 13.6 Funciones Miembro (Métodos)

Como crear una función miembro

Version LARGA
```kotlin
class Product(var name: String, var price: Double){
  fun finalPrice(percentage: Double): Double { 
      return price - price * percentage / 100
  }
}
```

Version corta (Recomendada)
```kotlin
class Product(var name: String, var price: Double){
  fun finalPrice(percentage: Double) = price - price * percentage / 100
}
```

#### 13.6.1 Override en funciones

Si se sobreescribe una función HEREDADA (ya existe en clase madre) - Añadimos override
//ej toString() es heredada de la madre por defecto (Any)
```kotlin
class Product(var name: String, var price: Double){
  override fun toString() {
    return "$name: $price euros"
  } 
}
```

*Ejemplo declaración objeto paradigma Kotlin
FORMA RECOMENDADA
```kotlin
//constructor primario
class Product(var name: String){
  var price: Double = -1.0
  //getters y setters implícitos
  //init - realiza acciones a contructor primario
  init{
    name = name.uppercase()
  }
  //constructor secundario
  constructor(name:String, price: Double) : this(name){
    this.price = price
  }
  //sobrecarga de funciones heredadas
  override fun toString() {
    return "$name: $price euros"
  } 
}
```

### 13.7. Singleton

En Kotlin se pueden crear singleton que son objetos únicos en su clase, esto significa que NO podrá haber más instancias de esa clase

Se le pueden añadir funciones de extensión. Si se declaran de manera global en el archivo .kt se podrán añadir funciones de extensión como con cualquier otra clase.

```kotlin
object Author{
  var name = "Alex Torres"
  var company = "2 DAM"
  var date = Date()

  override fun toString() : String {
          return ""$name ($company)
                      | $date""".trimMargin()
  }
}
```

### 13.8. Herencia - open class

En Kotlin por defecto todas las clases son finales = NO puede haber herencia si no se indica explícitamente.
¿Como indicar que una clase PUEDE SER SUPERCLASE? - open class

```kotlin
//contructor primario y getters/setters por defecto
// OPEN CLASS
open class Product(var name: String, var price: Double)

//Monitor hereda (llama al constructor padre)
class Monitor(name: String, price: Double): Product(name, price)
```

Con ello, podemos añadir propiedaades y métodos nuevos

```kotlin
open class Product(var name: String, var price: Double)

// En la clase hija automáticamente se crea el constructor primario que llamará al constructor de la clase madre Product(name, price)
class Monitor(name: String, price: Double): Product(name, price){
  var size: Int = 0

//si le añado size necesitaré un segundo constructor 
//this (name,price) = LO RECIBE EL PADRE (nos da el name y el price) - llamamos al primario en verdad
  constructor(name: String, price: Double, size: Int): this(name, price)

  override fun toString(): String {
    return "$name ($size\"): $price euros"
  }
}
```

### 13.9. Clases Abstractas

#### 13.9.1 abstract

Una clase abstracta no puede instanciar objetos -Es una PLANTILLA

En kotlin;
```kotlin

abstract class Product(var name: String, var trademark: String){

//OVERRIDE
  abstract var price: Double
  abstract fun powerOn()
  abstract fun powerOff()

  fun information(){
    println("$name ("$trademark): $price euros")
  }
}
```
Uso de override var y override fun para usarlos
```kotlin
// OVERRIDE VAR !!!!
class Monitor(name : String, trademark: String, var color: String, override var price: Double) : Product(name, trademark){

  override fun powerOn(){
    println("encendido")
  }

  override fun powerOff(){
    println("apagado)
  }
}
```

## 14. Enum y Data class

### 14.1 Enum class

enum class permiten definir un conjunto de constantes relacionadas entre sí - Disponer de valores sin temor a errores

Declaramos enum
```kotlin
enum class Direction {
  NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int){
  RED(0xFF0000),
  GREEN(0x00FF00),
  BLUE(0x0000FF)
}
```

Usamos enum (en el main)
```kotlin
//para enum direccion
val direction = Direction.EAST
println(direction) //EAST
println(direction.name) //EAST
println(direction.ordinal) //3 (posición)

//para enum color
val color = Color.RED
println(color) //RED
println(color.name) //RED
println(color.rgb) //16711680 (en decimal)
println(color.rgb.toHexString()) //00ff000 (en hexadecimal)
println(color.ordinal) // 0 posición
```

### 14.2 Data class

Clases simples que solo contienen atributos (datos)
Las data class son una manera de modelar los datos y la finalidad de sus objetos es simplemente almacenar datos.

-Util interactuar con otras clases o API's externas

Declarar data class
```kotlin
data class Manga(var name: String, var type: String, var volumes: Int)
```
Las propiedades que no aparezcan en el constructor primario no se
beneficiarán de las características de las data class.

Kotlin provee a data class funciones de utilizad:
 equals(): permite comparar dos objetos de la clase.
 hashCode(): código hash (este código se usa en la función anterior).
 copy(): permite realizar una copia del objeto.
 toString(): genera un string legible con los datos del objeto.
 component1(), component2()…: get a cada propiedad del objeto en su
orden de declaración.

```kotlin
//Usamos class manga anterior
val dragonBall = Manga("Dragon Ball","Shonen",45)
val deathNote = Manga("Death Note","Shonen",435)
val naruto = Manga("Naruto","Shonen",445)

println(dragonBall)
//al usar toString solo aparecerán las propiedades que estén en el constructor primario
if(dragonBall.equals(naruto))println("Son el mismo manga")
else println("Son mangas diferentes")
```
Output;
 Manga(name=Dragon Ball,type=Shonen,volumes=45)
 Son mangas diferentes

#### 14.2.1 Uso Copy
Mediante la función copy se pueden copiar objetos completos y durante la copia se pueden cambiar valores de las propiedades.
```kotlin
var db = dragonBall.copy()
var dbz = dragobBall.copy(nombre="DBZ")
```

#### 14.2.2 Deconstruir Data Class _
Se puede extraer el valor de sus propiedades a variables.

Si hay algún valor que no se quiera se debe poner el carácter _ en su lugar.
Si los valores que no se quieren están al final de la lista basta con no ponerlos.
```kotlin
val dragonBall = Manga("Dragon Ball","Shonen",45)
val(name, _, volumes) = dragonBall
println("Manga $name")
println("Tomos $volumes")
//no ponerlos
val(name) = deathNote
println("Manga $name")
```

## 15. Funciones Específicas Kotlin

### 15.1 Funciones de Extensión

Kotlin permite extender la funcionalidad de las clases existentes ya sean del sistema o propias sin uso de la herencia incluso si la clase existente es final.

Las funciones de extensión se definen fuera de la definición de la clase por ello solo se podrán utilizar en el ámbito en el que se definan - no pueden acceder a propiedades privadas ni protegidas de la clase a la que extienden.

Aunque se definen fuera - > es como si se hubiera definido desde dentro comportándose como un método más de la clase

Función de extensión de una clase existente:
```kotlin
//Estas funciones se definen como otras funciones pero usando el nombre de la clase que se quiere extender.
//Se añade una funcion a la clase Int
fun Int.isOdd(): Boolean {
  return this % 2 != 0
}
```

Función de extensión de una clase propia
```kotlin
//Se añade una funcion a la clase producto
class Product(var name: String, var price: Double)

fun Product.sale(salePrice:Double): Double{
  return if (price > salePrice) salePrice else price
}
```

Uso típico de las funciones de extensión se da con las colecciones.
Se puede realizar una acción sobre cada uno de los elementos de la colección.
```kotlin
fun main(){
  val numbers = mutableListOf(1,2,3,4,5,6,8,9,10)
  println(numbers.addition(2))
}

fun MutableList<Int>.addition(quantity: Int): MutableList<Int>{
  val numbers = mutableListOf<Int>()
  for(i in this) numbers.add(i + quantity)
  return numbers
}
//Output del main
//[3,4,5,6,7,8,9,10]
```

#### 15.1.1 Funciones de Extensión y funciones miembro

\*Una función miembro es una función que pertenece directamente a una clase y puede acceder a todas las propiedades y métodos de la misma

Una función de extensión - NO puede SOBREESCRIBIR a una función miembro.
\* Aunque no se muestre un error, si se intenta sobrescribir una función miembro mediante una función de extensión, en ejecución siempre se llamará a la función miembro.
```kotlin
fun Int.time(value :Int){
  //error
}
```

Si una clase ya tiene una función miembro con el mismo nombre que la extensión, siempre se llamará a la función miembro al invocarla, incluso si la extensión está definida en el mismo contexto.

```kotlin
class MiClase {
    fun miFuncion() {
        println("Soy la función miembro")
    }
}

fun MiClase.miFuncion() {
    println("Soy la función de extensión")
}

fun main() {
    val instancia = MiClase()
    instancia.miFuncion() // Salida: Soy la función miembro
}
```

Una función de extensión - SÍ que puede SOBRECARGAR a una función miembro.
Si tienen una firma diferente (por ejemplo, diferentes parámetros).

```kotlin
class MiClase {
    fun miFuncion(param: Int) {
        println("Función miembro: $param")
    }
}

fun MiClase.miFuncion(param: String) {
    println("Función de extensión: $param")
}

fun main() {
    val instancia = MiClase()
    instancia.miFuncion(42)       // Salida: Función miembro: 42
    instancia.miFuncion("Hola")   // Salida: Función de extensión: Hola
}
```

### 15.2 Funciones de Alcance

Scope Functions
Permiten ejecutar un bloque de código en el contexto del objeto que las llama

Utilidad - Al ejecutarse en el contexto, dentro del cuerpo está disponible dicho objeto - Por ello devuelven un valor pero NO ES NECESARIO capturarlo (guardarlo) en ninguna variable.

Existen cinco funciones de alcance:

Todas las funciones de alcance se utilizan con un bloque de llaves { }

| Función        | Uso                                                                                                  | Contexto                         | Devuelve                           |
| -------------- | ---------------------------------------------------------------------------------------------------- | -------------------------------- | ---------------------------------- |
| let            | Ejecutar bloque de código asegurándose de que el objeto no es null.                                  | Propio objeto accesible con it   | Resultado de la última instrucción |
| apply          | Configuración de un objeto.                                                                          | Propio objeto accesible con this | Propio objeto                      |
| run (con this) | Configuración de un objeto y ejecución de instrucciones sobre él.                                    | Propio objeto accesible con this | Resultado de la última instrucción |
| run (sin this) | Ejecutar instrucciones cuando se requiere una expresión, se usa sin que sea llamada desde un objeto. | -                                | Resultado de la última instrucción |
| also           | Seguir realizando instrucciones sobre el objeto.                                                     | Propio objeto accesible con it   | Propio objeto                      |
| with           | Agrupar llamadas a funciones de un objeto.                                                           | Propio objeto accesible con this | Resultado de la última instrucción |

Ejemplo de uso;
```kotlin
class Product(var name: String, var price: Double, var year: Int)
val product = Product("PS5",43,2021)

class Product(var name: String, var price: Double, var year: Int)
var result = product.let{ // Contexto
  println("Se va a aplicar un descuento")

  it.price * 0.84 //^let - se devuelve el resultado
}
//
val product = Product("PS5",43,2021)
var result = product.let{ // Contexto
  println("Se va a aplicar un descuento)

  it.price * 0.85 //^let = como hay dos caminos posibles aparece 2 veces
}
```

#### 15.2.1 let

Contexto; el objeto desde el cual se llama, accesible con it
Devuelve: el resultado de la última instrucción

El uso de let asegura que el objeto no será null antes de ejecutar las instrucciones.

En el caso de que el objeto producto sea null el bloque let no se ejecutará.

```kotlin
class Product(var name: String, var price: Double, var year: Int)
val product = Product("PS5",43,2021)

class Product(var name: String, var price: Double, var year: Int)
var result = product.let{ // Contexto
  println("Si el producto es antiguo se aplica un descuento")
  if(it.year<2023) it.price * 0.85 //^let
  else it.price //^let
}
```

#### 15.2.2 run

Tiene dos usos;
-> Llamada desde un objeto como let, pero no controla si la variable es null

Contexto; El objeto desde el cual se llama, accesible con this.
No es necesario poner this. para acceder a las propiedades.
Devuelve: el resultado de la última instrucción.
```kotlin
class Product(var name: String, var price: Double, var year: Int){
  fun addPercentageToPrice(percentage: Double){
    price += price * percentage / 100
  }
}
val product = Product("PS5",43,2021)
val result = product.run { //this.product
    //this.price /2 - no es necesario this
    name += " [OFERTA]"
    if(price < 1000.0) addPercentageToPrice(12.5)
    price //^run
}
println("Producto ${product.name} ${product.price})
println(result)
//Salida
//Producto: PS5 \[OFERTA] 557.43
//557.43
```
-> Llamada sin usar objeto.

El contexto: no hay contexto.
Devuelve: el resultado de la última instrucción.
```kotlin
val name = "Rick Sanchez"
val containsR = run { //contexto
   var letterR = false
   for (letter in name){
    if(letter == 'R'){
      letterR = true
      break
    }
   }
   letterR //^run
}
```

#### 15.2.3 also

Permite realizar acciones extra (also = además) sobre el objeto que la llama.
El contexto: el objeto desde el cual se llama, accesible con it.
Devuelve: el propio objeto (se hace automáticamente).

```kotlin
val product: Product = Product("Nintendo Switch", 350.0, 2021).also{
  if(it.price < 1000.0) it.addPercentageToPrice(12.5)
}

product.also{
  it.name = it.name.uppercase()
}

println(product.also{
  println("---> $it")
  println("Precio Nuevo")
  it.price *= 0.85 // se cambia el precio del producto
})
```
#### 15.2.4 apply

Se utiliza para configurar (asignar valores) a un objeto.
El contexto: el objeto desde el cual se llama, accesible con this.
Devuelve: el propio objeto (se hace automáticamente).

```kotlin
val product: Product = Product("Nintendo Switch", 350.0, 2021)
product.apply{ 
  name = "Switch OLED" //como this.name = "Switch"
  price = 349.00
}
```

#### 15.2.5 with

Permite agrupar acciones sobre un objeto.
El contexto: el objeto desde el cual se llama, accesible con this.
Devuelve: el resultado de la última instrucción

```kotlin
val product: Product = Product("Nintendo Switch", 350.0, 2021)
with(product){
  println(
    """$name
    | Precio anterior: $price euro
    """.trimMargin()
  )
  if(price < 1000.0) addPercentageToPrice(12.5)
  println("Precio nuevo: $price euros")

  prinln(this)
}
```

### 15.3 Funciones Lambda

Las funciones lambda, también llamadas funciones anónimas o funciones flecha son funciones que no están declaradas (no tienen identificador) y se utilizan como una expresión.

Se escriben entre llaves { }, pueden tener parámetros o no y deben tener un cuerpo.
Si no tiene parámetros se deben poner directamente las instrucciones.

```kotlin
//Simple
{println("Desde una lambda")}

//
{println("Desde una lambda")
text += "!"
text //^lambda
}
//
{ // lambda
  val first10EvenInts: MutableList<Int> = mutableListOf()
  for (i in 0 < until < 10){
    first10EvenInts.add(i * 2)
  }
  first10EvenInts //^lambda
}
```

#### 15.3.1. Funciones flecha 

Si tiene parámetros, para separarlos del cuerpo se utilizan los caracteres ->

En las lambdas escritas anteriormente es Kotlin quien deduce los tipos de datos. Se pueden indicar explícitamente los tipos de datos:
```kotlin
// Si la lambda solo tiene un parámetro se puede omitir y utilizar it:
(String) -> String = {
  "Hola $it! Te saludo desde una lambda" //El parametro seria name
}
//
{x: Int, y: Int -> x + y}
// USO init + LE INDICAMOS NOSOTROS LOS DATOS
(Int, Int) -> MutableList<Int> = { init: Int, final: Int ->
    val evenInterval: MutableList<Int> = mutableListOf()
    for(i int init < until < final){
      if(i % 2 == 0) evenInterval.add(i)
    }
    evenInterval //^lambda
}
```

Las funciones lambda se utilizan como una expresión = deben de estar asignadas a algún elemento. 
Si se asigna una lambda a una variable su uso es el mismo que con una función normal = NO NUEVA FUNCIONALIDAD

```kotlin
val add: (Int,Int) -> Int = {number1: Int, number2: Int -> number1 + number2 }
println(add(3,45)) //nada que no se pueda hacer con una función normal
```

#### 15.3.2. Utilidad y Sintaxis Lambdas;

Las funciones lambda se pueden pasar como parámetros a otras funciones.
Gracias al paso de lambdas como parámetro en funciones se puede:
 Crear funciones callback. 
 Devolver diferentes respuestas desde una función.
 Ofrecer al programador que introduzca su propia lógica

Sintaxis de paso de función lambda como parámetro de una función:
```kotlin 
fun nameOfFun(parameter1: Type, lambdaName: (Type1, Type2…) -> TypeReturn) { … }
```
En el caso de que la lambda no reciba parámetros:
```kotlin 
fun nameOfFun(parameter1: Type, lambdaName: () -> TypeReturn) { … }
```
En el caso de que la lambda no devuelva nada:
```kotlin 
fun nameOfFun(parameter1: Type, lambdaName: (Type1, Type2…) -> Unit) { … }
```
En el caso de que la lambda no reciba parámetros ni devuelva nada:
```kotlin 
fun nameOfFun(parameter1: Type, lambdaName: () -> Unit) { … }
```

#### 15.3.3. Crear funciones callback

Las funciones callback permiten asegurarse que un conjunto de instrucciones se ejecuta después de una instrucción concreta (Cuando se acabe esa función, se ejecuta otra cosa). ej ejecución asíncronca, hilos..

```kotlin 
//Las siguientes funciones sobrecargadas reciben una función lambda que se ejecuta al final de todo el cuerpo de la función doLogin:

fun doLogin(username: String, pass: String, lambda: (String, String) -> Unit){
  //Instrucciones que conectan a la BBDD y se realiza el login
  Thread.sleep(5000)
  lambda(username, pass)
}

fun doLoginGuest(lambda:() -> Unit){
  //Instrucciones que conectan a la BBDD y se realiza el login invitado
  Thread.sleep(5000)
  lambda()
}
```
¿Como sería la llamada?
```kotlin 
doLogin("Rick","c-137",{ username, pass -> println("Login: $username - $pass)})
//Si la función lambda es el último parámetro se puede
sacar fuera de los paréntesis:
doLogin("Morty","Smith" { username, pass -> 
  println("Login: $username - $pass)})
//Si la función lambda es el único parámetro se pueden quitar los paréntesis de la llamada:
doLoginGuest{
  println("Login Invitado")
}
```

#### 15.3.4. Devolver diferentes respuestas desde una función

Se pueden pasar varias funciones lambda como parámetro = se puede ejecutar una u otra función lambda según se necesite

```kotlin 
fun calculare(
  number1: Double,
  number2: Double,
  operation: Char,
  correct: (result: Double) -> Unit,
  error: (error: String) -> Unit
) {
  if (number1 < 0){
    error("El primer numero es menor que 0")
  } else if (number2 < 0){
    error("El segundo numero es menor que 0")
  } else {
      when (operation){
          '+' -> correct(number1 + number2)
          '-' -> correct(number1 - number2)
          '*' -> correct(number1 * number2)
          '/' -> {
            if(number2 == 0.0) error("No se puede dividir entre 0")
            else correct(number1/number2)
          }
          else -> error("Operacion no valida")
      }
  }
}
// Por dentro de la funcion lambda
//tanto en la función correct como en la función error se guarda el resultado obtenido devuelto por lo que solo tendrá efecto última llamada a las funciones lambda sea cual sea:

var result = ""
calculate(
  number1 = 9.0
  number2 = 6.0
  operation = ''
  correct = {
    result = it.toString()
  }
  error = {
    result = it
  }
  println("El resultado es: $result")
)
```

Si se quiere definir un parámetro tipo función lambda como opcional se debe indicar con los caracteres = {}

```kotlin 
fun calculate{
  number1: Double,
  number2: Double,
  operation: Char,
  correct: (result: Double) -> Unit,
  error: (error: String) -> Unit = {} // OPCIONAL
) {
  if (number1 < 0){
    error("El primer numero es menor que 0")
  } else if (number2 < 0){
    error("El segundo numero es menor que 0")
  } else {
      when (operation){
          '+' -> correct(number1 + number2)
          '-' -> correct(number1 - number2)
          '*' -> correct(number1 * number2)
          '/' -> {
            if(number2 == 0.0) error("No se puede dividir entre 0")
            else correct(number1/number2)
          }
          else -> error("Operacion no valida")
      }
  }
}
```

#### 15.3.5. Ofrecer al programador que introduzca su propia lógica

Si la función calculate estuviera en una librería externa al usarla se da la opción al programador de incorporar todas las instrucciones que quiera.

```kotlin 

calculate(
  number1 = 9.0,
  number2 = 6.0,
  operation = '-',
  correct = {
    /*
    Aqui se pueden introducir instrucciones que se desee
    */
  }
  error = {
    /*
    Aqui se pueden introducir instrucciones que se desee
    */
  }
)

```