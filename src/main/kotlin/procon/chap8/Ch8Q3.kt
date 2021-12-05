package procon.chap8

import kotlin.math.max

private data class BinaryTreeNode(
    val parent: Int = -1,
    val left: Int = -1,
    val right: Int = -1
)

object Ch8Q3 {
    fun parseNode(input: List<String>) {
        val nodes = input.indices.map { BinaryTreeNode() }.toTypedArray()
        val depths = IntArray(input.size) { 0 }
        fun dep(id: Int, d: Int) {
            depths[id] = d
            if (nodes[id].left >= 0) {
                dep(nodes[id].left, d + 1)
            }
            if (nodes[id].right >= 0) {
                dep(nodes[id].right, d + 1)
            }
        }

        val heights = IntArray(input.size) { 0 }
        fun height(id: Int): Int {
            if (nodes[id].left < 0 && nodes[id].right < 0) {
                heights[id] = 0
                return 0
            }
            val h = max(
                if (nodes[id].left < 0) Int.MAX_VALUE else height(nodes[id].left),
                if (nodes[id].right < 0) Int.MAX_VALUE else height(nodes[id].right)
            ) + 1
            heights[id] = h
            return h
        }

        input.map { it.split(" ").map(String::toInt) }.forEach { (id, left, right) ->
            if (left >= 0) {
                nodes[id] = nodes[id].copy(left = left)
                nodes[left] = nodes[left].copy(parent = id)
            }
            if (right >= 0) {
                nodes[id] = nodes[id].copy(right = right)
                nodes[right] = nodes[right].copy(parent = id)
            }
        }
        val rootId = nodes.indexOfFirst { it.parent < 0 }
        dep(rootId, 0)
        height(rootId)

        nodes.forEachIndexed { id, node ->
            print("node $id: parent = ${node.parent}, ")
            val sibling = if (node.parent < 0) {
                -1
            } else {
                listOf(nodes[node.parent].left, nodes[node.parent].right).first { it != id }
            }
            print("sibling = $sibling, ")
            val degree = listOf(nodes[id].left, nodes[id].right).filter { it >= 0 }.size
            print("degree = $degree, depth = ${depths[id]}, height = ${heights[id]}, ")
            println(
                when {
                    node.parent < 0 -> "root"
                    node.left < 0 && node.right < 0 -> "leaf"
                    else -> "internal node"
                }
            )
        }
    }
}