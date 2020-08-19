package basics

import java.lang.Integer.parseInt

var a = 10
var b = 20
fun main() {
    println("If expression example: ")
    ifExpressionExample()
    println()

    println("When expression example: ")
    whenExpressionExample()
    println()

    println("For loops example")
    forLoopExample()
    println()

    println("While loops example")
    whileLoopExample()
    println()
}

fun ifExpressionExample() {
    tranditionalUsage()
    withElse()
    asExpression()
    ifwithblocks()
}

fun whenExpressionExample() {
    whenExampleOne(2)
    conditionsCombine(1)
    arbitraryExpression(2)
    whenInRange(15)
    println("check is or !is: ${hasPrefix("hello")}")
}

fun forLoopExample() {
    forLoopRangeExampleOne()
    forLoopRangeExampleTwo()
    forLoopIndices()
    forLoopWithIndex()
}

fun whileLoopExample() {
    whileExample()
    doWhileExample()
}

fun tranditionalUsage() {
    var max = a
    if (a < b) max = b
    println("max is ${max}")
}

fun withElse() {
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("max is (with else): ${max}")
}

fun asExpression() {
    val max = if (a > b) a else b
    println("max is (expression): ${max}")
}

fun ifwithblocks() {
    val max = if(a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
}

fun whenExampleOne(x: Int) {
    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}

fun conditionsCombine(x: Int) {
    when(x) {
        0, 1 -> println("x == 0 and x == 1")
        else -> println("otherwise")
    }
}

fun arbitraryExpression(x: Int) {
    val s: String = "2"
    when(x) {
        parseInt(s) -> println("x encodes x")
        else -> println("s does not encodes x")
    }
}

fun whenInRange(x: Int) {
    val validNumbers: IntRange = 31..40
    when(x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun forLoopRangeExampleOne() {
    for (i in 1..3) {
        print("$i ")
    }
    println()
}

fun forLoopRangeExampleTwo() {
    for (i in 6 downTo 0 step 2) {
        print("$i ")
    }
    println()
}

fun forLoopIndices() {
    val array = arrayOf(1, 2, 3)
    for (i in array.indices) {
        print("${array[i]} ")
    }
    println()
}

fun forLoopWithIndex() {
    val array = arrayOf(1, 2, 3)
    for ((index, value) in array.withIndex()) {
        print("the element at $index is $value ")
    }
    println()
}

fun whileExample() {
    var x: Int = 5
    while (x > 0) {
        print("${x--} ")
    }
}

fun doWhileExample() {
    do {
        val y: String = "Hello world"
        println("$y")
    } while (y != null)
}


