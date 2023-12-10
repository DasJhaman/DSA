package jhaman.das.dsa.leetcode.contest



fun main(){
    println(countTestedDevices(batteryPercentages = intArrayOf(1,1,2,1,3)))
}
fun countTestedDevices(batteryPercentages: IntArray): Int {
    var k = 0
    for (a in batteryPercentages)
        k += if (a > k) 1 else 0
    return k
}