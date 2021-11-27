package practice.chap1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class Ch1Q5Test {
    @ParameterizedTest
    @ValueSource(classes = [Ch1Q5J::class, Ch1Q5Kt::class])
    fun test_oneEditDistance_true1(clazz: Class<Ch1Q5>) {
        val obj = clazz.getConstructor().newInstance()
        val inputFirst = "pale"
        val inputSecond = "ple"
        assertTrue(obj.oneEditDistance(inputFirst, inputSecond))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q5J::class, Ch1Q5Kt::class])
    fun test_oneEditDistance_true2(clazz: Class<Ch1Q5>) {
        val obj = clazz.getConstructor().newInstance()
        val inputFirst = "pales"
        val inputSecond = "pale"
        assertTrue(obj.oneEditDistance(inputFirst, inputSecond))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q5J::class, Ch1Q5Kt::class])
    fun test_oneEditDistance_true3(clazz: Class<Ch1Q5>) {
        val obj = clazz.getConstructor().newInstance()
        val inputFirst = "pale"
        val inputSecond = "bale"
        assertTrue(obj.oneEditDistance(inputFirst, inputSecond))
    }

    @ParameterizedTest
    @ValueSource(classes = [Ch1Q5J::class, Ch1Q5Kt::class])
    fun test_oneEditDistance_false(clazz: Class<Ch1Q5>) {
        val obj = clazz.getConstructor().newInstance()
        val inputFirst = "pale"
        val inputSecond = "bake"
        assertFalse(obj.oneEditDistance(inputFirst, inputSecond))
    }
}
