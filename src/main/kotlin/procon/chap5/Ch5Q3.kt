package procon.chap5

object Ch5Q3 {
    fun run(S: IntArray, T: IntArray) {
        var count = 0
        T.forEach {
            if (binary(S, it) >= 0) count++
        }
        println(count)
    }

    private fun binary(A: IntArray, key: Int): Int {
        var left = 0
        var right = A.size
        while (left < right) {
            val mid = (left + right) / 2
            if (A[mid] == key) {
                return mid
            } else if (key < A[mid]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return -1
    }
}
