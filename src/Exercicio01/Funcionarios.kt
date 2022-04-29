package Exercicio01

class Funcionarios (var nome: String,
                    var sobrenome: String,
                    var horasTrabalhadas: Int,
                    var valorHora: Double){

    fun nomeCompleto(){
        println("O nome do funcionário é $nome $sobrenome.")
        println("")
    }

    fun calcularSalario(){
        println("O funcionário $nome irá receber o valor de R$ ${horasTrabalhadas*valorHora} reais.")
    }

    fun incrementarHoras(horasExtra : Int){
        horasTrabalhadas += horasExtra


    }
}