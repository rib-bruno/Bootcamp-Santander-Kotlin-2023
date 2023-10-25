package com.example.bootcamp_santander_android.desafios

import java.util.Scanner

class ContaBancaria(private val numeroConta: Int, private val nomeTitular: String, private val saldo: Double) {
    fun getNumeroConta(): Int {
        return numeroConta
    }

    fun getNomeTitular(): String {
        return nomeTitular
    }

    fun getSaldo(): Double {
        return saldo
    }
}

fun main() {
    val scanner = Scanner(System.`in`)


    val numeroConta = 101010


    val nomeTitular = "Caio Carlos"


    val saldo = 98.0

    // Criar uma instância de "ContaBancaria" com os valores de entrada.
    val conta = ContaBancaria(numeroConta, nomeTitular, saldo)

    println("Informacoes:")
    // Imprimir as informações da conta usando o objeto criado acima.
    println("Número da Conta: ${conta.getNumeroConta()}")
    println("Nome do Titular: ${conta.getNomeTitular()}")
    println("Saldo da Conta: R$ ${conta.getSaldo()}")
}