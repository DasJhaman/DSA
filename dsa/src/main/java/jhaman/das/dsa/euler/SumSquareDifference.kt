package jhaman.das.dsa.euler

/*
Problem6: Project Euler:
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */
fun main() {
    sumOfSquareAndSquareOfNumber(100)
}

fun sumOfSquareAndSquareOfNumber(range: Int) {
    var sumOfSquare = 0
    var squareOfSum = 0

    for (i in 1..range) {
        sumOfSquare += (i * i)
        squareOfSum += i
    }
    squareOfSum *= squareOfSum

    val result = squareOfSum - sumOfSquare

    println("Result: $result")
}