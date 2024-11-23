/**
 * Esta clase calcula expresiones con 4 numeros pedidos por el usuario.
 * @author Angela
 * @version 1.0
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("first number = ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println("second number = ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println("third number = ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println("fourth number = ")
    val d = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    var res : Double
    res = a+b-c+d
    println("Operation 1 a+b-c+d = $a + $b - $c + $d = $res")

    if (a + b + c + d != 0.0) {
        res = (a * b + c * d) / (a + b + c + d)
        println("Operation 2 (a * b + c * d) / (a + b + c + d) = ($a * $b + $c * $d) / ($a + $b + $c + $d) = $res")
    } else {
        println("Operation 2: No se puede realizar porque la suma (a + b + c + d) es 0.")
    }

    if (d != 0.0) {
        res = a * a + b * b - c / d
        println("Operation 3: a * a + b * b - c / d = $a * $a + $b * $b - $c / $d = $res \n")
    } else {
        println("Operation 3: No se puede realizar porque d es 0 y no se puede dividir por cero. \n")
    }
    var resBool: Boolean = a>b
    println("Operation 4 a>b = $a > $b = $resBool")
    resBool = a-b <= c-d
    println("Operation 5 a-b <= c-d = $a - $b <= $c - $d = $resBool")
    resBool = a>b || c<d
    println("Operation 6 a>b o c<d = $a > $b || $c < $d = $resBool")
    resBool = a<b && c<d || a+b>c-d
    println("Operation 7 a<b y c<d o a+b>c-d = $a < $b && $c < $d || $a + $b > $c - $d = $resBool")
    resBool = a+d<b*(c-a)
    println("Operation 8 a+d<b*(c-a) =  $a + $d < $b * ($c - $a) = $resBool")
}