package procon.chap4

class Stack<T>(size: Int) {
    private val arr = arrayOfNulls<Any>(size)
    private var top = -1

    fun isEmpty() = top < 0

    fun isFull() = top + 1 == arr.size

    fun push(v: T) {
        if (isFull()) throw RuntimeException("Cannot push value. (Stack is full)")
        arr[++top] = v
    }

    @Suppress("UNCHECKED_CAST")
    fun pop(): T {
        if (isEmpty()) throw RuntimeException("Cannot pop value. (Stack is empty)")
        return arr[top--] as T
    }

    @Suppress("UNCHECKED_CAST")
    fun peek(): T {
        if (isEmpty()) throw RuntimeException("Cannot pop value. (Stack is empty)")
        return arr[top] as T
    }
}
