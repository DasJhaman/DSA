package jhaman.das.dsa.leetcode.arrays.easy



fun main(){
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}
fun removeDuplicates(nums: IntArray): Int {
//    var count = 1
//    for(i in 1 until nums.size){
//        if(nums[i] != nums[i-1]){
//            nums[count] = nums[i]
//            count++
//        }
//    }
//    return count

    var range = if(nums.isNotEmpty()) 1 else 0

    for(i in nums){
        if(i > nums[range-1]){
            nums[range++] = i
        }

    }

    return range
}
