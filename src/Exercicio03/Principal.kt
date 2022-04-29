package Exercicio03

fun main() {

    val filme1 = Filmes()
    filme1.titulo = "Os Vingadores"
    filme1.duracaoMinutos = 142
    filme1.exibirDuracaoEmHoras()

    val filme2 = Filmes()
    filme2.titulo = "Hotel Transilvânia"
    filme2.duracaoMinutos = 93
    filme2.exibirDuracaoEmHoras()

    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}.")
    println()

    val outrosFilmes = ArrayList<Filmes>()
    outrosFilmes.add(Filmes("Carandiru", 189))
    outrosFilmes.add(Filmes("A Bela e a Fera", 156))
    outrosFilmes.add(Filmes("Pinóquio", 112))
    outrosFilmes.add(Filmes("Bacurau", 167))
    outrosFilmes.add(Filmes("Soul", 116))

    outrosFilmes.forEach(){
        println("Filme: ${it.titulo};")
        println("Duração: ${it.duracaoMinutos} minutos;")
        it.exibirDuracaoEmHoras()
        println()
    }
}