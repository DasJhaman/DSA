package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(isAnagram("car", "dpg"))
    println(isAnagram("anagram", "nagaram"))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val count = IntArray(26)
    for (i in 0..s.lastIndex) {
        count[s[i] - 'a']++
        count[t[i] - 'a']--
    }
    return count.none { it != 0 }
}