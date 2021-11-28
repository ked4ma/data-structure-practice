package procon.chap6

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch6Q3Test {
    @Test
    fun test_run() {
        read("q6-3") {
            Ch6Q3.koch(it.nextInt())
        }
    }
}