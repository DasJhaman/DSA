package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    (moveZeroes(intArrayOf(0, 1, 0, 2, 12)))
}

fun moveZeroes(nums: IntArray) {
    var cur = 0
    nums.forEachIndexed { index, i ->
        if (i != 0) {
            val temp = nums[cur]
            nums[cur++] = nums[index]
            nums[index] = temp
        }
    }

    println(nums.joinToString())
}