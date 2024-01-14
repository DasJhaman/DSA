package jhaman.das.dsa.strivers.sorting


fun main() {
  selectionSort(arrayOf(13, 46, 24, 52, 20, 9))
}

fun selectionSort(array: Array<Int>) {
    array.forEachIndexed { index, i ->
        var minimumIndex = index
        for (j in minimumIndex .. array.lastIndex) {
            if (array[j] < array[minimumIndex]) {
                minimumIndex = j
            }
        }
        val temp = array[index]
        array[index]  = array[minimumIndex]
        array[minimumIndex] = temp
    }

    println(array.joinToString())
}