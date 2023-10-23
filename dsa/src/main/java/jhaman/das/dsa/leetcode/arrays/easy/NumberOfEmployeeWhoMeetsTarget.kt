package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(numberOfEmployeesWhoMetTarget(intArrayOf(0, 1, 2, 3, 4), 2))
}

fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
    return hours.count { it >= target }
}