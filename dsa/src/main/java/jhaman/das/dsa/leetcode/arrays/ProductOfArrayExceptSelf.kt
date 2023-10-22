package jhaman.das.dsa.leetcode.arrays


/*
 Medium leve:
 NOTE:
 make two passes, first in-order, second in-reverse, to compute products
*/


/*
Approach:

Multiply each number with pre fix and multiply each number by post fix and solution is yours...
 */

fun main() {
    println(productExceptSelf(intArrayOf(1, 2, 3, 4)).toList())
}

fun productExceptSelf(nums: IntArray): IntArray {
    val output = IntArray(nums.size) { 1 }
    val end: Int = nums.lastIndex
    var left = 1
    var right = 1

    for (index in nums.indices) {
        output[index] *= left
        output[end - index] *= right
        left *= nums[index]
        right *= nums[end - index]
    }

    return output
}

fun solve(num:IntArray){
    val ouput = IntArray(num.size){ 1 }
}