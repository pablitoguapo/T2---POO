package com.example.lib

abstract class Vehiculo(val marca: String, val velocidadMaxima: Int) {
    abstract fun tipoVehiculo(): String
    fun mostrarInfo() {
        println("${tipoVehiculo()}: $marca — Vel. máx: $velocidadMaxima km/h")
    }
}
class Auto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Auto"
}

class Moto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Moto"
}

class Camion(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Camión"
}
// TODO: Crea Moto y Camion de forma similar
fun main() {
    val vehiculos: List<Vehiculo> = listOf(
        Auto("Toyota", 180),
        Moto("Honda", 220),
        Camion("Volvo", 120)
    )
    // TODO: Recorre la lista y llama mostrarInfo() en cada vehículo
    for (vehiculo in vehiculos) {
        vehiculo.mostrarInfo()
    }
}