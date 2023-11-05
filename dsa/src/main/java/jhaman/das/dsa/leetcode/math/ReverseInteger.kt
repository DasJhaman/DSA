package jhaman.das.dsa.leetcode.math


fun main() {
    println(reverse(1534236469))
}

fun reverse(x: Int): Int {
    var result = 0
    var num = x
    while (num != 0) {
        val lastDigit = num % 10
        num /= 10

        if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && lastDigit > 7)) return 0
        if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && lastDigit < -8)) return 0

        result = (result * 10) + lastDigit

    }

    return result

}