package procon.chap9

object Ch9Q3 {
    fun exec(commands: List<Command>) {
        var root: BinarySearchNode? = null
        commands.forEach {
            when (it) {
                is Insert -> {
                    root = insert(root, it.value)
                }
                is Print -> print(root)
                is Find -> println(if (find(root, it.value)) "yes" else "no")
            }
        }
    }

    private fun insert(root: BinarySearchNode?, n: Int): BinarySearchNode {
        var x = root
        var y: BinarySearchNode? = null
        val z = BinarySearchNode(n)

        while (x != null) {
            y = x
            x = if (n < x.value) x.left else x.right
        }
        z.parent = y

        if (y == null) {
            return z
        } else if (n < y.value) {
            y.left = z
        } else {
            y.right = z
        }
        return root!!
    }

    private fun print(root: BinarySearchNode?) {
        printInorder(root)
        println()
        printPreorder(root)
        println()
    }

    private fun printInorder(node: BinarySearchNode?) {
        if (node == null) return
        printInorder(node.left)
        print(" ${node.value}")
        printInorder(node.right)
    }

    private fun printPreorder(node: BinarySearchNode?) {
        if (node == null) return
        print(" ${node.value}")
        printPreorder(node.left)
        printPreorder(node.right)
    }

    private fun find(root: BinarySearchNode?, n: Int): Boolean {
        var x = root
        while (x != null && x.value != n) {
            if (n < x.value) {
                x = x.left
            } else {
                x = x.right
            }
        }
        return x != null
    }
}