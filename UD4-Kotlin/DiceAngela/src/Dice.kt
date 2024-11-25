//Constructor primario que recibe el número de caras que tiene el dado.
class Dice(faces: Int){

    var faces: Int = faces
        private set

    var quantityOfThrows: Int = 0
        private set;

    //Constructor secundario que no recibe ningun parámetro y asigna a faces valor 6
    constructor() : this(6)

    /**
     * Función que simula el lanzamiento del dado actual y suma los lanzamientos
     * @return resultado aleatorio entre 1 y el número de caras del dado
     */
    fun throwDice(): Int {
        quantityOfThrows++
        return (1..faces).random()
    }

    /**
    \* Función estática que simula el lanzamiento de un dado con un número específico de caras
    \* @param faces número de caras del dado
    \* @return número aleatorio entre 1 y el número de caras
     */
    companion object {
        fun throwDiceNFaces(faces: Int): Int {
            return (1..faces).random()
        }
    }

    /**
     * Función que nos da la información del objeto dado
     * @return String con número de caras y cantidad de lanzamientos
     */
    override fun toString() : String{
        return "Nº de Caras; $faces \n Lanzamientos realizados; $quantityOfThrows"
    }
}