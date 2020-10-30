package morelanguageconstruct

fun main() {
    println("Smart casts")
    demoOne(10)
    demoTwo(10)
    demoThr(10)
    demoFou(10)

    println("Unsafe cast operator")
    unsafeCastOperatorExampleOne()
    unsafeCastOperatorExampleTwo()

    println("Safe cast operator")
    safeCastOperatorExampleOne()
}

fun demoOne(x: Any) {
    if (x is String) {
        println(x.length)
    }
    // println(x.length) // Compile time error}
}

fun demoTwo(x: Any) {
    if (x !is String) return
    println(x.length) // Not showing error as above
}

fun demoThr(x: Any) {
    if (x !is String || x.length == 0) return
}

fun demoFou(x: Any) {
    if (x is String && x.length > 0) {
        println(x.length)
    }
}

fun unsafeCastOperatorExampleOne() {
    val y = null
    // val x: String = y as String // Gives exception
}

fun unsafeCastOperatorExampleTwo() {
    val y = null
    val x: String? = y as String?
}

fun safeCastOperatorExampleOne() {
    val y = null
    val x: String? = y as? String
}