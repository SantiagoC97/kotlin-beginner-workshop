
class Contact(
    val nombre: String,
    val telefono: String,
    val correo: String
)

// Agregar un nuevo contacto
fun agregarContacto(contactos: MutableList<Contact>, contacto: Contact) {
    contactos.add(contacto)
    println("Contacto agregado: ${contacto.nombre}")
}

// Mostrar todos los contactos
fun listarContactos(contactos: List<Contact>) {
    if (contactos.isEmpty()) {
        println("La agenda esta vacia.")
        return
    }

    for (contacto in contactos) {
        println("${contacto.nombre} | ${contacto.telefono} | ${contacto.correo}")
    }
}

// Buscar un contacto por nombre
fun buscarContacto(contactos: List<Contact>, nombre: String) {
    val encontrado = contactos.find { it.nombre.equals(nombre, ignoreCase = true) }

    if (encontrado != null) {
        println("Contacto encontrado: ${encontrado.nombre} | ${encontrado.telefono} | ${encontrado.correo}")
    } else {
        println("No existe el contacto: $nombre")
    }
}

// Eliminar un contacto por nombre
fun eliminarContacto(contactos: MutableList<Contact>, nombre: String) {
    val encontrado = contactos.find { it.nombre.equals(nombre, ignoreCase = true) }

    if (encontrado != null) {
        contactos.remove(encontrado)
        println("Contacto eliminado: ${encontrado.nombre}")
    } else {
        println("No existe el contacto: $nombre")
    }
}

fun main() {
    // Crear una lista mutable con cinco contactos
    val contactos = mutableListOf(
        Contact("Ana", "3000000001", "ana@example.com"),
        Contact("Luis", "3000000002", "luis@example.com"),
        Contact("Maria", "3000000003", "maria@example.com"),
        Contact("Carlos", "3000000004", "carlos@example.com"),
        Contact("Sofia", "3000000005", "sofia@example.com")
    )

    println("AGENDA DE CONTACTOS")
    println("--- Lista inicial ---")
    listarContactos(contactos)

    println("--- Agregar ---")
    agregarContacto(contactos, Contact("Laura", "3000000006", "laura@example.com"))

    println("--- Buscar ---")
    buscarContacto(contactos, "Laura")
    buscarContacto(contactos, "Pedro")

    println("--- Eliminar ---")
    eliminarContacto(contactos, "Laura")
    eliminarContacto(contactos, "Pedro")

    println("--- Lista final ---")
    listarContactos(contactos)
}
