package procon.chap3

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch3Q3Test {
    @Test
    fun test_bubbleSort() {
        read("q3-3") {
            val N = it.nextInt()
            val A = it.nextIntList().toIntArray()
            Ch3Q3.bubbleSoert(A, N)
        }
    }
}