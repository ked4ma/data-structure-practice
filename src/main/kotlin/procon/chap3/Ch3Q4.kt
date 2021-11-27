package procon.chap3

object Ch3Q4 {
    fun selectionSort(A: IntArray, N: Int) {
        var count = 0
        for (i in 0 until N - 1) {
            var minj = i
            for (j in i + 1 until N) {
                if (A[minj] > A[j]) minj = j
            }
            if (i != minj) {
                val tmp = A[i]
                A[i] = A[minj]
                A[minj] = tmp
                count++
            }
        }
        println(A.joinToString(separator = " "))
        println(count)
    }
}