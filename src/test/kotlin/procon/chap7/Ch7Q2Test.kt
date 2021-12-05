package procon.chap7

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch7Q2Test {
    @Test
    fun test_partition() {
        read("q7-2") {
            it.nextInt()
            val arr = it.nextIntList().toIntArray()
            val q = Ch7Q2.partition(arr)
            arr.forEachIndexed { index, n ->
                print(if (index == q) "[$n] " else "$n ")
            }
            println("")
        }
    }
}