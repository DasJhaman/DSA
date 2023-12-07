package jhaman.das.dsa.leetcode.arrays


fun main() {

    println(combinationSum(candidates = intArrayOf(2,3,6,7), target = 7).joinToString())
}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    fun backtrack(start: Int, case: MutableList<Int>, sum: Int) {
        if (sum >= target) {
            if (sum == target) result.add(case.toList())
            return
        }

        for (i in start until candidates.size) {
            case.add(candidates[i])
            backtrack(i, case, sum + candidates[i])
            case.removeAt(case.size - 1)
        }
    }

    backtrack(0, mutableListOf(), 0)
    return result
}