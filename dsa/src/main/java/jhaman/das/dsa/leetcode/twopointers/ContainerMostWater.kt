package jhaman.das.dsa.leetcode.twopointers


fun main() {

    println(maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
}

fun maxArea(height: IntArray): Int {
    var maxArea = 0
    var leftPointer = 0
    var rightPointer = height.lastIndex

    while (leftPointer < rightPointer) {
        val area = minOf(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer)
        maxArea = maxOf(maxArea, area)

        if (height[leftPointer] < height[rightPointer])
            leftPointer ++
        else
            rightPointer --
    }

    return maxArea
}