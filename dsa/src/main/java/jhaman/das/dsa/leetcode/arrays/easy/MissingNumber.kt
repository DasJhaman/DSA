package jhaman.das.dsa.leetcode.arrays.easy


fun main(){
    println(missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
}

fun missingNumber(nums: IntArray): Int {

    val n = nums.size
    var totalSum = (n * (n + 1)) / 2

    nums.forEach { totalSum -= it }

    return totalSum
//    nums.sort()
//    var missingNumber  = nums.first()
//    nums.forEach {
//        if (missingNumber == it)
//            missingNumber++
//    }
//
//    return missingNumber
}