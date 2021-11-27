package procon.chap4

object Ch4Q2 {
    fun run(A: List<String>) {
        val stack = Stack<Int>(A.size)
        for (s in A) {
            when (s) {
                "+" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a + b)
                }
                "-" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a - b)
                }
                "*" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a * b)
                }
                else -> stack.push(s.toInt())
            }
        }
        println(stack.pop())
    }
}