
fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }

    var divisor = 2

    while (divisor <= number / divisor) {
        if (number % divisor == 0) {
            return false
        }
        divisor++
    }

    return true
}

fun factorial(number: Int): Long? {
    // Validar el rango para evitar resultados incorrectos
    if (number < 0 || number > 20) {
        return null
    }

    var resultado = 1L

    for (i in 2..number) {
        resultado *= i
    }

    return resultado
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    // Numeros para evaluar
    val numeroPrimo = 7
    val numeroFactorial = 5
    val numeroPar = 10

    println("FUNCIONES MATEMATICAS")
    println("----------------------------")

    // Verificar si un numero es primo
    println("$numeroPrimo es primo: ${isPrime(numeroPrimo)}")

    // Calcular el factorial
    val resultadoFactorial = factorial(numeroFactorial)

    if (resultadoFactorial != null) {
        println("Factorial de $numeroFactorial: $resultadoFactorial")
    } else {
        println("Factorial no valido: ingrese un numero de 0 a 20.")
    }

    // Verificar si un numero es par
    println("$numeroPar es par: ${isEven(numeroPar)}")
}
