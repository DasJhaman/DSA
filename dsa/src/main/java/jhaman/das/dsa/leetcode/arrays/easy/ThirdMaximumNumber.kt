package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(thirdMax(intArrayOf(1,2)))
}

fun thirdMax(nums: IntArray): Int {
    val set = sortedSetOf<Int>()
    nums.forEach {
        set.add(it)
        if (set.size > 3) set.remove(set.first())
    }
    val max = if (set.size > 2) set.first() else set.last()
    return max
//
//    var first = Int.MIN_VALUE
//    var second = Int.MIN_VALUE
//    var third = Int.MIN_VALUE
//
//    nums.forEach { num ->
//        if (num > first) {
//            third = second
//            second = first
//            first = num
//        } else if (num > second && num != first) {
//            third = second
//            second = num
//        } else if (num > third && num != first && num != third) {
//            third = num
//        }
//    }
//
//    return if (third == Int.MIN_VALUE) first else third


}