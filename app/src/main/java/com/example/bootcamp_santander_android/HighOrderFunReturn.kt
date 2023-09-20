package com.example.bootcamp_santander_android

//retornar função será a execução dela

//retornando uma função que recebe um inteiro e retorna um inteiro
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main(){
    val func = operation()//instanciar a função
    println(func(2))//e chama como parâmetro
}
