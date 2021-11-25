package practice.chap1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource


internal class Ch1Q1Test {
    @ParameterizedTest
    @ValueSource(classes = [Ch1Q1J::class, Ch1Q1Kt::class])
    fun test_isUniqueChars_isUnique(clazz: Class<Ch1Q1>) {
        val obj = clazz.getConstructor().newInstance()
        val word = "abcdefg"
        val actual = obj.isUniqueChars(word)
        assertTrue(actual)
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q1J::class, Ch1Q1Kt::class])
    fun test_isUniqueCharsWithoutOtherDataStructure_isNotUnique(clazz: Class<Ch1Q1>) {
        val obj = clazz.getConstructor().newInstance()
        val word = "abcdaaaaefg"
        val actual = obj.isUniqueChars(word)
        assertFalse(actual)
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q1J::class, Ch1Q1Kt::class])
    fun test_isUniqueCharsWithoutOtherDataStructure_tooLong(clazz: Class<Ch1Q1>) {
        val obj = clazz.getConstructor().newInstance()
        val word = "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890"
        val actual = obj.isUniqueChars(word)
        assertFalse(actual)
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q1J::class, Ch1Q1Kt::class])
    fun test_isUniqueCharsWithoutOtherDataStructure_isUnique(clazz: Class<Ch1Q1>) {
        val obj = clazz.getConstructor().newInstance()
        val word = "abcdefg"
        val actual = obj.isUniqueCharsWithoutOtherDataStructure(word)
        assertTrue(actual)
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q1J::class, Ch1Q1Kt::class])
    fun test_isUniqueChars_isNotUnique(clazz: Class<Ch1Q1>) {
        val obj = clazz.getConstructor().newInstance()
        val word = "abcdaaaaefg"
        val actual = obj.isUniqueCharsWithoutOtherDataStructure(word)
        assertFalse(actual)
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q1J::class, Ch1Q1Kt::class])
    fun test_isUniqueChars_tooLong(clazz: Class<Ch1Q1>) {
        val obj = clazz.getConstructor().newInstance()
        val word = "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890"
        val actual = obj.isUniqueCharsWithoutOtherDataStructure(word)
        assertFalse(actual)
    }
}
