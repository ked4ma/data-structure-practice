package procon.chap9

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch9Q2Test {
    @Test
    fun test_exec() {
        read("q9-2") {
            Ch9Q2.exec((0 until it.nextInt()).map { _ ->
                val command = it.next().split(" ")
                when (command[0]) {
                    "insert" -> Insert(command[1].toInt())
                    else -> Print
                }
            })
        }
    }
}