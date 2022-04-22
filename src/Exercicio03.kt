/*Escreva um algoritmo que simule o funcionamento de um caixa de
supermercado. O seu algoritmo deve receber da pessoa usuária a
informação de quantos produtos o cliente comprou e, para cada
produto, deverá ler o seu preço. Ao final, deverá informar quanto o
cliente deve pagar pelas compras
* */

fun main() {
    inserirDados()

}

fun inserirDados() {
    println("Informe a quantidade de produtos")
    var produtos = readln().toInt()

    var qtddProdutos = IntArray(produtos)
    var preco = DoubleArray(produtos)
    qtddProdutos.forEachIndexed { i, _ ->
        println("Informe o preço do ${(i + 1)}º produto")
        preco[i] = readln().toDouble()

    }


    calculoCaixa(preco, qtddProdutos)
}


fun calculoCaixa(preco: DoubleArray, qtddProdutos: IntArray): Double {
    var valorTotal = 0.0

    qtddProdutos.forEachIndexed { i, _ ->
        valorTotal += preco[i]
    }
    mostrarValorTotal(valorTotal)

    return valorTotal
}


fun mostrarValorTotal(valorTotal: Double) {
    println("|-------------Caixa------------------------|")
    println("| O valor total da compra é R$ = %.2f-----|".format(valorTotal))
    println("|--------------FIM-------------------------|")
}