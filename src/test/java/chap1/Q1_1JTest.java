package chap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1_1JTest {
    @Test
    void test_isUniqueChars_isUnique() {
        String word = "abcdefg";
        boolean actual = new Q1_1J().isUniqueChars(word);
        assertTrue(actual);
    }

    @Test
    void test_isUniqueCharsWithoutOtherDataStructure_isNotUnique() {
        String word = "abcdaaaaefg";
        boolean actual = new Q1_1J().isUniqueChars(word);
        assertFalse(actual);
    }

    @Test
    void test_isUniqueCharsWithoutOtherDataStructure_tooLong() {
        String word = "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890";
        boolean actual = new Q1_1J().isUniqueChars(word);
        assertFalse(actual);
    }

    @Test
    void test_isUniqueCharsWithoutOtherDataStructure_isUnique() {
        String word = "abcdefg";
        boolean actual = new Q1_1J().isUniqueCharsWithoutOtherDataStructure(word);
        assertTrue(actual);
    }

    @Test
    void test_isUniqueChars_isNotUnique() {
        String word = "abcdaaaaefg";
        boolean actual = new Q1_1J().isUniqueCharsWithoutOtherDataStructure(word);
        assertFalse(actual);
    }

    @Test
    void test_isUniqueChars_tooLong() {
        String word = "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890"
                + "abcdefghijklmnopqrstuvwxyz1234567890";
        boolean actual = new Q1_1J().isUniqueCharsWithoutOtherDataStructure(word);
        assertFalse(actual);
    }
}