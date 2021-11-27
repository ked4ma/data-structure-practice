package procon.utils

import java.io.Closeable
import java.io.File
import java.util.stream.Collectors

internal class Reader(fileName: String) : Closeable {
    private val input = File(fileName).bufferedReader()
    fun next() = input.readLine().trim()
    fun nextList(separator: String = " ") = next().split(separator)
    fun nextInt() = next().toInt()
    fun nextIntList(separator: String = " ") = nextList(separator).map(String::toInt)

    fun lines(): List<String> = input.lines().collect(Collectors.toList())

    override fun close() {
        input.close()
    }
}

internal inline fun read(
    question: String,
    readInputOperation: (Reader) -> Unit
) {
    Reader("src/test/resources/$question-input.txt").use(readInputOperation)
    Reader("src/test/resources/$question-output.txt").use {
        println("==========")
        it.lines().forEach(::println)
    }
}