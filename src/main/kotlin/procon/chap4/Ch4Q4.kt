package procon.chap4

object Ch4Q4 {
    fun run(ops: List<Pair<String, Int>>) {
        val list = DoublyLinkedList()
        ops.forEach {
            when (it.first) {
                "insert" -> list.insert(it.second)
                "delete" -> list.delete(it.second)
                "deleteFirst" -> list.deleteFirst()
                "deleteLast" -> list.deleteLast()
            }
        }
        list.print()
    }
}