package procon.chap5

object Ch5Q2 {
    fun run(A: IntArray, target: IntArray) {
        val tSet = target.toSet()
        println(A.count { it in tSet })
    }
}