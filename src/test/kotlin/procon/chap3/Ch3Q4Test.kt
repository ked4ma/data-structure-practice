package procon.chap3

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch3Q4Test {
    @Test
    fun test_selectionSort() {
        read("q3-4") {
            val N = it.nextInt()
            val A = it.nextIntList().toIntArray()
            Ch3Q4.selectionSort(A, N)
        }
    }
}