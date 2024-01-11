package jhaman.das.dsa.strivers


fun main() {
 println(countRepeatation(number = intArrayOf(1,1,2,3,4,2,4,0,0,0,0)))
}

fun countRepeatation(number: IntArray) {
    val maps = hashMapOf<Int, Int>()
    for (num in number) {
        maps[num] = maps.getOrDefault(num, 0) + 1
    }

    println(maps.toString())
}