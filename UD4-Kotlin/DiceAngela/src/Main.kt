//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * @author Angela
 * @version 1.0
 */

fun main() {

    println("Hola, vamos a simular lanzamientos de dados")

    val numFaces = validateNumFaces()
    val dice = Dice(numFaces)

    println("Dado creado con ${dice.faces} caras, realizamos una tirada")
    // Primera tirada
    var numberThrow = dice.throwDice()
    println("Primera tirada, valor obtenido : $numberThrow")

    var correctAnswer: Boolean = false
    do {
        println("¿Piensas que la siguiente tirada será 'mayor' o 'menor'?")
        val guessInput = readlnOrNull()?.lowercase()

        if (guessInput != "mayor" && guessInput != "menor") {
            println("Respuesta no válida. Por favor, escribe 'mayor' o 'menor'.")
            continue
        }

        // Nueva tirada
        val numberThrow2 = dice.throwDice()
        println("Valor obtenido: $numberThrow2")

        //correctAnswer se pondrá en true si el input y la condición se cumplen (si es MAYOR Y es eso) O (si es MENOR Y es eso)
        correctAnswer = (guessInput == "mayor" && numberThrow2 > numberThrow ) ||
                        (guessInput == "menor" && numberThrow2 < numberThrow)

        if (correctAnswer) {
            println("¡Correcto! Salimos.")
        } else {
            println("¡Has fallado! Continua")
            numberThrow = numberThrow2 //Actualizamos para que el siguiente numero a revisar sea el ultimo que hemos puesto
        }
    } while (!correctAnswer)

    println("Felicidades! Ganaste \nEsta es la información de tus tiradas ; \n ----------- \n $dice. \n ----------- ")

}

/**
 * Función que valida que hemos introducido correctamente el numero de caras en los límites establecidos
 * @return numero de caras del dado
 */

fun validateNumFaces(): Int {
    var inputNumFaces: Int = 0
    do {
        println("En primer lugar, dime cuantas caras tiene el dado (entre 4 y 20)")
        inputNumFaces = readlnOrNull()?.toInt()!!
        if (inputNumFaces < 4 || inputNumFaces > 20) println("Número no válido, debe ser entre 4 y 20")
    } while (inputNumFaces < 4 || inputNumFaces > 20)

    return inputNumFaces;
}

