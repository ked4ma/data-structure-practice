package procon.chap4

import kotlin.math.min

object Ch4Q6 {
    fun run(input: String) {
        val data = input.split("")
        val stack = Stack<Int>(data.size)
        var x = 0
        val resultStack = Stack<Pair<Int, Int>>(data.size)
        data.forEach {
            when (it) {
                "\\" -> {
                    stack.push(x)
                }
                "/" -> if (!stack.isEmpty()) {
                    val left = stack.pop()
                    var v = x - left
                    while (resultStack.isEmpty().not() && left < resultStack.peek().first) {
                        val result = resultStack.pop()
                        v += result.second
                    }
                    resultStack.push(left to v)
                }
            }
            x += 1
        }
        val resultList = mutableListOf<Int>()
        while (resultStack.isEmpty().not()) {
            resultList.add(resultStack.pop().second)
        }
        println(resultList.sum())
        println("${resultList.size} ${resultList.asReversed().joinToString(separator = " ")}")
    }
}