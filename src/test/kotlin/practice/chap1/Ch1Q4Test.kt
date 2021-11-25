package practice.chap1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class Ch1Q4Test {
    @ParameterizedTest
    @ValueSource(classes = [Ch1Q4J::class, Ch1Q4Kt::class])
    fun test_isPalindrome_true(clazz: Class<Ch1Q4>) {
        val obj = clazz.getConstructor().newInstance()
        val input = "Tact Coa"
        val inputCheckCase = false
        assertTrue(obj.isPalindromeAscii(input, inputCheckCase))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q4J::class, Ch1Q4Kt::class])
    fun test_isPalindrome_false(clazz: Class<Ch1Q4>) {
        val obj = clazz.getConstructor().newInstance()
        val input = "Tact Coa z"
        val inputCheckCase = false
        assertFalse(obj.isPalindromeAscii(input, inputCheckCase))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q4J::class, Ch1Q4Kt::class])
    fun test_isPalindrome_consider_case_true(clazz: Class<Ch1Q4>) {
        val obj = clazz.getConstructor().newInstance()
        val input = "Tact act"
        val inputCheckCase = true
        assertTrue(obj.isPalindromeAscii(input, inputCheckCase))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q4J::class, Ch1Q4Kt::class])
    fun test_isPalindrome_consider_case_false(clazz: Class<Ch1Q4>) {
        val obj = clazz.getConstructor().newInstance()
        val input = "TACT COA Z"
        val inputCheckCase = true
        assertFalse(obj.isPalindromeAscii(input, inputCheckCase))
    }
}
