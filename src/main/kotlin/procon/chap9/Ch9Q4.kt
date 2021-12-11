package procon.chap9

object Ch9Q4 {
    fun exec(commands: List<Command>) {
        var root: BinarySearchNode? = null
        commands.forEach {
            when (it) {
                is Insert -> {
                    root = insert(root, it.value)
                }
                is Print -> print(root)
                is Find -> println(if (find(root, it.value) != null) "yes" else "no")
                is Delete -> delete(root, it.value)
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

    private fun find(root: BinarySearchNode?, n: Int): BinarySearchNode? {
        var x = root
        while (x != null && x.value != n) {
            if (n < x.value) {
                x = x.left
            } else {
                x = x.right
            }
        }
        return x
    }

    private fun delete(root: BinarySearchNode?, n: Int): BinarySearchNode? {
        val x = find(root, n) ?: return root
        return delete(root, x)
    }

    private fun delete(node: BinarySearchNode?, target: BinarySearchNode): BinarySearchNode? {
        var res = node
        val y = if (target.left == null || target.right == null) {
            target
        } else {
            successor(target)!!
        }

        val x = if (y.left != null) {
            y.left
        } else {
            y.right
        }
        if (x != null) {
            x.parent = y.parent
        }
        if (y.parent == null) {
            res = x
        } else if (y == y.parent?.left) {
            y.parent?.left = x
        } else {
            y.parent?.right = x
        }
        if (y != target) {
            target.value = y.value
        }
        return res
    }

    private fun successor(node: BinarySearchNode): BinarySearchNode? {
        var x = node
        if (x.right != null) {
            while (x.left != null) {
                x = x.left!!
            }
            return x
        }

        var y = x.parent
        while (y != null && x == y.right) {
            x = y
            y = y.parent
        }
        return y
    }
}