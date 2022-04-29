import Exercicio01.Funcionarios

fun main() {
  val novoFuncionario = Funcionarios("Luis", "Silva", 10, 25.50)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)

    novoFuncionario.calcularSalario()

    val listaFuncionarios = ArrayList<Funcionarios>()
    listaFuncionarios.add(novoFuncionario)
    listaFuncionarios.add(Funcionarios("Victor", "Carvalho", 30, 15.0))
    listaFuncionarios.add(Funcionarios("Gilberto", "Alves", 24, 17.0))
    listaFuncionarios.add(Funcionarios("Francisco", "Siqueira", 59, 21.30))
    listaFuncionarios.add(Funcionarios("Joyce", "Ribeiro", 89, 22.45))
    listaFuncionarios.add(Funcionarios("Rebeca", "Silva", 67, 30.0))
    listaFuncionarios.add(Funcionarios("Olivia", "Santos", 45, 13.44))
    listaFuncionarios.add(Funcionarios("Carlos", "Souza", 55, 19.80))
    listaFuncionarios.add(Funcionarios("Ludmilla", "Fernandes", 77, 23.90))
    listaFuncionarios.add(Funcionarios("Camila", "Peixoto", 48, 40.70))

    listaFuncionarios.forEach {
        print("Funcionário: ")
        print(it.nome)
        print(" ")
        println(it.sobrenome)

        print("Horas Trabalhadas: ")
        println(it.horasTrabalhadas)

        print("Valor recebido por hora trabalhada: ")
        println(it.valorHora)
        it.calcularSalario()
        println("_________________________________________________________________")
        }
    }