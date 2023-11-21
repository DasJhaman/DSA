package jhaman.das.dsa.euler

fun main(){
    println(findSumOfPrimePrime(2000000))
}

fun findSumOfPrimePrime(n: Long): Long {
    var currentPrime = 0L
    for(i in 2..n){
        if (isPrime(i.toInt())){
            currentPrime += i
        }
    }
    return currentPrime
}