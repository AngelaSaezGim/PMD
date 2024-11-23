//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Esta clase se encarga de convertir cantidades de euros a otras monedas.
 * @author Angela
 * @version 1.0
 */

fun main() {

    println("Dime la cantidad de euros")
    var eurosString = readLine()
    println("Tienes $eurosString €")

    //como pillo de un input, antes de convertir me aseguro de que sea no nulo - ?
    eurosString?.let {
        val euros = it.toDouble()
        println("Mostraremos el equivalente en otras divisas:")

        // Realizamos las conversiones
        println("Dólares = ${euros * 1.16} $")
        println("Libras = ${euros * 0.84} £")
        println("Yenes = ${euros * 132.5} ¥")
    } ?: println("No se ingresó una cantidad válida.") // si no = Ponemos esto

}
