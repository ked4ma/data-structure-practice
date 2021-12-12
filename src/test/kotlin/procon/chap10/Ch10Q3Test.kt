package procon.chap10

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch10Q3Test {
    @Test
    fun test_buildMapHeap() {
        read("q10-3") {
            it.nextInt()
            val arr = it.nextIntList().toIntArray()
            Ch10Q3.buildMapHeap(arr)
            println(arr.joinToString(separator = " "))
        }
    }
}