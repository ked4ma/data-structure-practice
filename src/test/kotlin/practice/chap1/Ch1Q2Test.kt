package practice.chap1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class Ch1Q2Test {
    @ParameterizedTest
    @ValueSource(classes = [Ch1Q2J::class, Ch1Q2Kt::class])
    fun test_isPermutationAscii_true(clazz: Class<Ch1Q2>) {
        val obj = clazz.getConstructor().newInstance()
        val inputA = "abcdefg"
        val inputB = "cfagbed"
        assertTrue(obj.isPermutationAscii(inputA, inputB))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q2J::class, Ch1Q2Kt::class])
    fun test_isPermutationAscii_false(clazz: Class<Ch1Q2>) {
        val obj = clazz.getConstructor().newInstance()
        val inputA = "abcdefg"
        val inputB = "avcdefg"
        assertFalse(obj.isPermutationAscii(inputA, inputB))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q2J::class, Ch1Q2Kt::class])
    fun test_isPermutationAscii_differenceLength(clazz: Class<Ch1Q2>) {
        val obj = clazz.getConstructor().newInstance()
        val inputA = "abcdefg"
        val inputB = "abcdefghi"
        assertFalse(obj.isPermutationAscii(inputA, inputB))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q2J::class, Ch1Q2Kt::class])
    fun test_isPermutationWithSort_true(clazz: Class<Ch1Q2>) {
        val obj = clazz.getConstructor().newInstance()
        val inputA = "abcdefg"
        val inputB = "cfagbed"
        assertTrue(obj.isPermutationWithSort(inputA, inputB))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q2J::class, Ch1Q2Kt::class])
    fun test_isPermutationWithSort_false(clazz: Class<Ch1Q2>) {
        val obj = clazz.getConstructor().newInstance()
        val inputA = "abcdefg"
        val inputB = "avcdefg"
        assertFalse(obj.isPermutationWithSort(inputA, inputB))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q2J::class, Ch1Q2Kt::class])
    fun test_isPermutationWithSort_differenceLength(clazz: Class<Ch1Q2>) {
        val obj = clazz.getConstructor().newInstance()
        val inputA = "abcdefg"
        val inputB = "abcdefghi"
        assertFalse(obj.isPermutationWithSort(inputA, inputB))
    }
}
