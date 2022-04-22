/* Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele*/

fun main() {
    println("Seja bem vindo(a) ${coletarDados()}!")
}

fun coletarDados(): String{
    println("Informe o seu nome: ")
    val nome = readln()

    return nome
}