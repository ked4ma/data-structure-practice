package practice.chap1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class Ch1Q3Test {
    @ParameterizedTest
    @ValueSource(classes = [Ch1Q3J::class, Ch1Q3Kt::class])
    fun test_replaceWhiteSpace_short(clazz: Class<Ch1Q3>) {
        val obj = clazz.getConstructor().newInstance()
        val input = "Mr John Smith ".toCharArray().copyOf(100)
        val inputTrueLength = 13

        obj.replaceWhiteSpace(input, inputTrueLength)

        val actual = input.filter { it.code != 0 }.joinToString(separator = "")
        assertEquals("Mr%20John%20Smith", actual)
    }
}
