import kotlin.system.exitProcess

/*Crie um algoritmo, utilizando laços de repetição aninhados, que exiba
na tela a tabuada de multiplicação dos números de 1 a 9
* */

fun main() {
    menuu()
}

fun inserirDadosTabuada() {
    println("|------Por favor, informe o número que deseja saber a tabuada = ------|")
    var n = readln().toInt()
    tabuada(n)
}

fun tabuada(n: Int) {
    var total = 0
    println("|-----------------------------Tabuada de $n = -------------------------|")
    for (i in 0..10) {

        total = i * n
        println("$n * $i = $total")
    }
}

fun menuu() {
    do {
        println("|----------------Bem vindo ao Sistema de Tabuadas------------------|")
        println("|----------------Por favor, Digite a opção desejada:---------------|")
        println("|----------------01 - Inserir informações -------------------------|")
        println("|----------------02 - Sair-----------------------------------------|")

        when (readln().toInt()) {
            1 -> inserirDadosTabuada()
            2 -> {
                println("Obrigada por utilizar nosso sistema :)")
                exitProcess(0)
            }
            else -> println("Opção Inválida, digite novamente: ")

        }
    }while (true)
}
