package procon.chap4

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch4Q3Test {
    @Test
    fun test_run() {
        read("q4-3") {
            val (n, limit) = it.nextIntList()
            val tasks = (0 until n).map { _ ->
                val (a, b) = it.nextList()
                a to b.toInt()
            }
            Ch4Q3.run(tasks, limit)
        }
    }
}