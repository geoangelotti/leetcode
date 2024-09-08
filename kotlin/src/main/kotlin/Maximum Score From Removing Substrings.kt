package o.mg

import java.util.*

fun maximumGain(s: String, x: Int, y: Int): Int {
    val stack1 = Stack<Char>()
    val stack2 = Stack<Char>()
    val first = if (x>y) 'a' else 'b'
    val second = if (x>y) 'b' else 'a'
    var result = 0
    s.forEach { char ->
        if (stack1.isNotEmpty() && stack1.peek() == first && char == second) {
            stack1.pop()
            result += maxOf(x,y)
        } else {
            stack1.push(char)
        }
    }
    while(stack1.isNotEmpty()) {
        val char = stack1.pop()
        if (stack2.isNotEmpty() && stack2.peek() == first && char == second) {
            stack2.pop()
            result += minOf(x, y)
        } else {
            stack2.push(char)
        }
    }
    return result
}