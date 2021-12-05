package procon.chap7

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch7Q4Test {
    @Test
    fun test_countingSort() {
        read("q7-4") {
            it.nextInt()
            val arr = Ch7Q4.countintSort(it.nextIntList().toIntArray(), 10_000)
            println(arr.joinToString(separator = " "))
        }
    }
}