package procon.chap7

class Ch7Q1 {
    private val leftArr = Array(1000) { 0 }.toIntArray()
    private val rightArr = Array(1000) { 0 }.toIntArray()
    fun mergeSort(arr: IntArray, left: Int = 0, right: Int = arr.size): Int {
        var count = 0
        if (left + 1 < right) {
            val mid = (left + right) / 2
            count += mergeSort(arr, left, mid)
            count += mergeSort(arr, mid, right)
            count += merge(arr, left, mid, right)
        }
        return count
    }

    private fun merge(arr: IntArray, left: Int, mid: Int, right: Int): Int {
        var count = 0
        (left until mid).forEachIndexed { index, i ->
            leftArr[index] = arr[i]
        }
        leftArr[mid - left] = Int.MAX_VALUE
        (mid until right).forEachIndexed { index, i ->
            rightArr[index] = arr[i]
        }
        rightArr[right - mid] = Int.MAX_VALUE

        var i = 0
        var j = 0
        for (k in left until right) {
            count++
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i]
                i++
            } else {
                arr[k] = rightArr[j]
                j++
            }
        }
        return count
    }
}