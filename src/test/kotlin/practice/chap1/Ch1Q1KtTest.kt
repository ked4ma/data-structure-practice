package practice.chap1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


internal class Ch1Q1KtTest {
    @Test
    fun test_isUniqueChars_isUnique() {
        val word = "abcdefg"
        val actual = Ch1Q1Kt.isUniqueChars(word)
        assertTrue(actual)
    }

    @Test
    fun test_isUniqueCharsWithoutOtherDataStructure_isNotUnique() {
        val word = "abcdaaaaefg"
        val actual = Ch1Q1Kt.isUniqueChars(word)
        assertFalse(actual)
    }

    @Test
    fun test_isUniqueCharsWithoutOtherDataStructure_tooLong() {
        val word = "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890"
        val actual = Ch1Q1Kt.isUniqueChars(word)
        assertFalse(actual)
    }

    @Test
    fun test_isUniqueCharsWithoutOtherDataStructure_isUnique() {
        val word = "abcdefg"
        val actual = Ch1Q1Kt.isUniqueCharsWithoutOtherDataStructure(word)
        assertTrue(actual)
    }

    @Test
    fun test_isUniqueChars_isNotUnique() {
        val word = "abcdaaaaefg"
        val actual = Ch1Q1Kt.isUniqueCharsWithoutOtherDataStructure(word)
        assertFalse(actual)
    }

    @Test
    fun test_isUniqueChars_tooLong() {
        val word = "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890" +
                "abcdefghijklmnopqrstuvwxyz1234567890"
        val actual = Ch1Q1Kt.isUniqueCharsWithoutOtherDataStructure(word)
        assertFalse(actual)
    }
}
