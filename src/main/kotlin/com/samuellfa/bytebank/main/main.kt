package com.samuellfa.bytebank.main

fun main() {

    for (i in 5 downTo 1 step 2) {
        val conta = Conta(
            titular = "Samuel",
            numero = 1000,
            saldo = -2.0 + i
        )

        println("titular: ${conta.titular}")
        println("numero da conta: ${conta.numero}")
        println("saldo: ${conta.saldo}")

        conta.testaCondicoes()
    }
}

