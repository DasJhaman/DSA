package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(plusOne(digits = intArrayOf(8,9,9,9)).joinToString())
}

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.indices.reversed()) {
        if (digits[i] < 9 ) {
            digits[i] = digits[i] + 1
            return digits
        } else  {
            digits[i] = 0
        }
    }

    val newDigits = IntArray(digits.size + 1)
    newDigits[0] = 1
    return newDigits
}