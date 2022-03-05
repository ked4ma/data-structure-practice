package procon.chap3

object Ch3Q2 {
    fun insertionSort(A: IntArray, N: Int) {
        trace(A)
        for (i in 1 until N) {
            val v = A[i]
            var j = i - 1
            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j]
                j--
            }
            A[j + 1] = v
            trace(A)
        }
    }

    private fun trace(A: IntArray) {
        println(A.joinToString(separator = " "))
    }
}
