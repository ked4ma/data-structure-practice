package procon.chap7

object Ch7Q4 {
    fun countintSort(arr: IntArray, k: Int): IntArray {
        val out = arr.copyOf()
        val countArr = Array(k) { 0 }

        for (n in arr) {
            countArr[n]++
        }
        for (i in 1 until countArr.size) {
            countArr[i] += countArr[i - 1]
        }

        for (i in arr.lastIndex downTo 0) {
            out[--countArr[arr[i]]] = arr[i]
        }

        return out
    }
}