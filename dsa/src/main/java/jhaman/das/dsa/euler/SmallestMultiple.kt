package jhaman.das.dsa.euler

/*
Problem5: Project Euler:

2520 s the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

fun main(){
//    smallestMultiple()
    println("Result ${smallestMultiple(20)}")
}

fun smallestMultiple() {
    var smallestNumber = 1
    var startNum = 20
    while (true){
        if (checkIsNumberIsDivisible(startNum)){
            smallestNumber = startNum
            break
        }
        startNum++
    }
    println("REsult: $smallestNumber")

}

fun checkIsNumberIsDivisible(num: Int): Boolean {
    for (i in 1..20) {
        if (num % i != 0) return false
    }
    return true
}


fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}

fun lcm(a: Long, b: Long): Long {
    return a * b / gcd(a, b)
}

fun smallestMultiple(n: Int): Long {
    var result = 1L
    for (i in 2..n) {
        result = lcm(result, i.toLong())
    }
    return result
}