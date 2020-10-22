package gettingstarted.basicsyntax

// Package definition and imports
import kotlin.text.*

// Top-leve Variables
val PI = 3.14
var x = 0

//String templates



// Program entry point
fun main() {
    functionsExample()
    variablesExample()
}

fun functionsExample() {
    println("Functions:")
    /*
    Two Int parameters with Int return type
     */
    println("(Int return type) Sum of 10 and 20 is ${sum1(10, 20)}")
    /*
    expression body and inferred return type
     */
    println("(Inferred return type) Sum of 10 and 20 is ${sum2(10, 20)}")
    /*
    Unit if function returning no meaningful value
    Unit return type can be ommitted
     */
    printSum(10, 20)
    println()
}

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("(Unit return type) Sum of $a and $b is ${a + b}")
}

fun variablesExample() {
    /*
    immediate assignment
     */
    val a: Int = 1
    /*
    Int type is inferred
     */
    val b = 2
    /*
    Type required when no initializer is provided
     */
    //val c: Int = 0
    //c = 3
    println("Variables")
    println("a = ${a}, b = ${b}")
    /*
    Var keyword for variables that can be reassigned
    */
    var x = 5
    println("Var variable before reassign is ${x}")
    x += 1
    println("Var variable after reassign is ${x}")
    incrementX()
    println()
}

fun incrementX() {
    x += 1
    println("(Top-level var variable) ${x}")
}