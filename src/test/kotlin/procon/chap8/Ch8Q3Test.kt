package procon.chap8

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch8Q3Test {
    @Test
    fun test_parseNode() {
        read("q8-3") {
            Ch8Q3.parseNode((0 until it.nextInt()).map { _ ->
                it.next()
            })
        }
    }
}