
class Product(
    val nombre: String,
    val precio: Double,
    val cantidad: Int
) {
    fun calcularValorInventario(): Double {
        return precio * cantidad
    }

    fun mostrarInformacion() {
        println("Producto: $nombre")
        println("Precio unitario: $precio")
        println("Cantidad disponible: $cantidad")
        println("Valor en inventario: ${calcularValorInventario()}")
        println("----------------------------")
    }
}

fun main() {
    val producto1 = Product("Cuaderno", 5000.0, 10)
    val producto2 = Product("Lapiz", 1500.0, 20)
    val producto3 = Product("Borrador", 2000.0, 15)

    println("GESTION DE PRODUCTOS")
    println("----------------------------")

    val productos = listOf(producto1, producto2, producto3)

    for (producto in productos) {
        producto.mostrarInformacion()
    }
}
