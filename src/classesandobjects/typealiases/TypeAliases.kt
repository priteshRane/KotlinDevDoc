package classesandobjects.typealiases

class A {
    inner class Inner
}

class B {
    inner class Inner
}

typealias AInner = A.Inner
typealias BInner = B.Inner

typealias Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p(42)

fun main() {
    val f: (Int) -> Boolean = {it > 0}
    println(foo(f))

    val p: Predicate<Int> = { it > 8 }
    println(listOf(1, -2).filter(p))
}