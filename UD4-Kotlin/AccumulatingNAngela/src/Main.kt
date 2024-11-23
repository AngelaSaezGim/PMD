/**
 * Programa que pide a usuario numeros y muestra la suma de esos numeros
 * @author Angela
 * @version 1.0
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Dime un numero (tamaño)")
    var numberN = 0
    try {
        numberN = readln().toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("Por favor ingresa un número entero. Error: ${e.message}")
    }

    val arrayNumbers = IntArray(numberN)
    var sum = 0

    for (index in 0..<numberN) {
        println("Dime el ${index + 1}º numero")
        var num = 0
        try {
            num = readln().toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("Por favor ingresa un número entero. Error: ${e.message}")
        }
        // Si el número es positivo, se suma
        if (num > 0) {
            println("$num es positivo! - lo sumamos")
            arrayNumbers[index] = num
            sum += num
        }
        //Si no es positivo - no se sumará (aunque entiendo que si se añade al array)
        else {
            println("El número $num no es positivo y no se sumará.")
            arrayNumbers[index] = num
        }
    }
    println("Numeros agregados ${arrayNumbers.joinToString(", ")} \nSu SUMA contando solo a los positivos es = $sum")

}