package jhaman.das.dsa.leetcode.arrays

import java.lang.Integer.max


fun main() {
    println(longestConsecutive(intArrayOf(100,4,200,1,3,2)))
}


fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return 1
    val hashSet = nums.toSet()
    var longestSize = 0
    for (num in nums) {
        val isNumberStartOfSequence = !hashSet.contains(num - 1)
        if (isNumberStartOfSequence) {
            var nextConsecutiveNumber = num + 1
            var currentSize = 1
            while (hashSet.contains(nextConsecutiveNumber)) {
                nextConsecutiveNumber++
                currentSize++
            }
            longestSize = max(longestSize, currentSize)
        }
    }
    return longestSize
}