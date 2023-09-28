package com.example.bootcamp_santander_android.desafios


//fun main() {
//    val valor = readLine() !!.toDouble()
//    var saldo = readLine() !!.toDouble()
//
//    if (valor > 0) {
//        val novoSaldo = saldo + valor
//        println("Deposito realizado com sucesso!\n" +
//                "Saldo atual: R$ $novoSaldo")
////        saldo = valor
////        println("Deposito realizado com sucesso!\n" +
////                "Saldo atual: R$ $saldo") %.2f%n
//
//    } else if (valor == 0.0) {
//        println("Encerrando o programa...")
//    } else {
//        println("Valor invalido! Digite um valor maior que zero.")
//    }
//}

import java.util.Scanner
import java.text.DecimalFormat

fun main() {
 val scanner = Scanner(System.`in`)
 val valor = scanner.nextDouble()

 val df = DecimalFormat("#.00")

 val valorFormatado = df.format(valor)
 if (valor > 0) {
   println("Deposito realizado com sucesso!")
   println("Saldo atual: R$ $valorFormatado")
  //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
 } else if (valor < 0) {
  println("Valor invalido! Digite um valor maior que zero.")
  //TODO: Imprimir a mensagem de valor inválido.
 } else {
  println("Encerrando o programa...")
  //TODO: Imprimir a mensagem de encerrar o programa.
 }
}