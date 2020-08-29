package classesandobjects.delegation

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun implDelegation() {
    val b = BaseImpl(10)
    Derived(b).print()
}

fun main() {
    println("Implementatin by delegation example")
    implDelegation()
    println()

    println("Override example one: ")
    println()

    println("Override example two: ")
    println()
}