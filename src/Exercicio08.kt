/*Crie um algoritmo que escreve o seu nome completo, colocando uma
palavra em cada linha
* */

fun main() {
    adicionarNome()
}

fun adicionarNome(){

    println("Por favor, informe o seu nome completo:")
    var nomeCompleto = readln()

    nomeEmCadaLinha(nomeCompleto)
}

fun nomeEmCadaLinha(nomeCompleto: String) {


        println("${nomeCompleto.replace(" ", " \n")}  \n")


}