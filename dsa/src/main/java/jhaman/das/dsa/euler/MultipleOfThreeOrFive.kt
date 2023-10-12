package jhaman.das.dsa.euler


/*
Problem1: Project Euler:

If we list all the natural numbers below 10 that are multiples of 3 or 5
, we get 3,5 and 6. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
* */
fun main() {

    println(multipleOfThreeOrFive(1000))
}

fun multipleOfThreeOrFive(sumRange: Int):Int {
    var start = 0
    var sum = 0;

    while (start < sumRange) {
        if (checkIsMultipleOfThreeOrFive(start)){
            sum += start
        }
        start++
    }

    return sum;
}


fun checkIsMultipleOfThreeOrFive(num: Int): Boolean{
    return num % 3 ==0 || num %5 == 0
}