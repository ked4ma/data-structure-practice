package procon.chap5

class Dict(private val size: Int) {
    private val table = arrayOfNulls<String>(size)

    fun find(str: String): Boolean {
        val key = getKey(str)
        var i = 0
        while (true) {
            val h = h(key, i)
            val s = table[h]
            if (s == null) {
                return false
            } else if (str == s) {
                return true
            }
            i++
        }
    }

    fun insert(str: String): Boolean {
        val key = getKey(str)
        var i = 0
        while (true) {
            val h = h(key, i)
            val s = table[h]
            if (s == null) {
                table[h] = str
                return true
            } else if (str == s) {
                return false
            }
            i++
        }
    }

    // ===== key =====
    private fun getKey(c: Char) = when (c) {
        'A' -> 1
        'C' -> 2
        'G' -> 3
        'T' -> 4
        else -> 0
    }

    private fun getKey(str: String): Long {
        var sum = 0L
        var p = 1L
        for (i in str.indices.reversed()) {
            sum += getKey(str[i]) * p
            p *= 5
        }
        return sum
    }

    private fun h1(key: Long) = key % size
    private fun h2(key: Long) = 1 + key % (size - 1)
    private fun h(key: Long, i: Int) = ((h1(key) + i * h2(key)) % size).toInt()
}