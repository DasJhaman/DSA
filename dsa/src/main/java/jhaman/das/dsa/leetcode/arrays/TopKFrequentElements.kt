package jhaman.das.dsa.leetcode.arrays



fun main(){
    println(topKFrequent(nums = intArrayOf(1,1,1,2,2,3), k = 2).joinToString())
}
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = nums.toList().groupingBy { it }.eachCount()
    val freq = Array<MutableList<Int>>(nums.size) { mutableListOf() } // [freq : elements]
    map.forEach { (k, v) ->
        freq[v].add(k)
    }
    return freq.flatMap{ it }.takeLast(k).toIntArray()

}