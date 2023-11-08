package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(kthDistinct(arr = arrayOf("d", "b", "c", "b", "c", "a"), k = 2))
}

fun kthDistinct(arr: Array<String>, k: Int): String {
    val count = arr.groupingBy { it }.eachCount()
    return arr.filter { count[it]!! == 1 }.elementAtOrElse(k - 1) { "" }

}