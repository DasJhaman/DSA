package jhaman.das.dsa.leetcode.arrays.easy

import kotlin.math.max


fun main() {
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(maxSubArray(intArrayOf(5,4,-1,7,8)))
}

fun maxSubArray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var sum = 0
    for (num in nums){
        sum += num
        max = max(sum, max)
        if (sum < 0) sum = 0
    }
    return max
}