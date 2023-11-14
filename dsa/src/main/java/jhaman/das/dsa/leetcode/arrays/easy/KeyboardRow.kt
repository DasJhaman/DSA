package jhaman.das.dsa.leetcode.arrays.easy

import java.util.Locale


fun main() {
    println(findWords(words = arrayOf("Hello", "Alaska", "Dad", "Peace")).joinToString())
}

fun findWords(words: Array<String>) = words.filter { word ->
    val row = determineSet(word.first())
    word.lowercase(Locale.getDefault()).all(row::contains)
}

private val row1 = hashSetOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
private val row2 = hashSetOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
private val row3 = hashSetOf('z', 'x', 'c', 'v', 'b', 'n', 'm')

private fun determineSet(ch: Char) = when {
    row1.contains(ch.lowercaseChar()) -> row1
    row2.contains(ch.lowercaseChar()) -> row2
    else -> row3
}