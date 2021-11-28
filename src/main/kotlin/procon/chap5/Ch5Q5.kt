package procon.chap5

object Ch5Q5 {
    fun allocation(W: IntArray, k: Int) {
        var min = 0
        var max = 1_000_000_000 // max(n) * max(w)

        while (min + 1 < max) {
            val mid = (min + max) / 2
            if (capable(W, k, mid)) {
                max = mid
            } else {
                min = mid
            }
        }
        println(max)
    }

    private fun capable(W: IntArray, k: Int, p: Int): Boolean {
        if (W.sum() > k * p) return false // total capacity must be larger than total weight

        var i = 0
        var j = 0
        var s = 0
        while (i < W.size && j < k) {
            if (W[i] + s <= p) {
                s += W[i]
                i++
            } else {
                j++
                s = 0
            }
        }
        return i == W.size
    }
}