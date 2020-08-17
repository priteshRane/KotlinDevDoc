package basics

fun main() {
    println("Numbers example: ")
    numbersExample()
    println()

    println("Operations example: ")
    operationsExample()
    println()

    println("Characters example: ")
    charactersExample()
    println()

    println("Booleans example: ")
    booleanExample()
    println()

    println("Arrays example: ")
    arraysExample()
    println()

    println("Strings example: ")
    stringExample()
    println()
}

fun numbersExample() {
    integerNumbers()
    floatingPointNumbers()
    // printDouble(1) // Type mismatch
    printDouble(1.1)
    // printDouble(1.1f) // Type mismatch
    underscoreNumericLiterals()
    representation()
    explicitConversions()
}

fun integerNumbers() {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
}

fun floatingPointNumbers()  {
    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
}

fun printDouble(d: Double) {
    print(d)
}

fun underscoreNumericLiterals() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
}

fun representation() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
    println(a == a)
    println(boxedA == anotherBoxedA)
}

fun explicitConversions() {
    val b: Byte = 1
    val i: Int = b.toInt()
    println(i)
}

fun operationsExample() {
    divisionOfIntegers()
    bitwiseOperations()
}

fun divisionOfIntegers() {
    val x1 = 5 / 2
    println(x1 == 2)

    val x2 = 5L / 2
    println(x2 == 2L)

    val x3 = 5 / 2.toDouble()
    println(x3 == 2.5)
}

fun bitwiseOperations() {

}

fun charactersExample() {

}

fun booleanExample() {

}

fun arraysExample() {

}

fun stringExample() {
    
}

