package com.example.bootcamp_santander_android.desafios

//Desenvolver um programa que determine em quantos anos a população do país A ultrapassará ou igualará a população do país B. Para isso, considere as seguintes informações:
//
//População Inicial: País A tem N habitantes e País B tem M habitantes, onde N é sempre menor que M.
//Taxas de Crescimento Anual: País A cresce a uma taxa de 3% ao ano, enquanto País B cresce a uma taxa de 1.5% ao ano.
//Cálculo Requerido: O programa deve calcular o número de anos necessários para que a população de A seja igual ou maior que a de B, considerando as taxas de crescimento contínuas.
//Observação: As taxas de crescimento devem ser aplicadas anualmente a partir das populações iniciais.


@Suppress("UNREACHABLE_CODE")
data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() {
       // Criar a lógica de crescimento populacional, usando as propriedades do [Pais]
       habitantes += habitantes * (taxaCrescimento / 100.0)
    }
}

fun main() {
    val habitantesPaisA = readLine()!!.toDouble();
    val habitantesPaisB = readLine()!!.toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        //"Invocar a função que consolida o crescimento anual de cada [Pais]
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()

        //"Garantir de a variável mutável $quantidadeAnos seja atualizada"
        quantidadeAnos++

    }

    println("$quantidadeAnos anos")
}