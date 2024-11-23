/**
 * Este programa valida datos del usuario indicando con expresiones si son correctos
 * @author Angela
 * @version 1.0
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

 //Pide al usuario los siguientes datos indicando si son datos correctos validándolos con expresiones regulares.
    // - nombre completo: solo letras, guiones (-) y apóstrofe (') entre 3 y 50 caracteres,
    val checkName = Regex("^[A-Za-z' -]{3,50}$")
    //entre 3 y 50 de mayusculas y minúsculas (cualquier letra) o - o '
    //  - email: formato de dirección de correo electrónico.
    val checkEmail = Regex("^[A-Za-z0-9_.-]+@[A-Za-z0-9_.-]+\\.[A-Za-z]{2,6}\$")
    //mayusuculas, minusculas, (0 al 9), _,. y - + @ (correo) + lo mismo + \\. (tal cual un .) + extension (2 a 6 car)
    //  - dni: 7 u 8 números seguidos de una letra mayúscula.
    val checkDNI = Regex("^\\d{7,8}[A-Z]\$")
    //7 u 8 digitos + cualquier letra mayúscula
    // - edad: número de como máximo 3 cifras.
    val checkAge = Regex("^\\d{1,3}\$")
    // 1 a 3 dígitos
    // - teléfono: número de 9 cifras que debe empezar por 9, 6 o 7.
    val checkPhone = Regex("^[967]\\d{8}\$")
    // empieza por 9 6 o 7 + 8 digitos cualquiera

    // name
    var name: String
    do {
        println("Dime tu nombre (solo letras, guiones (-) y apóstrofe (') entre 3 y 50 caracteres):")
        name = readln()
        if (!name.matches(checkName)) {
            println("Nombre inválido - Debe contener solo letras, guiones (-) y apóstrofe (') entre 3 y 50 caracteres.")
        }
    } while (!name.matches(checkName))
    println("Nombre válido.")

    //email
    var email: String
    do {
        println("Dime tu email (formato de dirección de correo electrónico):")
        email = readln()
        if (!email.matches(checkEmail)) {
            println("Email inválido - Usa el formato de dirección de correo electrónico.")
        }
    } while (!email.matches(checkEmail))
    println("Email válido.")

    //dni
    var dni: String
    do {
        println("Dime tu DNI (7 u 8 números seguidos de una letra mayúscula):")
        dni = readln()
        if (!dni.matches(checkDNI)) {
            println("DNI inválido - Debe ser 7 u 8 números seguidos de una letra mayúscula.")
        }
    } while (!dni.matches(checkDNI))
    println("DNI válido.")

    //age
    var ageStr: String
    do {
        println("Dime tu edad (número de máximo 3 cifras):")
        ageStr = readln()
        if (!ageStr.matches(checkAge)) {
            println("Edad inválida - Debe ser un número de máximo 3 cifras")
        }
    } while (!ageStr.matches(checkAge))
    var age = ageStr.toInt()
    println("Edad válida.")

    //phone
    var phone: String
    do {
        println("Dime tu teléfono (comienza por 9, 6 o 7 + 8 cifras cualquiera = 9 en total):")
        phone = readln()
        if (!phone.matches(checkPhone)) {
            println("Teléfono inválido - Debe ser un número de 9 cifras que empiece por 9, 6 o 7.")
        }
    } while (!phone.matches(checkPhone))
    println("Teléfono válido.")

    println("Datos completos")
    println("Nombre: $name \nEmail: $email \nDNI: $dni\nEdad: $age\nTeléfono: $phone")
}