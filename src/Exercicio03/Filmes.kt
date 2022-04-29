package Exercicio03

import kotlin.math.min

class Filmes (var titulo: String = "", var duracaoMinutos: Int = 0){

    fun exibirDuracaoEmHoras(){
        var horas = duracaoMinutos / 60
        var minutos = duracaoMinutos % 60
        println("O filme $titulo possui $horas horas e $minutos minutos de duração.")
    }
}