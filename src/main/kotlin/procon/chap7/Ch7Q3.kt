package procon.chap7

enum class Suit {
    S, H, C, D, UNK
}

data class Card(val suit: Suit, val value: Int) : Comparable<Card> {
    override fun compareTo(other: Card): Int = this.value.compareTo(other.value)
}

class Ch7Q3 {
    fun quickSort(arr: Array<Card>, p: Int = 0, r: Int = arr.lastIndex) {
        if (p < r) {
            val q = partition(arr, p, r)
            quickSort(arr, p, q - 1)
            quickSort(arr, q + 1, r)
        }
    }

    private fun partition(arr: Array<Card>, p: Int = 0, r: Int = arr.lastIndex): Int {
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

    fun mergeSort(arr: Array<Card>, left: Int = 0, right: Int = arr.size) {
        if (left + 1 < right) {
            val mid = (left + right) / 2
            mergeSort(arr, left, mid)
            mergeSort(arr, mid, right)
            merge(arr, left, mid, right)
        }
    }

    private val leftArr = Array(100) { Card(Suit.UNK, Int.MAX_VALUE) }
    private val rightArr = Array(100) { Card(Suit.UNK, Int.MAX_VALUE) }
    private fun merge(arr: Array<Card>, left: Int, mid: Int, right: Int) {
        (left until mid).forEachIndexed { index, i ->
            leftArr[index] = arr[i]
        }
        leftArr[mid - left] = Card(Suit.UNK, Int.MAX_VALUE)
        (mid until right).forEachIndexed { index, i ->
            rightArr[index] = arr[i]
        }
        rightArr[right - mid] = Card(Suit.UNK, Int.MAX_VALUE)

        var i = 0
        var j = 0
        for (k in left until right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i]
                i++
            } else {
                arr[k] = rightArr[j]
                j++
            }
        }
    }
}