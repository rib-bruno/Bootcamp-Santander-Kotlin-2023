package com.example.bootcamp_santander_android.desafios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val entrada = scanner.nextLine()
    val partes = entrada.split(",".toRegex()).toTypedArray()

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.

    val data = partes[0]
    val hora = partes[1]
    val descricao = partes[2]
    val valor = partes[3].toDouble()

    val transacoesBancarias = Transacao(
        data,
        hora,
        descricao,
        valor
    )
    transacoesBancarias.imprimir()

    //poderia fazer um bloco if/else aqui pra melhorar
}

class Transacao(
    private val data: String,
    private val hora: String,
    private val descricao: String,
    private val valor: Double
) {

    fun imprimir() {
        println(descricao)
        println(data)
        println(hora)
        System.out.printf("%.2f", valor)
    }
}