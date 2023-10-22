package jhaman.das.dsa.leetcode.arrays


fun main() {
    println(twoSum(nums = intArrayOf(2, 7, 11, 15), 9).joinToString(","))
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