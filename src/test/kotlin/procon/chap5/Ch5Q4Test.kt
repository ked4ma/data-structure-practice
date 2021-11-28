package procon.chap5

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch5Q4Test {
    @Test
    fun test_run() {
        read("q5-4") {
            val ops = (0 until it.nextInt()).map { _ ->
                val (op, v) = it.nextList()
                op to v
            }
            Ch5Q4.run(ops)
        }
    }
}