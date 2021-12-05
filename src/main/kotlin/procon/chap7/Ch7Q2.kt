package procon.chap7

object Ch7Q2 {
    fun partition(arr: IntArray, p: Int = 0, r: Int = arr.lastIndex): Int {
        val x = arr[r]
        var i = p - 1
        for (j in p until r) {
            if (arr[j] <= x) {
                i++
                val tmp = arr[i]
                arr[i] = arr[j]
                arr[j] = tmp
            }
        }
        val tmp = arr[i + 1]
        arr[i + 1] = arr[r]
        arr[r] = tmp
        return i + 1
    }
}