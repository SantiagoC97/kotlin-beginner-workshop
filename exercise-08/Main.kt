
fun generarSaludo(nombre: String?): String {
    return if (nombre.isNullOrBlank()) {
        "Hola, bienvenido."
    } else {
        "Hola, $nombre. Bienvenido."
    }
}

fun main() {
    // Pruebas con diferentes valores
    println(generarSaludo("Santiago"))
    println(generarSaludo(null))
    println(generarSaludo(""))
    println(generarSaludo("   "))
    println(generarSaludo("Ana"))
}
