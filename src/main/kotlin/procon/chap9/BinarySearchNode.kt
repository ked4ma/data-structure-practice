package procon.chap9

data class BinarySearchNode(var value: Int) {
    var parent: BinarySearchNode? = null
    var left: BinarySearchNode? = null
    var right: BinarySearchNode? = null
}