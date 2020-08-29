package classesandobjects

class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }

    inner class Nested2 {
        fun foo() = bar
    }
}

fun main() {
    println("Nested class example: ")
    println(Outer.Nested().foo())
    println()

    println("Inner class example: ")
    println(Outer().Nested2().foo())
    println()
}