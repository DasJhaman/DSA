package jhaman.das.dsa.euler

/*
Problem9: Project Euler:
EThere exists exactly one Pythagorean
 triplet for which  a + b + c  = 1000
Find the product abc
* */



fun main() {
    val triplet = findPythagoreanTriplet(1000)

    if (triplet != null) {
        val product = triplet.first * triplet.second * triplet.third
        println("The Pythagorean triplet is: ${triplet.first}, ${triplet.second}, ${triplet.third}")
        println("The product abc is: $product")
    } else {
        println("No Pythagorean triplet found for a + b + c = 1000.")
    }
}
fun findPythagoreanTriplet(sum: Int): Triple<Int, Int, Int>? {
    for (a in 1 until sum) {
        for (b in a until sum) {
            val c = sum - a - b
            println(a * a )
            println(Math.sqrt(a.toDouble()) )

            if (a * a + b * b == c * c) {
                return Triple(a, b, c)
            }
        }
    }
    return null
}