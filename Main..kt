fun main(args: Array<String>) {
    val calculos = Calculos()

    val forcaPeso = calculos.forcaPeso(15f, 25f)
    println("O resultado da Força Peso é: $forcaPeso")

    val forcaCentripeta = calculos.forcaCentripeta(5f, 150f, 400f)
    println("O resultado da Força Centripeta é: $forcaCentripeta")

    val impulso = calculos.impulso(5f, 28f, 40f,)
    println("O resultado do Impulso é: $impulso")

    val  forcaElastica = calculos.forcaElastica(86f, 98f)
    println("O resultado da Força Elastica é: $forcaElastica")

    val velocidadeMedida = calculos.velocidadeMedia(54f, 108f, 60f, 120f)
    println("O resiltado da Velocidade de Medida é: $velocidadeMedida")

    val movimentoUniforme = calculos.movimentoUniforme(35f, 20f, 30f)
    println("O resultado do MRU é: $movimentoUniforme")

    val movimentoUniformeVariado = calculos.movimentoUniformeVariado(50f, 10f, 20f, 100f)
    println("O resultado do Movimento Uniforme Variado é: $movimentoUniformeVariado")
}
