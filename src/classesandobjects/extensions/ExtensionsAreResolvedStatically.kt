package classesandobjects.extensions

fun main() {
    println("Type dependency example: ")
    typeDependency()
    println()

    println("Member always wins: ")
    extensionVsMember()
    println()

    println("Overload member functin example: ")
    overloadMemberFunction()
    println()
}

fun typeDependency() {
    printClassName(Rectangle())
}

fun extensionVsMember() {
    Example().printFunctionType()
}

fun overloadMemberFunction() {
    Example2().printFunctionType(1)
}

open class Shape

class Rectangle: Shape()

fun Shape.getName() = "Shape"

fun Rectangle.getName() = "Rectangle"

fun printClassName(s: Shape) {
    println(s.getName())
}

class Example {
    fun printFunctionType() { println("Class method") }
}

fun Example.printFunctionType() { println("Extension function") }

class Example2 {
    fun printFunctionType() { println("Class method") }
}

fun Example2.printFunctionType(i: Int) { println("Extension function") }


