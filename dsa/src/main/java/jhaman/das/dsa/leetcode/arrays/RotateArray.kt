package jhaman.das.dsa.leetcode.arrays


fun main() {

    println(rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3).toList())
    println(rotateWithSliceArray(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3).toList())
}

fun rotate(nums: IntArray, k: Int): IntArray {
    val steps = k % nums.size
    val left = 0
    val right = nums.lastIndex
    helperFunctionRotate(nums, left, right)
    helperFunctionRotate(nums, left, steps - 1)
    helperFunctionRotate(nums, steps, right)
    return nums
}

fun helperFunctionRotate(nums: IntArray, left: Int, right: Int) {
    var r = right
    var l = left
    while (l < r) {
        val temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp
        l++
        r--
    }
}

fun rotateWithSliceArray(nums: IntArray, k: Int): IntArray {
    val n = nums.size
    val steps = k % n

    val rotatedArray = nums.sliceArray(n - steps until n) + nums.sliceArray(0 until n - steps)
    rotatedArray.copyInto(nums)
    return nums
}