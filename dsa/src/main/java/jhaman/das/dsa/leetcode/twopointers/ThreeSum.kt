package jhaman.das.dsa.leetcode.twopointers


fun main() {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)).toList())
}

fun threeSum(nums: IntArray): List<List<Int>> {
    var set = hashSetOf<List<Int>>()
    nums.sort()
    for (i in 0..nums.size) {
        var leftPointer = i + 1
        var rightPointer = nums.lastIndex
        while (leftPointer < rightPointer) {
            val threeSum = nums[i] + nums[leftPointer] + nums[rightPointer]
            when {
                threeSum == 0 -> {
                    set.add(listOf(nums[i], nums[leftPointer], nums[rightPointer]))
                    leftPointer++
                    rightPointer--
                }

                threeSum > 0 -> {
                    rightPointer--
                }

                else -> {
                    leftPointer++
                }
            }
        }
    }

    return set.toList()
}