fun main() {
    val estudantes = mutableListOf<String>()

    println("Cadastro de estudantes. Digite os nomes e, quando quiser parar, digite: PARE")

    while (true) {
        print("Digite o nome do estudante: ")
        val entrada = readLine()?.trim()

        if (entrada.equals("PARE", ignoreCase = true)) {
            break
        }

        if (!entrada.isNullOrEmpty()) {
            estudantes.add(entrada)
        } else {
            println("Nome inválido. Tente novamente.")
        }
    }

    println("\nTotal de estudantes cadastrados: ${estudantes.size}")
    println("Lista de estudantes:")

    for ((index, nome) in estudantes.withIndex()) {
        println("${index + 1}. $nome")
    }
}

