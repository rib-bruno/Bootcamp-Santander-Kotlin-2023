package com.example.bootcamp_santander_android.desafios

//Após uma análise cuidadosa realizada pela equipe de desenvolvimento de uma empresa bancaria, foi identificado a necessidade de uma nova funcionalidade para otimizar os processos e melhorias da experiência dos usuários. Agora, sua tarefa é implementar uma solução que organize em ordem alfabética uma lista de ativos que será informada pelos usuários. Os ativos são representados por strings que representam seus tipos, como por exemplo: Reservas de liquidez, Ativos intangiveis e dentre outros.
//
//Entrada
//A primeira entrada consiste em um número inteiro que representa a  quantidade de ativos que o usuário possui. Em seguida, o usuário deverá  informar, em linhas separadas, os tipos (strings) dos respectivos ativos.
//
//Saída
//Seu programa deve exibir a lista de Ativos organizada em ordem alfabética. Cada ativo deve ser apresentado em uma linha separada.
//ex: 3
//Financiamento de Imovel
//Deposito
//Reservas Bancarias
//TODO: Ordenar os ativos em ordem alfabética.

//TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.

fun main() {

    val ativos = mutableListOf<String>()

    // Entrada da quantidade de ativos
    val quantidadeAtivos = 3

    // Entrada dos códigos dos ativos
    for (i in 1..quantidadeAtivos) {
        val codigoAtivo = "Bruno"
        ativos.add(codigoAtivo)
    }
    //organizando em ordem alfabetica usando sort
    ativos.sort()
    //imprimir por linha
    for (ativo in ativos) {
        println(ativo)
    }

}