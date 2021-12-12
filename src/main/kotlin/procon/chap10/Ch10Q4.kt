package procon.chap10

class Ch10Q4(size: Int) {
    private var h = -1
    private val arr = IntArray(size = size)

    fun insert(value: Int) {
        arr[++h] = Int.MIN_VALUE
        heapIncreaseKey(arr, h, value)
    }

    private fun heapIncreaseKey(arr: IntArray, i: Int, key: Int) {
        var index = i
        if (key < arr[index]) return
        arr[index] = key
        while (index > 0 && arr[(index - 1) / 2] < arr[index]) {
            val tmp = arr[index]
            arr[index] = arr[(index - 1) / 2]
            arr[(index - 1) / 2] = tmp
            index = (index - 1) / 2
        }
    }

    fun extract(): Int {
        if (h < 0) return Int.MIN_VALUE
        val max = arr[0]
        arr[0] = arr[h--]
        maxHeapify(arr, 0)
        return max
    }

    private fun maxHeapify(arr: IntArray, i: Int) {
        val l = i * 2 + 1
        val r = i * 2 + 2
        var largest = if (l <= h && arr[l] > arr[i]) l else i
        if (r <= h && arr[r] > arr[i]) {
            largest = r
        }
        if (i != largest) {
            val tmp = arr[i]
            arr[i] = arr[largest]
            arr[largest] = tmp
            maxHeapify(arr, largest)
        }
    }
}