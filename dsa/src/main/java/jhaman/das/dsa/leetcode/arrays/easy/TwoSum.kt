package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(twoSum(nums = intArrayOf(3,2,4), 6).joinToString(","))
    println(twoSumBruteForce(nums = intArrayOf(3,2,4), 6).joinToString(","))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val set: HashMap<Int,Int> = HashMap()

    for (i in nums.indices) {
        val num = nums[i]
        val prevValue =  target - num
        if (set.containsKey(prevValue)){
            return intArrayOf(i, set[prevValue]!!)
        }

        set[num] = i
    }

    return intArrayOf()
}

fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[j] == target - nums[i]) {
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf()
}


//fun twoSum(nums: IntArray, target: Int): IntArray {
//    val map: HashMap<Int, Int> = HashMap()
//    for(i in nums.indices){
//        val num = nums[i]
//        val prevValue = target -  num
//
//        if(map.containsKey(prevValue)){
//            return intArrayOf(map[prevValue]!!, i)
//        }
//
//        map[num] = i
//    }
//
//    return intArrayOf()
//}