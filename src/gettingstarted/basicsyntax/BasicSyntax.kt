package gettingstarted.basicsyntax

import java.lang.Integer.parseInt

val PI = 3.14
var x1 = 0
val items = listOf("apple", "banana", "kiwifruit")

fun main() {
    println("Hello World!")
    println()

    println("Functions example:")
    functionsExample()
    println()

    println("Variable example:")
    variableExample()
    println()

    println("String templates example:")
    stringTemplatesExample()
    println()

    println("Conditional expressions example: ")
    conditionalExpressionsExample()
    println()

    println("Nullable values and null checks example: ")
    nullableAndNullValueExample()
    println()

    println("Type checks and automatic casts example: ")
    typeCheckAndAutomaticCastsExample()
    println()

    println("For loop example: ")
    forLoopExample()
    println()

    println("While loop example: ")
    whileLoopExample()
    println()

    println("When expression example: ")
    whenExpressionExample()
    println()

    println("Range example: ")
    rangeExample()
    println()

    println("Collection example: ")
    collectionExample()
    println()

    println("Class and instance example: ")
    classAndInstanceExample()
    println()
}

fun functionsExample() {
    println("Sum is: ${sum(10, 20)}")
    println("Sum is (inferred): ${sumInferred(30, 40)}")
    printSum(50, 60)
    printSumOmittedUnit(70, 80)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumInferred(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

fun printSumOmittedUnit(a: Int, b: Int) {
    println("Sum of (Omitted Unit) $a and $b is ${a + b}")
}

fun variableExample() {
    val a: Int = 1
    val b = 2 // Int type is inferred
    val c: Int
    c = 3
    println("val variables: a = $a, b = $b, c = $c")

    var x = 5
    x += 1
    println("var variables: x = $x")

    incrementX()
}

fun incrementX() {
    x1 += 1
    println("top level variables: $x1")
}

fun stringTemplatesExample() {
    var a1 = 1
    val s1 = "a is $a1"
    println("s1 value is: $s1")

    a1 = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a1"
    println("s2 value is: $s2")
}

fun conditionalExpressionsExample() {
    println("max of result: ${maxOf(10, 20)}")
    println("max of result (Expression): ${maxOfExpression(10, 20)}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOfExpression(a: Int, b: Int) = if (a > b) a else b

fun nullableAndNullValueExample() {
    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("a", "b")
}

fun parseIntFun(str: String): Int? {
    return parseInt(str)
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseIntFun(arg1)
    val y = parseIntFun(arg2)

    if (x != null && y != null) {
        println("print product: ${x * y}")
    } else {
        println("print product: $arg1 or $arg2 is not a number")
    }
}

fun typeCheckAndAutomaticCastsExample() {
    println("getStringLengthOne: length is = ${getStringLengthOne("abcd")}")
    println("getStringLengthTwo: length is = ${getStringLengthTwo(4)}")
    println("getStringLengthThree: length is = ${getStringLengthThree("abcd")}")
}

fun getStringLengthOne(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLengthTwo(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}

fun getStringLengthThree(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

fun forLoopExample() {
    print("for loop one: ")
    for (item in items) {
        print(item + " ")
    }
    println()

    print("for loop two (indices): ")
    for (index in items.indices) {
        print(items[index] + " ")
    }
    println()
}

fun whileLoopExample() {
    var index = 0
    while (index < items.size) {
        print("$index is ${items[index]} ")
        index++
    }
    println()
}

fun whenExpressionExample() {
    describe("Hello")
}

fun describe(obj: Any): String =
        when(obj) {
            1 -> "One"
            "Hello" -> "Greetings"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

fun rangeExample() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("List size is out of valid list indices range, too")
    }

    for (x in 1..5) {
        print(x)
    }
    println()

    for (x in 9 downTo 0 step 3) {
        print(x)
    }
    println()
}

fun collectionExample() {
    for (item in items) {
        print(item + " ")
    }
    println()

    when {
        "orange" in items -> println("Juicy")
        "apple" in items -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { print(it + " ") }

    println()
}

fun classAndInstanceExample() {
    val rectangle = Reactangle(5.0, 2.8)
    val triangle = Triangle(3.0, 4.0, 5.8)
}

class Reactangle(length: Double, width: Double) {
}

class Triangle(sideOne: Double, sideTwo: Double, sideThree: Double) {
}

