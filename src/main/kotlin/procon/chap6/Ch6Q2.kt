package procon.chap6

object Ch6Q2 {
    fun search(A: IntArray, M: IntArray) {
        fun solve(i: Int, m: Int): Boolean {
            if (m == 0) return true
            if (m < 0 || i >= A.size) return false
            return solve(i + 1, m) || solve(i + 1, m - A[i])
        }
        M.forEach {
            println(if (solve(0, it)) "yes" else "no")
        }
    }
}