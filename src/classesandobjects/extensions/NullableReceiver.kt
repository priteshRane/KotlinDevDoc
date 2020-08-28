package classesandobjects.extensions

fun main() {
    println("Nullable receiver example")
    println((null).toString())
    println((2).toString())
    println()
    println()
}

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}