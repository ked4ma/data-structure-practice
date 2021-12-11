package procon.chap8

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch8Q2Test {
    @Test
    fun test_parseNode() {
        read("q8-2") {
            Ch8Q2.parseNode((0 until it.nextInt()).map { _ ->
                it.next()
            })
        }
    }
}