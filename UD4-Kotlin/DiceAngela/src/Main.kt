//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * @author Angela
 * @version 1.0
 */
/*
Ahora en el main se deben realizar las siguientes acciones:
- Pedir al usuario el número de caras del dado entre 4 y 20 y crear un dado con ese número de caras.
- Realizar una tirada del dado y mostrar el valor obtenido y a continuación, preguntar al usuario si piensa que va a salir un número mayor o menor.
- Repetir las tiradas mientras el usuario acierte (mayor o menor que la anterior).
Ejemplo:
- En la 1ª tirada sale un 12
- El usuario dice mayor
- Se hace una 2ª tirada y sale un 19
- Se vuelve a preguntar al usuario y dice mayor
- Se hace una 3ª tirada y sale 4.
- Se acaba el juego.
Cuando se acabe el juego se debe mostrar la información del dado usado (usando su to_string).*/
fun main() {

}

/*
Crea una clase llamada Dice con las siguientes condiciones:
Tendrá dos propiedades:
 - Una propiedad que se llama faces y será un entero.
 - Una propiedad que se llama quantityOfThrows y será por defecto 0 (cero).
Además:
 - Los setters deben de ser privados.
Tendrá dos constructores:
 - Constructor primario que recibe el número de caras que tiene el dado.
 - Constructor secundario vacío: no recibe ningún parámetro y asignará a faces el valor 6.

Tendrá las siguientes funciones:
 - throwDice: función pública que no recibe ningún parámetro y devolverá el número obtenido de tirar el dado, para calcular ese número puedes usar (1..6).random() con en número de caras (en lugar de 6) para generar un aleatorio. Además sumará uno a la propiedad quantityOfThrows.
 - throwDiceNFaces: función estática (con companion object) que recibe un parámetro entero que indicará el número de caras y devolverá el número obtenido de tirar un dado con ese número de caras.
 - toString: función que devolverá una cadena con la información del dado (número de caras y cantidad de veces que se ha lanzado).
 */

class Dice{
    var faces: Int
    var quantityOfThrows: Int = 0


    constructor(faces:Int)

    constructor()
}

/**
 * Función
 * @param
 * @return devuelve el numero validado que introduce el usuario
 */