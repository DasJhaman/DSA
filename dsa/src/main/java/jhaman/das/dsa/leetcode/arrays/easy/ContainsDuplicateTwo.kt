package jhaman.das.dsa.leetcode.arrays.easy

fun main() {
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1),3))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val hashSet = HashMap<Int, Int>()
    nums.forEachIndexed { i, num ->
        if (hashSet.containsKey(num) && i - hashSet[num]!! <= k) return true
        hashSet[num] = i
    }

    return false
}