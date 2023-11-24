package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(intersect(nums1 = intArrayOf(1, 2, 2, 1), nums2 = intArrayOf(2, 2)).joinToString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val result = mutableListOf<Int>()
    val occurrence = mutableMapOf<Int, Int>()
    for (num in nums1) {
        occurrence[num] = occurrence.getOrDefault(num, 0) + 1
    }
    for (num in nums2) {
        if (occurrence.contains(num) && occurrence[num]!! > 0) {
            result.add(num)
            occurrence[num] = occurrence[num]!! - 1
        }
    }
    return result.toIntArray()
}