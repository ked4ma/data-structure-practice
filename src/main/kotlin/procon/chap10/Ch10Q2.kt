package procon.chap10

object Ch10Q2 {
    fun parseHeap(input: IntArray) {
        input.forEachIndexed { index, n ->
            print("node ${index + 1}: key = ${input[index]}, ")
            if (index > 0) {
                print("parent kye = ${input[(index - 1) / 2]}, ")
            }
            if (index * 2 + 1 < input.size) {
                print("left key = ${input[index * 2 + 1]}, ")
            }
            if (index * 2 + 2 < input.size) {
                print("right key = ${input[index * 2 + 2]}, ")
            }
            println()
        }
    }
}