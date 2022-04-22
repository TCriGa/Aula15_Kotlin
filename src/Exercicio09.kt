import kotlin.system.exitProcess

/*Escreva um algoritmo que leia a quantidade de funcionários em uma
empresa e, para cada funcionário leia seu nome e seu tempo de
serviço (em meses). Se o funcionário possuir mais de 12 meses na
empresa, escreva a mensagem “<NOME>tem direito aférias”. Caso
contrário, escreva a mensagem “<NOME>não tem direito aférias”. Ao
final, exiba quantos funcionários possuem direito a férias e quantos
não possuem
* */

fun main() {
    funcionarios()
}

fun menu() {
    println("|--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*---|")
    println("|        Por favor, digite a opção desejada:           |")
    println("|------------------------------------------------------|")
    println("|--------------01 - Visualizar informações-------------|")
    println("|--------------03 - Sair ------------------------------|")
    println("|------------------------------------------------------|")
}

fun funcionarios() {
    println("|--*--*  Bem vindo ao sistema de GeekCalc *--*---------|")
    println()
    println("Por gentileza. Informe qual a quantidade de funcionário na empresa: ")
    val funcionario = readln().toInt()
    val tempoServico = arrayOfNulls<Int>(funcionario)
    val nomeFuncionario = arrayOfNulls<String>(funcionario)

    nomeTempoServico(tempoServico, nomeFuncionario)
}


fun nomeTempoServico(tempoServico: Array<Int?>, nomeFuncionario: Array<String?>) {
    tempoServico.forEachIndexed { i, _ ->
        println("Informe o nome do ${(i + 1)}º funcionário: ")
        nomeFuncionario[i] = readln()


        println("Informe o tempo de serviço: ")
        tempoServico[i] = readln().toInt()
    }
    mostrarMenu(nomeFuncionario, tempoServico)
}

fun direitoFerias(nomeF: Array<String?>, tempoServico: Array<Int?>) {
    var contador1 = 0
    var contador2 = 0

    nomeF.forEachIndexed { i, _ ->
        when {
            tempoServico[i]!! >= 12 -> {
                contador1++
                println("O(A) funcionário (a) ${(nomeF[i])} tem direito a férias")
            }
            else -> {
                contador2++
                println("O(A) funcionário ${nomeF[i]} não tem direito a férias")
            }

        }

    }
    println("$contador1 de funcionários tem direito a férias")
    println("$contador2 de funcionários não tem direito a férias")
    println()
    mostrarMenu(nomeF, tempoServico)
}

fun mostrarMenu(nomeFuncionario: Array<String?>, tempoServico: Array<Int?>) {
    menu()
    when (readln().toInt()) {
        1 -> funcionarios()

        2 -> {
            direitoFerias(nomeFuncionario, tempoServico)
        }
        3 -> {
            println("Obrigada por usar o nosso sistema :)")
            exitProcess(0)
        }
    }
}

