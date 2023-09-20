package com.example.bootcamp_santander_android


val upperCase1: (String) -> String = {str:  String -> str.uppercase()} //tipando em ambos os casos

val upperCase2: (String) -> String = {str -> str.uppercase()} //

val upperCase3 = {str:String -> str.uppercase()}

val upperCase4 : (String) -> String = {it.uppercase()}

val upperCase5 : (String) -> String = String::uppercase

fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase4("hello"))
    println(upperCase5("hello"))
}