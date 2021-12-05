package procon.chap7

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch7Q7Test {
    @Test
    fun test_minCostSort() {
        read("q7-7") {
            it.nextInt()
            println(Ch7Q7.minCostSort(it.nextIntList().toIntArray()))
        }
    }
}