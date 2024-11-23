/**
 * Programa que rellena una colección y luego indica cuales son pares.
 *
 * @author Angela
 * @version 1.0
 */

fun main() {

    //Como voy a ir añadiendo y metiendo cantidad variables de números uso colección mutable - la inicializo
    var numbersCollection = mutableListOf<Int>()

    //PRIMER BUCLE (hasta Salir)
    var exit = false
    while (!exit) {
        //rellenamos (primera vez)
        numbersCollection = fillCollection(mutableListOf())
        //mostramos la colección y los numeros pares (dentro está la funcion para sacarlos)
        printEvenCollection(numbersCollection)

        //SEGUNDO bucle (introducir más numeros o salir)
        var validInput = false
        while (!validInput) {
            //Ahora dejamos elegir al usuario entre la ópcion de Continuar, Acabar (Salir)
            println("¿Que deseas hacer ahora? \n 1. Introducir más numeros \n 2. Salir del programa")
            val input = readlnOrNull()

            when (input) {
                "1" -> {
                    println("Continuamos...")
                    // TERCER Bucle para elegir si usar la colección actual o empezar de nuevo
                    var validInput2 = false
                    while (!validInput2) {
                        println("Opción a elegir \n1. Nueva colección \n2. Usar la colección previa")
                        val option = readlnOrNull()
                        when (option) {
                            "1" -> {
                                // nueva colección vacía
                                numbersCollection = fillCollection(mutableListOf())
                                printEvenCollection(numbersCollection)
                                validInput2 = true //salimos tercer bucle (volvemos a añadirmás/salir)
                            }

                            "2" -> {
                                // usamos la colección previa
                                numbersCollection = fillCollection(numbersCollection)
                                printEvenCollection(numbersCollection)
                                validInput2 = true //salimos tercer bucle
                            }

                            else -> println("Opción sobre la colección no valida. Elige 1 o 2.")
                        }
                    }
                }
                //SALIR
                "2" -> {
                    // Si elige "2", terminamos el programa
                    println("FIN DEL PROGRAMA, ¡ADIOSSS !!!!")
                    exit = true //Salimos primer bucle
                    validInput = true // Salimos segundo bucle
                }

                else -> println("Opción de continuar o salir no válida. Elige 1 o 2.")
            }
        }
    }
}

/**
 * Funcion que pide numeros al usuario y los rellena en un array
 * @param colección anterior con sus numeros (si hay)
 * @return colección rellenada con los numeros que hemos escogido
 */

fun fillCollection(
    previousCollection: MutableList<Int>
): MutableList<Int> {
    /*Va a devolver siempre una colección con sus valores, pero
     si hay una colección previa rellenada, actuamos sobre ella (apply)*/
    return previousCollection.apply {
        while (true) {
            println("Dime un número entero para añadir a la colección (poner 'fin' para salir).")
            val input = readlnOrNull()
            if (input.equals("fin")) break

            val number = input?.toIntOrNull()
            if (number != null) {
                add(number)
                println("Número $number agregado.")
            } else {
                println("Número no válido. Introduce un número entero o 'fin' para salir.")
            }
        }
    }
}

/**
 * Funcion que saca el numero de pares que hay en una colección
 * @param coleccion que vamos a analizar para ver cuales son pares
 * @return cantidad de numero de pares que hay en la colección
 */

fun countEvenNumbersCollection(collectionOfNumbers: MutableList<Int>): Int {
    return collectionOfNumbers.count { it % 2 == 0 }
}

/**
 * Funcion extra que he añadido para imprimir la coleccion - USAMOS DENTRO EL METODO DE SACAR PARES
 * @param coleccion que vamos a sacar para printear
 * @return cantidad de numero de pares que hay en la colección
 */
fun printEvenCollection(collectionOfNumbers: MutableList<Int>) {
    println("Colección: ${collectionOfNumbers.joinToString()}")
    val evenCount = countEvenNumbersCollection(collectionOfNumbers)
    println("La colección tiene $evenCount números pares.")
}
