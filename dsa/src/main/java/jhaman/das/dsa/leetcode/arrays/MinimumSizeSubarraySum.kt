package jhaman.das.dsa.leetcode.arrays


fun main() {
    println(minSubArrayLen(target = 4, nums = intArrayOf(1, 4, 4)))
}

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var left = 0
    var total = 0
    var result = Int.MAX_VALUE

    for (right in nums.indices) {
        total += nums[right]
        while(total >= target){
            result = minOf(result, right - left  + 1)
            total -= nums[ left++]
        }
    }
    return if (result == Int.MAX_VALUE) 0 else result
}