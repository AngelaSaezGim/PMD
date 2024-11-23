/**
\* Programa que crea una matriz de NxN, la rellena y luego podemos hacer diversas opciones con ella.
\*
\* @author Angela
\* @version 1.0
 */

import kotlin.random.Random

fun main() {

    // Pedir el tamaño de la matriz N
    //El programa pedirá al usuario un número N entre 3 y 6.
    println("Introduce el valor de N (entre 3 y 6):")
    val valueN = readlnOrNull()?.toIntOrNull()
    if (valueN == null || valueN !in 3..6) {
        println("Número no válido. N debe ser entre 3 y 6.")
        return
    }

    //  Con ese número creamos una matriz de NxN con números aleatorios entre 0 y 9
    val matrix = Array(valueN) { IntArray(valueN) { Random.nextInt(0, 10) } }

    // Bucle principal - Después de realizar cada acción volverá a mostrar el menú
    while (true) {
        //A continuación, mostrará un menú y según la opción elegida realizará la acción indicada.
        println("Menú:")
        println("1.- Rellenar matriz")
        println("2.- Mostrar matriz")
        println("3.- Buscar número")
        println("4.- Añadir +1 a cada elemento de la matriz")
        println("0.- Salir")
        val input = readlnOrNull()

        when (input) {
            "1" -> fillMatrix(matrix)
            "2" -> printMatrix(matrix)
            "3" -> searchNumber(matrix)
            "4" -> addOne(matrix)
            "0" -> {
                println("ADIOS!!!")
                break //  El programa solo acabará al introducir la opción de salir. (Se acaba while(true))
            }

            else -> {
                //Si se introduce una opción no válida en el menú se mostrará un error antes de volver a mostrar el menú.
                println("ERROR - elige una opción válida.")
            }
        }
    }
}

/**
 * Rellena la matriz con números aleatorios entre 0 y 9.
 *
 * @param matrix
 * @return matrix que ha sido modificada (se le han añadido numeros aleatorios)
 */

fun fillMatrix(matrix: Array<IntArray>) : Array<IntArray> {
    // Opción 1: Rellenar matriz con números aleatorios entre 0 y 9
    //Accedemos y recorremos la matriz NxN - cambiamos los valores y rellenamos con numeros aleatorios
    for (row in matrix) {
        for (column in row.indices) {
            row[column] = Random.nextInt(0, 10)
        }
    }
    println("Matriz rellenada correctamente")
    return matrix //devuelve matriz modificada
}

/**
 * Imprime la matriz
 *
 * @param matrix
 */

// Opción 2: Mostrar la matriz
//Si aún no se ha rellenado la matriz las opciones 2 a 4 deben de mostrar un mensaje indicando que la matriz está vacía.
fun printMatrix(matrix: Array<IntArray>) {
    if (matrix.isEmpty()) {
        println("La matriz está vacía. Rellénala antes")
    } else {
        println("Mostrando la matriz:")
        for (row in matrix) {
            for (column in row) {
                print("$column ")
            }
            println()
        }
    }
}

/**
 * Busca un número en la matriz e imprime su fila y columna en la matriz
 *
 * @param matrix
 */

fun searchNumber(matrix: Array<IntArray>) {
    // Opción 3: Buscar número en la matriz
    println("Introduce el número a buscar (entre 0 y 9):")
    val num = readlnOrNull()?.toIntOrNull()

    if (num != null && num in 0..9) {
        var found = false
        matrix.forEachIndexed { i, row ->
            row.forEachIndexed { j, value ->
                if (value == num) {
                    println("El número $num se encuentra en la fila ${i + 1}, columna ${j + 1}.")
                    found = true
                }
            }
        }
        if (!found) {
            println("El número $num no se encuentra en la matriz.")
        }
    } else {
        println("Número no válido. Debe estar entre 0 y 9.")
    }
}

/**
 * Añade +1 a cada elemento de la matriz. Si el número llega a 10, se convierte en 0.
 *
 * @param matrix La matriz en la que se sumarán los valores.
 * @return matrix que ha sido modificada (se le ha sumado +1)
 */

fun addOne(matrix: Array<IntArray>) : Array<IntArray> {
    // Opción 4: Añadir uno a cada elemento de la matriz
    if (matrix.isEmpty()) {
        println("La matriz está vacía. Rellénala antes")
    } else {
        //Como en el primero, recorremos cada elemento de la matriz y le sumamos uno
        for (row in matrix) {
            for (column in row.indices) {
                // Si es 10 al sumarlo +1, el elemento se convierte en 0, si no, sumamos 1
                row[column] = if (row[column] + 1 == 10) 0 else row[column] + 1
            }
        }
        println("Se ha añadido 1 a cada elemento de la matriz. Si algún valor es 10, pasará a ser 0.")
    }
    return matrix //devuelve matriz modificada
}

