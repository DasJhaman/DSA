package jhaman.das.dsa.leetcode.arrays.easy


fun main() {
    println(numSpecial(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 0, 0))))
}

fun numSpecial(mat: Array<IntArray>): Int {

    for (row in mat.indices) {
        for (col in mat[row].indices) {
            if (mat[row][col] == 1){

            }
        }
    }

    return  -1
}