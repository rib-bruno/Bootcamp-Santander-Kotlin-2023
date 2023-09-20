package com.example.bootcamp_santander_android

//qualquer tipo de objeto vai ter esse nullsafetostring
fun <T> T?.nullSafeToString() = this?.toString() ?: "Ausência de valor"

fun main() {
    println("kotlin".nullSafeToString())
    println(null.nullSafeToString())
}