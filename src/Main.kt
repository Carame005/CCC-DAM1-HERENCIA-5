fun main(){
    val estudiante = Estudiante("Pepe",658987,"Tercero")
    val profesor = Profesor("Roberto",987624,"Robotica")
    val visitante = Visitante("Anacleto",654258)

    val libro = Libro("Indigno De Ser Humano","Osamu Dazai",1948)

    println(puedeTomarPrestado(estudiante,libro))
    println(puedeTomarPrestado(profesor,libro))
    println(puedeTomarPrestado(visitante,libro))
}