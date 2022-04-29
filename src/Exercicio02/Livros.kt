package Exercicio02

class Livros (var titulo: String,
              var qtdPaginas: Int,
              var paginasLidas: Int = 0){

    fun verificarProgresso(){
        val porcentagem = paginasLidas * 100 / qtdPaginas
        println("Você já leu $porcentagem por cento do livro.")
    }
}