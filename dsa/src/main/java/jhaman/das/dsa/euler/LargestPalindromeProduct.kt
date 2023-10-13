package jhaman.das.dsa.euler


/*
Problem3: Project Euler:
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9091 = 91 x 99
. Find the largest palindrome made from the product of two 3-digit numbers.
 */
fun main() {
 println(largestPalindromeProduct())
}


fun largestPalindromeProduct(): Int {
    var largestPalindrome = 0
    for(i in 100..999){
        for(j in i .. 999){
            val product = i * j
            if (checkNumberIsPalindrome(product) && product > largestPalindrome){
                largestPalindrome = product
            }
        }
    }
    return largestPalindrome

}

fun reverseNumber(num: Int): Int {
    var n = num
    var reversed = 0

    while (n > 0) {
        val digit = n % 10      // Extract the last digit of the number
        reversed = reversed * 10 + digit  // Add the digit to the reversed number
        n /= 10               // Remove the last digit from the original number
    }

    return reversed
}

fun checkNumberIsPalindrome(num: Int): Boolean = num == reverseNumber(num)

