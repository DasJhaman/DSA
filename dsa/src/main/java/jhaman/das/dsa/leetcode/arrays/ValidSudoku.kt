package jhaman.das.dsa.leetcode.arrays


/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
*/
fun main() {

    var array: Array<CharArray> = arrayOf(
        charArrayOf('5','3','.','.','7','.','.','.','.'),
        charArrayOf('6','.','.','1','9','5','.','.','.'),
        charArrayOf('.','9','8','.','.','.','.','6','.'),
        charArrayOf('8','.','.','.','6','.','.','.','3'),
        charArrayOf('4','.','.','8','.','3','.','.','1'),
        charArrayOf('7','.','.','.','2','.','.','.','6'),
        charArrayOf('.','6','.','.','.','.','2','8','.'),
        charArrayOf('.','.','.','4','1','9','.','.','5'),
        charArrayOf('.','.','.','.','8','.','.','7','9'),
    )
    print(isValidSudoku(array))
}


fun isValidSudoku(board: Array<CharArray>): Boolean {
    val seen = HashSet<String>()
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            val number = board[i][j]
            if (number != '.') {
                if (!seen.add("$number in row $i") ||
                    !seen.add("$number in column $j") ||
                    !seen.add("$number in block ${i / 3}-${j / 3}")
                ) return false

            }
        }
    }
    return true
}