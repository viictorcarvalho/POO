package Exercicio02

fun main() {
    val livroFavorito : Livros = Livros("O Pequeno Príncipe", 98)
    println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas.")
    livroFavorito.paginasLidas = 20
    println("${livroFavorito.paginasLidas} páginas lidas.")
    livroFavorito.verificarProgresso()

    livroFavorito.paginasLidas = 50
    println("${livroFavorito.paginasLidas} páginas lidas.")

    val outrosLivros = ArrayList<Livros>()
    outrosLivros.add(livroFavorito)
    outrosLivros.add(Livros("O método fair play", 435, 435))
    outrosLivros.add(Livros("O dono do morro", 556, 320))
    outrosLivros.add(Livros("HP e a criança amaldiçoada", 613))
    outrosLivros.add(Livros("O lago místico", 267, 54))
    outrosLivros.add(Livros("O caçador de pipas", 367, 88))
    outrosLivros.add(Livros("Crônicas do matador de reis", 145, 145))
    outrosLivros.add(Livros("Outlander", 789, 678))
    outrosLivros.add(Livros("O mito da beleza", 213, 200))
    outrosLivros.add(Livros("Menos é mais", 170, 99))
    outrosLivros.add(Livros("O senhor dos anéis", 344, 122))
    outrosLivros.add(Livros("A bíblia sagrada", 564, 333))

    outrosLivros.forEach{
        println(it.titulo)
        println("${it.qtdPaginas} páginas.")
        println("${it.paginasLidas} páginas lidas.")
        it.verificarProgresso()
        println("")

    }
}