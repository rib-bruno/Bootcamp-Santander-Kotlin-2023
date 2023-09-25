package com.example.bootcamp_santander_android.examples_functions

data class Person(val name: String?)

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    val person = Person("Ezequiel")
    val s = person.name ?: fail("Name required")
    println(s)
}