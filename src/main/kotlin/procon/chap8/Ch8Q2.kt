package procon.chap8

private data class Node(
    val parent: Int = -1,
    val left: Int = -1,
    val right: Int = -1
)

object Ch8Q2 {

    fun parseNode(input: List<String>) {
        val nodes = input.indices.map { Node() }.toTypedArray()
        val depths = IntArray(input.size) { 0 }

        fun dep(id: Int, d: Int) {
            depths[id] = d
            if (nodes[id].right >= 0) {
                dep(nodes[id].right, d)
            }
            if (nodes[id].left >= 0) {
                dep(nodes[id].left, d + 1)
            }
        }

        input.map { it.split(" ").map(String::toInt) }.forEach {
            val id = it[0]
            var left = 0
            for (j in 0 until it[1]) {
                if (j == 0) {
                    nodes[id] = nodes[id].copy(left = it[2])
                } else {
                    nodes[left] = nodes[left].copy(right = it[j + 2])
                }
                left = it[j + 2]
                nodes[left] = nodes[left].copy(parent = id)
            }
        }

        val rootId = nodes.indexOfFirst { it.parent == -1 }
        dep(rootId, 0)

        nodes.forEachIndexed { id, node ->
            print("node $id: parent = ${node.parent}, depth = ${depths[id]}, ")
            print(when {
                node.parent < 0 -> "root"
                node.left < 0 -> "leaf"
                else -> "internal node"
            })
            print(", [")
            var c = nodes[id].left
            var needComma = false
            while (c >= 0) {
                if (needComma) print(", ")
                print(c)
                c = nodes[c].right

                needComma = true
            }
            println("]")
        }
    }
}