package jhaman.das.dsa.leetcode.twopointers

fun main(){
    println(twoSum(intArrayOf(2,7,11,15), 9).toList())
    println(twoSum(intArrayOf(2,3,4), 6).toList())
    println(twoSum(intArrayOf(-1,0), -1).toList())
    println(twoSum(intArrayOf(2,7,11,15), 9).toList())
}
fun twoSum(numbers: IntArray, target: Int): IntArray {
    var start = 0
    var end = numbers.lastIndex

    while (start < end){
        val sum = numbers[start] + numbers[end]
        if (sum == target) return intArrayOf(start + 1, end + 1)

        if (sum > target) end--
        else start++
    }

    return intArrayOf(start + 1, end + 1)
}