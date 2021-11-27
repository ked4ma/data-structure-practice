package procon.chap4

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch4Q6Test {
    @Test
    fun test_run() {
        read("q4-6") {
            Ch4Q6.run(it.next())
        }
    }
}