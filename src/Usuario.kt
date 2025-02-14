sealed class Usuario {
    abstract val nombre: String
    abstract val id: Int
}

class Estudiante(override val nombre: String, override val id: Int, val grado: String) : Usuario()
class Profesor(override val nombre: String, override val id: Int, val especialidad: String) : Usuario()
class Visitante(override val nombre: String, override val id: Int) : Usuario()

fun puedeTomarPrestado(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Estudiante -> "✅ ${usuario.nombre} puede tomar prestado '${libro.titulo}' por 2 semanas."
        is Profesor -> "✅ ${usuario.nombre} puede tomar prestado '${libro.titulo}' por 1 mes."
        is Visitante -> "❌ ${usuario.nombre} no puede tomar prestado libros."
    }
}