package practice.chap1

class Ch1Q3Kt : Ch1Q3 {
    override fun replaceWhiteSpace(str: CharArray, trueLength: Int) {
        var spaceCount = 0
        for (i in 0 until trueLength) {
            if (str[i] == ' ') spaceCount++
        }
        var index = trueLength + 2 * spaceCount
        for (i in trueLength - 1 downTo 0) {
            if (str[i] == ' ') {
                str[index - 1] = '0'
                str[index - 2] = '2'
                str[index - 3] = '%'
                index -= 3
            } else {
                str[index - 1] = str[i]
                index--
            }
        }
    }
}
