package procon.chap4

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch4Q4Test {
    @Test
    fun test_run() {
        read("q4-4") {
            val n = it.nextInt()
            val ops = (0 until n).map { _ ->
                val (a, b) = it.nextList()
                a to b.toInt()
            }
            Ch4Q4.run(ops)
        }
    }
}