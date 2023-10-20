package jhaman.das.dsa.leetcode.arrays.easy

fun main(){
    println(containsDuplicate(intArrayOf(1,2,3,3)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = HashSet<Int>()
    for (num in nums){
        if (!hashSet.contains(num)) {
            hashSet.add(num)
        }
        else {
            return true
        }
    }
    return false
}

fun containsDuplicateTwo(nums: IntArray): Boolean {
    nums.sort()

    if (nums.isEmpty()) return false
    var left = 0
    var next = 1

    while (left < nums.lastIndex) {
        if (nums[left] == nums[next]) return true

        left++
        next++

    }

    return false

}