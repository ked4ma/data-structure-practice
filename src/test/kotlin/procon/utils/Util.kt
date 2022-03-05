package procon.utils

import procon.utils.Reader
import java.io.*
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
    val out = System.out
    val testOut = TestPrintStream()
    System.setOut(testOut)
    Reader("src/test/resources/$question-input.txt").use(readInputOperation)
    System.setOut(out)
    Reader("src/test/resources/$question-output.txt").use {
        val actual = testOut.read()
        val expected = it.lines().joinToString(separator = "\n")
        assert(actual == expected) {
            listOf("[actual]", actual, "must be [expected]", expected).joinToString("\n")
        }
    }
    testOut.close()
}

internal class TestPrintStream : PrintStream(ByteArrayOutputStream()) {
    fun read(): String {
        val s = out.toString()
        (out as ByteArrayOutputStream).reset()
        return s.replace(Regex("\n$"), "")
    }
}
