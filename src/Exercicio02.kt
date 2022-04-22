/*Leia um valor e faça um programa que coloque o valor lido na
primeira posição de um vetor de tamanho 10. Em cada posição
subsequente, coloque o dobro do valor da posição anterior. Por
exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e
assim sucessivamente. Mostre o vetor em seguida.
* */
fun main() {
    pegarDados()
}

fun pegarDados() {
    println("Informe um valor: ")
    val n = readln().toInt()

    val vetorN = IntArray( 9)

    dobroVetor(vetorN, n)
}

fun dobroVetor(vetorN: IntArray, n: Int) {
    var dobro = n
    print("$n, ")
    for (i in vetorN.indices) {
        dobro *= n * 2

        print("$dobro, ")
    }
}


