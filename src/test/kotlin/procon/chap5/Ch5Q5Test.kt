package procon.chap5

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch5Q5Test {
    @Test
    fun test_run() {
        read("q5-5") {
            val (n, k) = it.nextIntList()
            val w = (0 until n).map { _ ->
                it.nextInt()
            }.toIntArray()
            Ch5Q5.allocation(w, k)
        }
    }
}