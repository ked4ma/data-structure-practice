package procon.chap7

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch7Q1Test {
    @Test
    fun test_mergeSort() {
        read("q7-1") {
            it.nextInt()
            val arr = it.nextIntList().toIntArray()
            val compCount = Ch7Q1().mergeSort(arr)
            println(arr.joinToString(separator = " "))
            println(compCount)
        }
    }
}