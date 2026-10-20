
fun main() {
    // Datos del estudiante
    val nombre = "Santiago"
    val nota1 = 4.0
    val nota2 = 4.5
    val nota3 = 5.0

    // Validar el rango de las calificaciones
    val notasValidas = nota1 in 0.0..5.0 &&
                       nota2 in 0.0..5.0 &&
                       nota3 in 0.0..5.0

    if (!notasValidas) {
        println("Error: las notas deben estar entre 0.0 y 5.0.")
        return
    }

    // Calcular el promedio
    val promedio = (nota1 + nota2 + nota3) / 3.0

    // Clasificar al estudiante
    val estado = if (promedio >= 3.0) {
        "Aprobado"
    } else {
        "Reprobado"
    }

    val excelente = if (promedio >= 4.5) {
        "Si"
    } else {
        "No"
    }

    // Mostrar los resultados
    println("Estudiante: $nombre")
    println("Calificaciones: $nota1, $nota2, $nota3")
    println("Promedio: $promedio")
    println("Estado: $estado")
    println("Promedio excelente: $excelente")
}
