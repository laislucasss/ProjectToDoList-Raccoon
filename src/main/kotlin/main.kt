// [X] Ver lista
// [X] Criar tarefa
// [] Atualizar tarefa
  // [] Tratar quando item nao existir
// [X] Deletar tarefa
  // [X] Tratar quando item nao existir


fun printLista(lista: List<Tarefa>) {
    for (item in lista) {
        println("${item.id} ${if (item.status == "CONCLUÍDO") "[X]" else "[ ]" } ${item.descricao}")
    }
}
fun atualizaTarefa(lista: ArrayList<Tarefa>, novaTarefa: Tarefa) {
    var tarefa = lista.find { tarefa -> tarefa.id == novaTarefa.id }
    tarefa = novaTarefa
}

fun removeTarefa(lista: ArrayList<Tarefa>, id: Int) {
    lista.removeIf { tarefa -> tarefa.id == id }
}

fun criaTarefa(lista: ArrayList<Tarefa>, status: String, descricao: String) : Tarefa {
    if (lista.isEmpty()) {
        var novoId = 1
        var tarefa = Tarefa(novoId, status, descricao)
        lista.add(tarefa)
        return tarefa
    }


    var ultimoElemento = lista.last()
    var novoId = ultimoElemento.id +1
    var tarefa = Tarefa(novoId, status, descricao)
    lista.add(tarefa)
    return tarefa
}


fun main(args: Array<String>) {
    val listaTarefas = ArrayList<Tarefa>()
    var t1 = criaTarefa(listaTarefas, "FAZENDO", "Comprar pão")
    var t2 = criaTarefa(listaTarefas,"PENDENTE", "Comprar shampoo")
    var t3 = criaTarefa(listaTarefas, "CONCLUÍDO", "Comprar detergente")


    printLista(listaTarefas)
    println("-----")

    t2.status = "CONCLUÍDO"
    atualizaTarefa(listaTarefas, t2)
    printLista(listaTarefas)
    println("-----")

    removeTarefa(listaTarefas, 1)
    printLista(listaTarefas)
}

