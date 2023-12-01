package jhaman.das.dsa.leetcode.arrays



fun main(){
    println(search(nums = intArrayOf(4,5,6,7,0,1,2), target = 0))
}
fun search(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        val mid = (end + start) / 2
        if (nums[mid] == target) {
            return mid
        } else if (nums[start] <= nums[mid]) {
            if (nums[start] <= target && target <= nums[mid]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        } else {
            if (nums[mid] <= nums[end]) {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1
                } else {
                    end = mid - 1
                }
            }
        }
    }
    return if (nums[start] == target) start else -1
}