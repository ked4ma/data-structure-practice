package procon.chap7

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch7Q6Test {
    @Test
    fun test_insersions() {
        read("q7-6") {
            it.nextInt()
            println(Ch7Q6().insesions(it.nextIntList().toIntArray()))
        }
    }
}