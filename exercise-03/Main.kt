
fun main() {
    // Numero para generar la tabla
    val numero = 7

    // Variable para acumular los resultados
    var suma = 0

    println("Tabla de multiplicar del $numero")
    println("----------------------------")

    // Generar la tabla del 1 al 10
    for (i in 1..10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")

        suma += resultado
    }

    // Mostrar la suma total
    println("----------------------------")
    println("Suma de los resultados: $suma")
}
