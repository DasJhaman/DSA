package jhaman.das.dsa.euler



/*
Problem: Project Euler:
By listing the first six prime numbers: 2,3,5,7,11 and 13 we can see that 6th prime is 13.

What is the 1001st prime number?
 */
fun main(){
 println(findNthPrime(10))
}

fun findNthPrime(n: Int): Int {
    var count = 0
    var num = 2
    var currentPrime = 0

    while (count < n) {
        if (isPrime(num)) {
            currentPrime = num
            count++
        }
        num++
    }

    return currentPrime
}
fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}