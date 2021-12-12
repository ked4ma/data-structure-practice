package procon.chap10

object Ch10Q3 {
    private fun maxHeapify(arr: IntArray, i: Int) {
        val h = arr.size
        val l = i * 2 + 1
        val r = i * 2 + 2
        var largest = if (l < h && arr[l] > arr[i]) l else i
        if (r < h && arr[r] > arr[largest]) {
            largest = r
        }

        if (largest != i) {
            val tmp = arr[i]
            arr[i] = arr[largest]
            arr[largest] = tmp
            maxHeapify(arr, largest)
        }
    }

    fun buildMapHeap(arr: IntArray) {
        for (i in (arr.lastIndex - 1) / 2 downTo 0) {
            maxHeapify(arr, i)
        }
    }
}