package jhaman.das.dsa.euler

/*
Problem3: Project Euler:

 */
fun main() {
 print(largestPrimeFactor(600851475143))
}


fun largestPrimeFactor(number: Long): Long {
    var n = number
    var divisor = 2
    var largestPrimerFactor = 0L

    while ( n > 1){
        while (n % divisor == 0L) {
            largestPrimerFactor = divisor.toLong()
            n /= divisor
        }
        divisor++
    }

    return largestPrimerFactor
}