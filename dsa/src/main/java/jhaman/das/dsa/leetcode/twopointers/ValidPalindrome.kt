package jhaman.das.dsa.leetcode.twopointers



fun main() {
    println(isPalindromeKotlinWay("A man, a plan, a canal: Panama"))
}


fun isPalindromeKotlinWay(s: String): Boolean{
    val result = s.filter { it.isLetterOrDigit() }.map { it.lowercaseChar() }
    return result == result.reversed()
}
fun isPalindrome(s: String): Boolean {
    // Base case
    if (s.isEmpty()) return true
    var start = 0
    var end = s.lastIndex

    while (start < end) {
        if (!Character.isLetterOrDigit(s[start])){
            start++
            continue
        }
        if (!Character.isLetterOrDigit(s[end])){
            end--
            continue
        }
        if (s[start].lowercaseChar() != s[end].lowercaseChar()) {
            return false
        }
        start++
        end--
    }
    return true
}