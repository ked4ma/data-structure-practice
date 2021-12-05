package procon.chap7

class Ch7Q6 {
    fun insesions(arr: IntArray): Int {
        return mergeSort(arr)
    }

    private fun mergeSort(arr: IntArray, left: Int = 0, right: Int = arr.size): Int {
        var count = 0
        if (left + 1 < right) {
            val mid = (left + right) / 2
            count += mergeSort(arr, left, mid)
            count += mergeSort(arr, mid, right)
            count += merge(arr, left, mid, right)
        }
        return count
    }

    private val L = Array(1000) { 0 }.toIntArray()
    private val R = Array(1000) { 0 }.toIntArray()
    private fun merge(arr: IntArray, left: Int, mid: Int, right: Int): Int {
        var count = 0
        (left until mid).forEachIndexed { index, i ->
            L[index] = arr[i]
        }
        L[mid - left] = Int.MAX_VALUE
        (mid until right).forEachIndexed { index, i ->
            R[index] = arr[i]
        }
        R[right - mid] = Int.MAX_VALUE

        var i = 0
        var j = 0
        for (k in left until right) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]
                i++
            } else {
                arr[k] = R[j]
                j++
                count += mid - left - i
            }
        }
        return count
    }
}