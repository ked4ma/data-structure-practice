package procon.chap4

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch4Q2Test {
    @Test
    fun test_run() {
        read("q4-2") {
            val A = it.nextList()
            Ch4Q2.run(A)
        }
    }
}