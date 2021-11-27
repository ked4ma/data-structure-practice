package procon.chap3

object Ch3Q3 {
    fun bubbleSoert(A: IntArray, N: Int) {
        var count = 0
        var flag = true
        var i = 0
        while (flag && i < N) {
            flag = false
            for (j in i + 1 until N) {
                if (A[i] > A[j]) {
                    flag = true
                    val tmp = A[j]
                    A[j] = A[i]
                    A[i] = tmp
                    count++
                }
            }
            i++
        }
        println(A.joinToString(separator = " "))
        println(count)
    }
}