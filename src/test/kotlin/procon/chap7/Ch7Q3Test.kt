package procon.chap7

import org.junit.jupiter.api.Test
import procon.utils.read

internal class Ch7Q3Test {
    @Test
    fun test_and_verify() {
        read("q7-3") {
            val n = it.nextInt()
            val cards1 = (0 until n).map { _ ->
                it.nextList().let { (s, v) ->
                    Card(Suit.valueOf(s), v.toInt())
                }
            }.toTypedArray()
            val cards2 = cards1.copyOf()
            val obj = Ch7Q3()
            obj.quickSort(cards1)
            obj.mergeSort(cards2)

            println(if (judgeStable(cards1, cards2)) "Stable" else "Not Stable")
            cards1.forEach { c ->
                println("${c.suit} ${c.value}")
            }
        }
    }

    private fun judgeStable(arr1: Array<Card>, arr2: Array<Card>): Boolean {
        if (arr1.size != arr2.size) return false
        for (i in arr1.indices) {
            if (arr1[i] != arr2[i]) return false
        }
        return true
    }
}