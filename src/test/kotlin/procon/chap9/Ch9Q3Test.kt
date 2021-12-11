package procon.chap9

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch9Q3Test {
    @Test
    fun test_exec() {
        read("q9-3") {
            Ch9Q3.exec((0 until it.nextInt()).map { _ ->
                val command = it.next().split(" ")
                when (command[0]) {
                    "insert" -> Insert(command[1].toInt())
                    "find" -> Find(command[1].toInt())
                    else -> Print
                }
            })
        }
    }
}