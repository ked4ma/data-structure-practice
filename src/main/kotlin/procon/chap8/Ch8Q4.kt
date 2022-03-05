package procon.chap8

class Ch8Q4(input: List<String>) {
    data class Node(
        val p: Int = -1,
        val l: Int = -1,
        val r: Int = -1
    )

    private val nodes: Array<Node>

    init {
        nodes = input.map { _ ->
            Node()
        }.toTypedArray()
        input.map {
            it.split(" ").map(String::toInt)
        }.forEach { (i, l, r) ->
            nodes[i] = nodes[i].copy(l = l, r = r)
            if (l >= 0) nodes[l] = nodes[l].copy(p = i)
            if (r >= 0) nodes[r] = nodes[r].copy(p = i)
        }
    }

    private val root = nodes.indexOfFirst { it.p == -1 }

    fun preorder(i: Int = root) {
        if (i == -1) return
        print("$i ")
        preorder(nodes[i].l)
        preorder(nodes[i].r)
        if (i == root) println()
    }

    fun inorder(i: Int = root) {
        if (i == -1) return
        inorder(nodes[i].l)
        print("$i ")
        inorder(nodes[i].r)
        if (i == root) println()
    }

    fun postorder(i: Int = root) {
        if (i == -1) return
        postorder(nodes[i].l)
        postorder(nodes[i].r)
        print("$i ")
        if (i == root) println()
    }
}
