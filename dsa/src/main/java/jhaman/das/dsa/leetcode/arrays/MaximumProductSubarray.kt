package jhaman.das.dsa.leetcode.arrays

import kotlin.math.max


fun main(){
    println(maxProduct(nums = intArrayOf(-2)))
}
fun maxProduct(nums: IntArray): Int {
    var maxProduct = nums.max()
    var product = 1
    nums.forEach {
        product *= it
        maxProduct = max(maxProduct, product)
    }

    return maxProduct
}