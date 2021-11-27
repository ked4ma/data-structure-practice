package practice.chap1

class Ch1Q2Kt: Ch1Q2 {
    override fun isPermutationAscii(a: String, b: String): Boolean {
        if (a.length != b.length) return false

        val counts = IntArray(size = 128)
        for (i in a.indices) {
            counts[a[i].code]++
            counts[b[i].code]--
        }

        for (c in counts) {
            if (c != 0) return false
        }
        return true
    }

    override fun isPermutationWithSort(a: String, b: String): Boolean {
        if (a.length != b.length) return false

        fun sort(str: String): String {
            val chars = str.toCharArray()
            chars.sort()
            return String(chars)
        }

        return sort(a) == sort(b)
    }
}
