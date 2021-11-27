package procon.chap4

class Queue<T>(size: Int) {
    private val arr = arrayOfNulls<Any>(size)
    private var head = 0
    private var tail = 0

    fun isEmpty() = head == tail

    fun isFull() = (tail + 1) % arr.size == head

    fun enqueue(v: T) {
        if (isFull()) throw RuntimeException("Queue is Full")
        arr[tail] = v
        tail = (tail + 1) % arr.size
    }

    @Suppress("UNCHECKED_CAST")
    fun dequeue(): T {
        if (isEmpty()) throw RuntimeException("Queue is Empty")
        val v = arr[head]
        head = (head + 1) % arr.size
        return v as T
    }
}