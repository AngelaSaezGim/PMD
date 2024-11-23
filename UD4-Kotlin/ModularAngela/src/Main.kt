import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Este programa posee varias funciones, una para mostrar un saludo con el nombre de usuario, y otra para
 * realizar operaciones
 * @author Angela
 * @version 1.0
 */
fun main() {

    val checkName = Regex("^[A-Z][a-zA-Z]*$")
    var username: String? = null
    do {
        println("Ingresa tu nombre (debe empezar con una letra mayúscula y solo contener letras):")
        username = readlnOrNull()
        if (username == null || !checkName.matches(username)) {
            println("Nombre incorrecto, vuelva a introducir")
        }
    } while (username == null || !checkName.matches(username))

    greetings(username)

    //- El programa no acabará hasta que la opción introducida sea cero.
    while (true) {
        println("Dime el primer número")
        val number1: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0 //si es null será 0
        println("Dime el segundo número")
        val number2: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        val numberOption = printMenu()

        if (numberOption == 0) {
            println("Salimos del programa")
            break
        }
        println("El resultado de la operación es ${operateNumbers(numberOption, number1, number2)}")
    }
}

/**
 * Saluda al usuario
 *
 * @param username nombre del usuario
 */

fun greetings(
    username: String,
): Unit {
    println("Hola $username, bienvenido/a!")
}

/**
 * Imprime el menu, y valida la respuesta (lo repite si no es correcta)
 *
 * @return devuelve el numero validado que introduce el usuario
 */
fun printMenu(): Int {
    while (true) {
            println(" 1.- suma \n 2.- resta \n 3.- multiplicar \n 4.- dividir \n 5.- potencia \n 0.- salir.")
            println("Opción:")
            val numberUserOption = readlnOrNull()?.toIntOrNull() //Lo leo, permito comprobación de null y lo paso a int

            if (numberUserOption != null && numberUserOption in 0..5) { //si no es null y es uno de los numeros validos (0,1,2,3,4,5)
                return numberUserOption
            }
        println("Opción no válida, vuelva a introducir el número") //SI NO ES VALIDO SE VOLVERÁ A INTRODUCIR
    }
}
/**
 * Imprime el menu, y valida la respuesta (lo repite si no es correcta)
 * @param operationNumber numero recogido en la función anterior, nos indica que operación vamos a hacer
 * @param number1 primer numero que hemos preguntado
 * @param number2 segundo numero que hemos preguntado
 * @return devuelve el resultado de la operación elegida
 */
fun operateNumbers(
    operationNumber: Int,
    number1: Double,
    number2: Double,
): Double {
    return when (operationNumber) {
        1 -> number1 + number2
        2 -> number1 - number2
        3 -> number1 * number2
        4 -> if (number2 != 0.0) number1 / number2 else {
            println("Error, no se puede dividir entre 0")
            0.0
        }
        5 -> number1.pow(number2)
        else -> {
            println("Operación no válida.")
            0.0
        }
    }
}