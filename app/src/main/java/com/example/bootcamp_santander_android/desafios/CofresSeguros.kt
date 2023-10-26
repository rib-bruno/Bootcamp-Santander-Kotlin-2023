package com.example.bootcamp_santander_android.desafios

import java.util.Scanner

abstract class Cofre(protected val tipo: String, protected val metodoAbertura: String) {

    fun imprimirInformacoes() {
        println("Tipo: $tipo")
        println("Metodo de abertura: $metodoAbertura")
    }
}

class CofreDigital(private val senha: Int) : Cofre("Cofre Digital", "Senha") {

    fun validarSenha(confirmacaoSenha: Int): Boolean {
        return confirmacaoSenha == senha
    }
}

class CofreFisico : Cofre("Cofre Fisico", "Chave")

fun main() {
    val scanner = Scanner(System.`in`)

    val tipoCofre = scanner.nextLine()
    // TODO:  Implemente a condição necessário para a verificação dos cofres seguros:

    if (tipoCofre.equals("digital", ignoreCase = true)) {
        val senha = scanner.nextInt()
        val confirmacaoSenha = scanner.nextInt()

        val cofreDigital = CofreDigital(senha)
        //scanner.nextLine()
        // val senhaValida = cofreDigital.validarSenha(confirmacaoSenha)
        cofreDigital.imprimirInformacoes()

        if (cofreDigital.validarSenha(confirmacaoSenha)) {
            println("Cofre aberto!")
        } else {
            println("Senha incorreta!")
        }

    } else  {
        val cofreFisico = CofreFisico()
        cofreFisico.imprimirInformacoes()
    }

}


