package jhaman.das.dsa.leetcode.twopointers


fun main() {
    println(trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
}

fun trap(height: IntArray): Int {
    var l = 0
    var r = height.lastIndex
    var leftMax = height.first()
    var rightMax = height.last()
    var result = 0

    while (l < r) {
        if (leftMax < rightMax) {
            l += 1
            leftMax = maxOf(leftMax, height[l])
            result += leftMax - height[l]
        } else {
            r -= 1
            rightMax = maxOf(rightMax, height[r])
            result += rightMax - height[r]
        }
    }

    return result
}