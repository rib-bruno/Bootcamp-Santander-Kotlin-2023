package com.example.bootcamp_santander_android.desafios

object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            (salario in 0.0..1100.0) -> 0.05
            (salario in 1100.01..2500.00) -> 0.10
            else -> 0.15
        }
        return aliquota * salario
    }
}

fun main() {
    //val valorSalario = readLine()!!.toDouble()
    val valorSalario = 2000.0


    //  val valorBeneficio = readLine()!!.toDouble()
    val valorBeneficio = 250.0


    val valorImposto = ReceitaFederal.calcularImposto(valorSalario)
    val saida = valorSalario - valorImposto + valorBeneficio
    println(String.format("%.2f", saida))
}