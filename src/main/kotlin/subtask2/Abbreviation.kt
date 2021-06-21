package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val compareStr = findMatches(a, b)
        return if (b == compareStr.toUpperCase()) {
            "YES"
        } else {
            "NO"
        }
    }

    private fun findMatches(a: String, b: String): String {
        val stringBuilder: StringBuilder = java.lang.StringBuilder()
        var iterator = 0
        for (i in b.indices) {
            for (j in iterator until a.length) {
                if (b[i] == a[j].toUpperCase()) {
                    stringBuilder.append(a[j])
                    iterator = j
                }
            }
        }
        return stringBuilder.toString()
    }
}
