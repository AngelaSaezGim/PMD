import kotlin.math.sqrt

/**
 * Programa que indica al usuario si los numeros son primos o no
 * @author Angela
 * @version 1.0
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Comprueba si los números son primos by Angela")
    var continueAsking = true //por defecto true

    do {
        println("Dime un numero")
        val num = readln().toInt()

        // Lógica para verificar si el número es primo (como si fuese una funcion)
        //se que puedo usar val isPrime = num > 1 && (2..sqrt(num.toDouble()).toInt()).none { num % it == 0 } pero me parece mas explicativo esto
        val isPrime = if (num > 1) {
            var prime = true //por defecto es primo
            // comprobar si es divisible por algún número entre (for-in) 2 y la raíz cuadrada de num
            // (Math.sqrt(num.toDouble()).toInt() obtiene raíz cuadrada de num y la convierte en un número entero.
            for (i in 2..sqrt(num.toDouble()).toInt()) {
                // Por cada número i en el rango..
                // verificamos num entre i y si su resto es 0.
                if (num % i == 0) {
                    prime = false //Si resto 0 = num divisible por i = no es primo - salimos
                    break
                }
            }
            prime //Si pasa todo los filtros será primo (se matiene en true)
        } else {
            false // num < o igual a 1 = No es primo
        }

        //PRINTEAMOS
        println(if (isPrime) "$num ES un número primo." else "$num NO ES un número primo.")

        //SI QUEREMOS OTRO..
        var answer: String
        do {
            println("¿Quieres comprobar otro? (sí/no):")
            answer = readln().lowercase() //por si lo pongo en mayusculas

            when (answer) {
                "sí", "si" -> { //respuesta es sí o si
                    continueAsking = true
                    println("Seguimos con otro numero")
                }

                "no" -> { //respuesta es no
                    continueAsking = false
                    println("Dejamos de comprobar números.")
                }
                // si es otra respuesta - printeamos esto
                else -> println("$answer es una respuesta no válida. Ingresa 'sí' o 'no'.")
            } // Volveremos a repetir mientras respuesta NO sea sí, si o no
        } while (answer !in listOf("sí", "si", "no"))

    } while (continueAsking) //se pide num mientras comprobar sea true (hasta que pongamos NO)

    println("Adios!!!")

}