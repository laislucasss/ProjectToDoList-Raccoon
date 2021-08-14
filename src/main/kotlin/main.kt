// [X] Ver lista
// [X] Criar tarefa
// [X] Atualizar tarefa
  // [] Tratar quando item nao existir
// [X] Deletar tarefa
  // [] Tratar quando item nao existir


fun printLista(lista: List<String>) {
    for (item in lista) {
        println(item)
    }
}
fun atualizaLista(lista: ArrayList<String>, itemAntigo: String, itemNovo: String) {
    val indexItemAntigo = lista.indexOf(itemAntigo)
    lista[indexItemAntigo] = itemNovo
}

fun removeLista(lista: ArrayList<String>, item: String) {
    lista.remove(item)
}


fun main(args: Array<String>) {
    val listaTarefas = ArrayList<String>()
    listaTarefas.add("lais")
    listaTarefas.add("tais")

    printLista(listaTarefas)
    atualizaLista(listaTarefas, "tais", "lucas")
    printLista(listaTarefas)
    removeLista(listaTarefas, "lucas")
    printLista(listaTarefas)
}

