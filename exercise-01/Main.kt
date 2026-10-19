
fun main() {
    // Datos de entrada
    val numero1 = 12.0
    val numero2 = 4.0
    val operacion = '/'

    // Seleccion de la operacion matematica
    when (operacion) {
        '+' -> println("Resultado: ${numero1 + numero2}")

        '-' -> println("Resultado: ${numero1 - numero2}")

        '*' -> println("Resultado: ${numero1 * numero2}")

        '/' -> {
            if (numero2 != 0.0) {
                println("Resultado: ${numero1 / numero2}")
            } else {
                println("Error: no se puede dividir entre cero.")
            }
        }

        else -> println("Error: operacion no valida.")
    }
}
