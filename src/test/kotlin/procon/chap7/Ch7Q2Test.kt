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
            println(buildList {
                arr.forEachIndexed { index, n ->
                    add(if (index == q) "[$n]" else "$n")
                }
            }.joinToString(separator = " "))
        }
    }
}
