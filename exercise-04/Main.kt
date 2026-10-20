
fun main() {
    // Lista de numeros enteros
    val numeros = listOf(12, 7, 25, 4, 18, 9, 30, 11, 6, 15)

    // Variables para los calculos
    var suma = 0
    var mayor = numeros[0]
    var menor = numeros[0]
    var pares = 0
    var impares = 0

    println("ANALISIS DE UNA LISTA")
    println("----------------------------")
    println("Elementos: $numeros")

    // Recorrer y analizar los elementos
    for (numero in numeros) {
        suma += numero

        if (numero > mayor) {
            mayor = numero
        }

        if (numero < menor) {
            menor = numero
        }

        if (numero % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }

    // Calcular el promedio
    val promedio = suma.toDouble() / numeros.size

    // Mostrar los resultados
    println("----------------------------")
    println("Cantidad de elementos: ${numeros.size}")
    println("Suma: $suma")
    println("Promedio: $promedio")
    println("Numero mayor: $mayor")
    println("Numero menor: $menor")
    println("Numeros pares: $pares")
    println("Numeros impares: $impares")
}
