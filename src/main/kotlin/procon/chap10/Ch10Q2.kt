package procon.chap10

object Ch10Q2 {
    fun parseHeap(input: IntArray) {
        input.forEachIndexed { index, n ->
            val list = buildList<String> {
                add("node ${index + 1}: key = ${input[index]},")
                if (index > 0) {
                    add("parent key = ${input[(index - 1) / 2]},")
                }
                if (index * 2 + 1 < input.size) {
                    add("left key = ${input[index * 2 + 1]},")
                }
                if (index * 2 + 2 < input.size) {
                    add("right key = ${input[index * 2 + 2]},")
                }
            }
            println(list.joinToString(separator = " "))
        }
    }
}
