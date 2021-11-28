package procon.chap5

object Ch5Q4 {
    fun run(ops: List<Pair<String, String>>) {
        val dict = Dict(5)

        ops.forEach {
            when (it.first) {
                "insert" -> dict.insert(it.second)
                "find" -> println(if (dict.find(it.second)) "yes" else "no")
            }
        }
    }
}