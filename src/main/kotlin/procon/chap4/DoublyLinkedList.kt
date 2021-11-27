package procon.chap4

class DoublyLinkedList {
    private val NIL = Node(Int.MIN_VALUE)

    class Node(val key: Int) {
        var prev: Node = this
        var next: Node = this
    }

    fun insert(key: Int) {
        val node = Node(key)
        node.next = NIL.next
        NIL.next.prev = node
        NIL.next = node
        node.prev = NIL
    }

    private fun deleteNode(node: Node) {
        if (node == NIL) return
        node.next.prev = node.prev
        node.prev.next = node.next
    }

    fun delete(key: Int) {
        var node = NIL.next
        while (node != NIL && node.key != key) {
            node = node.next
        }
        deleteNode(node)
    }

    fun deleteFirst() {
        deleteNode(NIL.next)
    }

    fun deleteLast() {
        deleteNode(NIL.prev)
    }

    fun print() {
        var node = NIL.next
        while (node != NIL) {
            print("${node.key} ")
            node = node.next
        }
        println()
    }
}
