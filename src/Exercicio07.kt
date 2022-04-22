/*Uma escola possui um determinado número de turmas. Crie um
algoritmo que leia a quantidade de turmas existentes na escola. Para
cada turma, leia a quantidade de alunos e, para cada aluno, leia a sua
média no semestre. Informe a média de cada uma das turmas.
* */
fun main() {
    turmas()
}

fun turmas() {

    println("| ----------Bem vindo ao Sistema de Escola Gayva--------------------------|")
    println("|-----------Informe o número de turmas existentes: -----------------------|")
    val turmas1 = readln().toInt()

    alunos(turmas1)

}

fun alunos(turmas1: Int) {
    val qtddAlunos = IntArray(turmas1)

    qtddAlunos.forEachIndexed { i, _ ->
        println("|-----------------Informe a quantidade de alunos da ${(i + 1)} Turma ---------|")
        val qtddT = readln().toInt()


        val notas = IntArray(qtddT)
        notas.forEachIndexed { j, _ ->
            println("Informe a nota do ${(j + 1)}º aluno da turma ")
            notas[j] = readln().toDouble().toInt()


        }

        mediaDaTurma(notas, qtddAlunos)
    }

}
    fun mediaDaTurma(notas: IntArray, qtddAlunos: IntArray) {
        var soma = 0.0
        var media = 0.0

        notas.forEachIndexed { i, _ ->
            soma += notas[i]
            media = soma / notas.size

        }
        println("A média da turma é $media")
    }










