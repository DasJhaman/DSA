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