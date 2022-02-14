import kotlin.math.pow

class Calculos {

    fun forcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun forcaCentripeta(massa: Float, velocidade: Float, raio: Float): Float {

        return massa * ((velocidade.pow(2)) / raio)
    }

    fun impulso(forca: Float, tempoInicial: Float, tempoFinal: Float): Float {
        return forca * (tempoFinal - tempoInicial)
    }

    fun forcaElastica(constanteElastica: Float, deformacao: Float): Float {
        return constanteElastica * deformacao

    }

    fun velocidadeMedia(tempo1: Float, tempo2: Float, pos1: Float, pos2: Float): Float {
        return ((pos2 - pos1) / (tempo2 - tempo1) * 3.6f)
    }

    fun movimentoUniforme(velocidade: Float, tempo: Float, posicao: Float): Float {
        return velocidade + (velocidade * tempo)
    }

    fun movimentoUniformeVariado(aceleracao: Float, tempo1: Float, tempo2: Float, velocidade: Float): Float {
        return velocidade + (aceleracao * (tempo1 - tempo2))

    }

}