package jhaman.das.dsa.dsa

class Stack<T> {

    val stack = mutableListOf<T>()

    fun push(value: T) {
        stack.add(value)
    }

    fun pop(): T = stack.removeLast()

}


fun main(){
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(4)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}



