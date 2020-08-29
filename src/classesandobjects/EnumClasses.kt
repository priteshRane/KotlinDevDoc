package classesandobjects

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

enum class IntArithmetics: BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(p0: Int, p1: Int): Int {
            return p0 + p1
        }
    },
    TIMES {
        override fun apply(p0: Int, p1: Int): Int {
            return p0 + p1
        }
    };

    override fun applyAsInt(p0: Int, p1: Int): Int {
        return apply(p0, p1)
    }
}

fun main() {
    println("Enum class example: ")
    println(Direction.EAST)
    println()

    println("Enum class Initialization example: ")
    println(Color.RED)
    println()

    println("Anonymous classes example: ")
    println(ProtocolState.WAITING.signal())
    println(ProtocolState.TALKING.signal())
    println()
}