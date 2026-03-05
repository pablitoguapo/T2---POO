package com.example.lib

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        saldo = cantidad + saldo
        println("Nuevo saldo: $saldo")
    }
    fun retirar(cantidad: Double) {

        if (cantidad > saldo){
            println("Error")
        } else {
            saldo = saldo - cantidad
            println("Nuevo saldo: $saldo")
        }

    }
    fun mostrarSaldo() {
        println("Tu saldo actual es: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
    }