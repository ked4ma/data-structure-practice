package procon.chap3

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch3Q6Test {
    @Test
    fun test_shellSort() {
        read("q3-6") {
            val N = it.nextInt()
            val A = it.lines().map(String::toInt).toIntArray()
            Ch3Q6.shellSort(A, N)
        }
    }
}
