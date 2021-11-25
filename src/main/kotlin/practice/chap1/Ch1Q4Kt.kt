package practice.chap1

class Ch1Q4Kt : Ch1Q4 {
    override fun isPalindromeAscii(str: String, checkCase: Boolean): Boolean {
        val s = if (!checkCase) str.lowercase() else str
        val counts = IntArray(128)
        s.forEach {
            if (it == ' ') return@forEach
            counts[it.code]++
        }
        var oddCount = 0
        for (i in 0 until 128) {
            if (counts[i] % 2 != 0) {
                oddCount++
            }
        }
        return oddCount <= 1
    }
}
