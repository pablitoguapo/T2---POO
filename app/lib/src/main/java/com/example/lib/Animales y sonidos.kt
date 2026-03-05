package com.example.lib

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
       println("Guauuu")
    }
}
class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Miauu")
    }
}
class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Muuu")
    }
}

// TODO: Crea Gato y Vaca de forma similar
fun main() {
    val perro = Perro("Rex", 3)
    val gato = Gato("Garfield", 2)
    val vaca = Vaca("Lola", 1)

    perro.describirse()
    perro.hacerSonido()
    gato.describirse()
    gato.hacerSonido()
    vaca.describirse()
    vaca.hacerSonido()
}
    // TODO: Crea y usa Gato y Vaca
