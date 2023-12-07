package jhaman.das.dsa.strivers


fun main() {
    patternOne(5)
    println("<---------------------------------------->")
    patternTwo(5)
    println("<---------------------------------------->")
    patternThree(5)
    println("<---------------------------------------->")
    patternFour(5)
    println("<---------------------------------------->")
    patternFive(5)
    println("<---------------------------------------->")
    patternSix(5)
    println("<---------------------------------------->")
    patternSeven(5)
    println("<---------------------------------------->")
    patternEight(5)


}

fun patternOne(num: Int) {
    for (i in 1..num) {
        for (i in 1..num) {
            print("*")
        }
        println()
    }
}

fun patternTwo(num: Int) {
    for (i in 1..num) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

fun patternThree(num: Int) {
    for (i in 1..num) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
}

fun patternFour(num: Int) {
    for (i in 1..num) {
        for (j in 1..i) {
            print(i)
        }
        println()
    }
}

fun patternFive(num: Int) {
    for (i in num downTo 1) {
        for (j in i downTo 1) {
            print("*")
        }
        println()
    }
}

fun patternSix(num: Int) {
    for (i in num downTo 1) {
        for (j in i downTo 1) {
            print((i - j) + 1)
        }
        println()
    }
}

fun patternSeven(num: Int) {
    for (i in 0..num - 1) {
        // Space
        for (l in num - 1 downTo i + 1) {
            print(" ")
        }

        // star
        for (j in (2 * i) + 1 downTo 1) {
            print("*")
        }

        //Space
        for (k in num - 1 downTo i + 1) {
            print(" ")
        }
        println()
    }

}

fun patternEight(num: Int) {
    for (i in 0..num - 1) {
        // Space
        for (l in i downTo 1) {
            print(" ")
        }

        val range = (2 * (num) - (2*i + 1 ))
        // star
        for (j in  1..range) {
            print("*")
        }

        //Space
        for (k in i downTo 1) {
            print(" ")
        }

        println()
    }

}