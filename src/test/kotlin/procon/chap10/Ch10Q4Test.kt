package procon.chap10

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch10Q4Test {
    @Test
    fun test_priorityQueue() {
        val obj = Ch10Q4(10)
        read("q10-4") {
            it.lines().map { line ->
                line.split(" ")
            }.map { d ->
                when (d[0]) {
                    "insert" -> obj.insert(d[1].toInt())
                    "extract" -> println(obj.extract())
                    else -> return@read
                }
            }
        }
    }
}