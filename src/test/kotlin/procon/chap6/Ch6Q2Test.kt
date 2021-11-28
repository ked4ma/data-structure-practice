package procon.chap6

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch6Q2Test {
    @Test
    fun test_run() {
        read("q6-2") {
            it.nextInt()
            val A = it.nextIntList().toIntArray()
            it.nextInt()
            val M = it.nextIntList().toIntArray()
            Ch6Q2.search(A, M)
        }
    }
}