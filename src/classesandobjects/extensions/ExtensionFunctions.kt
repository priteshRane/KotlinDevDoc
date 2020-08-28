package classesandobjects.extensions

fun main() {
    println("Extension function example: ")
    extensionFunction()
    println()

    println("Extension function (generic) example: ")
    extensionFunctionGeneric()
    println()

}

fun extensionFunction() {
    val list  = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println("Mutable list: $list")
}

fun extensionFunctionGeneric() {
    val list  = mutableListOf(1, 2, 3)
    list.swapGeneric(0, 2)
    println("Mutable list (generic): $list")
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    println("Before swap index1 is ${this[index1]} and index2 is ${this[index2]}")
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
    println("After swap index1 is ${this[index1]} and index2 is ${this[index2]}")
}

fun <T> MutableList<T>.swapGeneric(index1: Int, index2: Int) {
    println("Before swap index1 is ${this[index1]} and index2 is ${this[index2]}")
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
    println("After swap index1 is ${this[index1]} and index2 is ${this[index2]}")
}