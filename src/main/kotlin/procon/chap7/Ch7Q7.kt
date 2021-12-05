package procon.chap7

import kotlin.math.min

object Ch7Q7 {
    fun minCostSort(arr: IntArray): Int {
        val s = arr.minOrNull() ?: 0
        val T = IntArray(10_000) { 0 }
        val V = BooleanArray(arr.size) { false }

        val sorted = arr.sorted().toIntArray()
        sorted.forEachIndexed { index, n ->
            T[n] = index
        }
        var ans = 0
        for (i in arr.indices) {
            if (V[i]) continue
            var cur = i
            var S = 0
            var m = Int.MAX_VALUE
            var an = 0
            while (true) {
                V[cur] = true
                an++
                val v = arr[cur]
                m = min(m, v)
                S += v
                cur = T[v]
                if (V[cur]) break
            }
            ans += min(
                S + (an - 2) * m,
                S + m + (an + 1) * s
            )
        }
        return ans
    }
}