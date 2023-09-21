package com.example.bootcamp_santander_android.examples_functions

//High Order Function - passar uma outra função como parâmetro
fun calculate (x: Int, y: Int, operation: (Int, Int) -> Int) : Int{
    return operation(x,y)
}

fun sum(x:Int, y: Int) = x + y

fun main(){
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5 ) {a, b -> a * b} //função lambda/dinâmica
    println("sumResult $sumResult, mulResult $mulResult")
}

