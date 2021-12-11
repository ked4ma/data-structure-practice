package procon.chap8

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch8Q5Test {
    @Test
    fun test_reconstruction() {
        read("q8-5") {
            val n = it.nextInt()
            val obj = Ch8Q5(it.nextIntList().toIntArray(), it.nextIntList().toIntArray())
            obj.reconstruction(0, n)
            println(obj.postOrder.joinToString(separator = " "))
        }
    }
}