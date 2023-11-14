package jhaman.das.dsa.leetcode.strings

import java.lang.StringBuilder


fun main() {
    println(mergeAlternately(word1 = "a", word2 = "bdf"))
}

fun mergeAlternately(word1: String, word2: String): String {
    var string = StringBuilder()
    var i1 = 0
    var i2 = 0
    while (i1 < word1.length && i2 < word2.length) {
        string.append(word1[i1++]).append(word2[i2++])
    }

    if (i1 < word1.length) {
        string.append(word1.substring(i1))
    }
    if (i2 < word2.length) {
        string.append(word2.substring(i2))
    }

   return string.toString()

}