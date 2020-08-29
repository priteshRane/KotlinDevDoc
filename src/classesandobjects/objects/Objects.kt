package classesandobjects.objects

open class A(x: Int) {
    public open val y: Int = x
}

interface B { }

val ab: A = object : A(1), B {
    override val y = 25
}

private fun foo() {
    val adHoc = object {
        var x: Int = 10
        var y: Int = 20
    }
    print(adHoc.x + adHoc.y)
}

class C {
    private fun foo() = object {
        val x: String = "x"
    }

    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x
        //val x2 = publicFoo().x
    }
}

object DataProviderManager {
    fun registerDataProvider(x: Int) {
        println(x)
    }

    val allDataProviders: String
    get() = "abc"
}

class MyClass() {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

fun main() {
    println("Supertype constructor example: ")
    println(ab.y)
    println()

    println("Just an object example: ")
    foo()
    println()

    println("Object declaratins example: ")
    DataProviderManager.registerDataProvider(2)
    println(DataProviderManager.allDataProviders)
    println()
}