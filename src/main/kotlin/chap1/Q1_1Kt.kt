package chap1

class Q1_1Kt {
    fun isUniqueChars(str: String): Boolean {
        if (str.length > 128) return false

        val charSet = BooleanArray(128)
        for(value in str) {
            if (charSet[value.code]) return false
            charSet[value.code] = true
        }
        return true
    }

    fun isUniqueCharsWithoutOtherDataStructure(str: String): Boolean {
        if (str.length > 128) return false

        for (i in 0 until str.lastIndex) {
            for (j in i + 1 until str.length) {
                if (str[i] == str[j]) return false
            }
        }
        return true
    }
}