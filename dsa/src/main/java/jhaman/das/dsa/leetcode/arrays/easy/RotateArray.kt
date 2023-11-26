package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(rotate(nums = intArrayOf(1,2,3,4,5,6,7), k = 3).joinToString())
//    7, 6, 5, 4,3,2,1
//   4,3,2,1,5,6,7
}

fun rotate(nums: IntArray, k: Int): IntArray {
    val steps = k % nums.size
    println("Steps: $steps")
    val left = 0
    val right = nums.lastIndex
    helperFunctionRotate(nums, left, right)
    println("Num1: ${nums.joinToString()}")

    helperFunctionRotate(nums, left, steps - 1)
    println("Num2: ${nums.joinToString()}")
    helperFunctionRotate(nums, steps, right)
    println("Num3: ${nums.joinToString()}")

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