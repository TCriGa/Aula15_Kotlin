/*Uma loja de animais vende gatos e cachorros. Escreva um algoritmo
que leia a quantidade de animais da loja e, para cada animal, leia a
informação do tipo do animal (se é gato ou cachorro). Ao final, exiba a
quantidade de animais que são gatos e a quantidade de animais que
são cachorros existentes na loja
* */

fun main() {
    dadosAnimais()

}

fun dadosAnimais() {
    println("|--------Por favor, informe a quantidade de animais: ----|")
    val animais = readln().toInt()
    val qtddAnimais = IntArray(animais)
    val nomeAnimais = ArrayList<String>(animais)

    qtddAnimais.forEachIndexed { i, _ ->

        println("|---------Informe qual o ${(i + 1)} º animal:---------|")
        var nomeAnimal = readln()
        nomeAnimais.add(nomeAnimal)

    }


    separacaoAnimais(nomeAnimais)
}

fun separacaoAnimais(nomeAnimais: ArrayList<String>) {
    val animal1 = "Cachorro"
    val animal2 = "Gato"
    var contadorDog = 0
    var contadorCat = 0
    var contadorGeral = 0


    nomeAnimais.forEachIndexed { i, _ ->
        if (nomeAnimais[i] == animal1 || nomeAnimais[i] == animal1.lowercase()) {
            contadorDog++

        } else if (nomeAnimais[i] == animal2 || nomeAnimais[i] == animal2.lowercase()) {

            contadorCat++

        } else if (nomeAnimais[i] != animal1 && nomeAnimais[i] != animal2) {
            contadorGeral++
        }


    }


    mostrarQtddAnimais(contadorCat, contadorDog, contadorGeral)

}

fun mostrarQtddAnimais(contadorCat: Int, contadorDog: Int, contadorGeral: Int) {

    println("|------Quantidade de cachorro é = $contadorDog------|")
    println("|------Quantidade de Gato é = $contadorCat ---------|")
    println("|------------Animal não cadastrado é = $contadorGeral $-------------|")


}