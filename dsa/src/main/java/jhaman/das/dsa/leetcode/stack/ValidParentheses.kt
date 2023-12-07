package jhaman.das.dsa.leetcode.stack

import java.util.Stack


fun main() {
    println(isValid("()"))
}

fun isValid(s: String): Boolean {
    if(s.length % 2 != 0 )
        return false

    val stack = Stack<Char>()
    for (cha in s.toCharArray()) {
        when(cha){
            in "({[" -> stack.push(cha)
            ')' -> if (stack.isNotEmpty() &&  stack.peek() == '(') stack.pop() else return false
            '}' -> if (stack.isNotEmpty() &&  stack.peek() == '{') stack.pop() else return false
            ']' -> if (stack.isNotEmpty() &&  stack.peek() == '[') stack.pop() else return false
        }
//        if (cha == '(' || cha == '{' || cha == '[') {
//            stack.push(cha)
//        } else if (stack.isNotEmpty() && cha == ')' && stack.peek() == '(') {
//            stack.pop()
//        } else if (stack.isNotEmpty() && cha == '}' && stack.peek() == '{') {
//            stack.pop()
//        }
//        else if (stack.isNotEmpty() && cha == ']' && stack.peek() == '[') {
//            stack.pop()
//        }else{
//            return false
//        }
    }

    return stack.isEmpty()

}