package com.example.bootcamp_santander_android

fun main() {
    val a = 10
    val b = 2

//    try {
//        val divisao = a/b
//        println(divisao)
//    } catch (e: ArithmeticException) {
//        println("Ocorreu uma exceção aritimética")
//
//        //exeção mais genérica
//    } catch (e: Throwable) {
//        println(e.message)
//        //opcional, sempre será executado - >interessante usar quando tiver buffer para fechar
//    } finally {
//        println("Finally executado!")
//    }

    val divisao = try {
        println("o resultado da divisão é:")
        a / b

    } catch (e: ArithmeticException) {
        println("Divisao com erro!")
        null
    }
    println(divisao)
}