package practice.chap1

import kotlin.math.abs

class Ch1Q5Kt : Ch1Q5 {
    override fun oneEditDistance(first: String, second: String): Boolean {
        if (abs(first.length - second.length) > 1) return false

        val s1 = if (first.length < second.length) first else second
        val s2 = if (first.length < second.length) second else first

        var index1 = 0
        var index2 = 0
        var foundDifference = false
        while (index1 < s1.length && index2 < s2.length) {
            if (s1[index1] != s2[index2]) {
                if (foundDifference) return false
                foundDifference = true

                if (s1.length == s2.length) index1++
            } else {
                index1++
            }
            index2++
        }
        return true
    }
}
