package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(maxProfit(intArrayOf(1)))
}

fun maxProfit(prices: IntArray): Int {

    if (prices.isEmpty() || prices.size < 2) return 0

    var minPrice = prices.first()
    var maxProfit = 0
    for (index in prices.indices) {
        if (minPrice < prices[index]) {
            val profit = prices[index] - minPrice
            maxProfit = maxOf(profit, maxProfit)
        } else {
            minPrice = prices[index]
        }
    }

    return maxProfit
}