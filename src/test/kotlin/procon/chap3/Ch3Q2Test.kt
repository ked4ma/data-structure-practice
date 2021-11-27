package procon.chap3

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch3Q2Test {
    @Test
    fun test_insertionSort() {
        read("q3-2") {
            val N = it.nextInt()
            val A = it.nextIntList().toIntArray()
            Ch3Q2.insertionSort(A, N)
        }
    }
}