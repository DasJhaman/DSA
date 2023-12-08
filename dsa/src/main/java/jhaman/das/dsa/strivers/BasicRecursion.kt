package jhaman.das.dsa.strivers


var localSum  = 0
fun main() {
    printOneToN(4, 1)
    println(localSum)
}


fun printOneToN(one: Int, n: Int) {
    var local = one

    if (one < n) return
    local--
    printOneToN(local, n)
    localSum +=one
    println(one)

}