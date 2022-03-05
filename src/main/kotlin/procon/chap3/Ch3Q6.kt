package procon.chap3

object Ch3Q6 {
    fun shellSort(A: IntArray, N: Int) {
        var count = 0
        val gList = genG(N)
        for (g in gList.asReversed()) {
            count += insertionSort(A, N, g)
        }
        println(gList.size)
        println(gList.joinToString(separator = " "))
        println(count)
        for (a in A) {
            println(a)
        }
    }

    private fun genG(n: Int): List<Int> {
        var g = 1
        val res = ArrayList<Int>(10)
        while (g <= n) {
            res.add(g)
            g = 3 * g + 1
        }
        return res
    }

    private fun insertionSort(A: IntArray, N: Int, G: Int): Int {
        var count = 0
        for (i in G until N) {
            val v = A[i]
            var j = i - G
            while (j >= 0 && A[j] > v) {
                A[j + G] = A[j]
                j -= G
                count++
            }
            A[j + G] = v
        }
        return count
    }
}
