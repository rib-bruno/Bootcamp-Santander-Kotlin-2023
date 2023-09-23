package com.example.bootcamp_santander_android.examples_functions

import java.io.IOException


class IllegalVoterException(message: String) : Throwable(message)
@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int) {
    if (age < 16) {
        throw IllegalVoterException("$name não pode votar! É preciso ter 16 anos ou mais!")
        // throw IOException("$name não pode votar! É preciso ter 16 anos ou mais!")
    }
    println("Voto de $name realizado com sucesso!")
}
fun main() {
    vote("Venilton", 33)
    vote("Maria", 65)
    vote("Bruno", 9)
}