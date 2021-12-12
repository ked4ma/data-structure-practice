package procon.chap10

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch10Q2Test {
    @Test
    fun test_parseHeap() {
        read("q10-2") {
            it.nextInt()
            Ch10Q2.parseHeap(it.nextIntList().toIntArray())
        }
    }
}