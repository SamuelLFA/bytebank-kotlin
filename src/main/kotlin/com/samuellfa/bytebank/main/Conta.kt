package com.samuellfa.bytebank.main

data class Conta (
    val titular: String,
    val numero: Int,
    val saldo: Double
) {
    fun testaCondicoes() {
        when {
            saldo > 0.0 -> println("a conta eh positiva")
            saldo == 0.0 -> println("a conta eh neutra")
            else -> println("a conta eh negativa")
        }
    }
}