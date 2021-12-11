package procon.chap8

class Ch8Q5(private val preOrder: IntArray, private val inOrder: IntArray) {
    private var pos = 0
    private val _postOrder = mutableListOf<Int>()
    val postOrder: IntArray
        get() = _postOrder.toIntArray()

    fun reconstruction(l: Int, r: Int) {
        if (l >= r) return
        val root = preOrder[pos++]
        val m = inOrder.indexOf(root)
        reconstruction(l, m)
        reconstruction(m + 1, r)
        _postOrder.add(root)
    }
}