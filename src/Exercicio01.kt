/*Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma
dos números que não são múltiplos de 13 entre X e Y, incluindo
ambos.
* */

fun main() {
getDados()
}

fun getDados(){
    println("Informe dois números inteiros")
    var x = readln().toInt()
    var y = readln().toInt()

    multiplos(x,y)
}

fun multiplos(x: Int, y: Int) {
    var soma = 0
for (i in x .. y) {
    if (i % 13 != 0) {
        soma += i

    } else if (i % 13 ==0) {
        println("O numero $i é Número invalido")
    }
}
    println("A soma do intervalo entre  $x e $y que não são multiplos de 13 é = $soma")
}