package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    merge(nums1 = intArrayOf(1, 2, 3, 0, 0, 0), m = 3, nums2 = intArrayOf(1, 5, 6), n = 3)
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var lastIndexOfNums1 = m - 1
    var lastIndexOfNums2 = n - 1
    var lastIndex = m + n - 1

    while (lastIndexOfNums2 >= 0) {
        print("${nums1.get(lastIndexOfNums1) > nums2.get(lastIndexOfNums2)}")
        if (lastIndexOfNums1 >= 0 && nums1.get(lastIndexOfNums1) > nums2.get(lastIndexOfNums2)) {
            nums1.set(lastIndex--, nums1.get(lastIndexOfNums1--))
        } else {
            nums1.set(lastIndex--, nums2.get(lastIndexOfNums2--))

        }

    }
    println(nums1.toList())
}
