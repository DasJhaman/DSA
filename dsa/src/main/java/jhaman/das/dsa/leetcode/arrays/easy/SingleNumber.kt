package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(singleNumber(intArrayOf(4, 4, 1)))
}

    fun singleNumber(nums: IntArray): Int {
    var bits = 0
    nums.forEach {
        bits = bits xor it
    }
    return bits
}