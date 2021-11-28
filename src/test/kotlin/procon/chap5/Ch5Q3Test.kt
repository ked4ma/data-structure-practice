package procon.chap5

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch5Q3Test {
    @Test
    fun test_run() {
        read("q5-2") {
            it.nextInt()
            val S = it.nextIntList().toIntArray()
            it.nextInt()
            val T = it.nextIntList().toIntArray()
            Ch5Q3.run(S, T)
        }
    }
}