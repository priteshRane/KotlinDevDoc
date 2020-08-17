package classesandobjects

import javax.naming.Context
import javax.swing.text.AttributeSet

fun main() {
    InitOrderDemo("Kotlin")
    Customer("Max")
    DerivedInitOrder("Max", "Nicole")
}

class Invoice {}

class Empty

class PersonWithConstructor constructor(firstName: String) {}

class PersonWithoutConstructor(firstName: String) {}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Customer(name: String) {
    val customerKey = name.toUpperCase()

    init {
        println("customer key: $customerKey")
    }
}

class Person(val firstName: String, val lastName: String, var age: Int)

// class CustomerAnnotationsOrVisibilityModifiers public @Inject constructor(name: String) { }

class PersonSecondary {
    var children: MutableList<PersonSecondary> = mutableListOf<PersonSecondary>()

    constructor(parent: PersonSecondary) {
        parent.children.add(this)
    }
}

class PersonSecondaryWithParam(val name: String) {
    var children: MutableList<PersonSecondaryWithParam> = mutableListOf<PersonSecondaryWithParam>()

    constructor(name: String, parent: PersonSecondaryWithParam) : this(name) {
        parent.children.add(this)
    }
}

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

class DontCreateMe private constructor() {}

class CustomerJVM(val customerName: String = "")

open class Base(p: Int)

class Derived(p: Int) : Base(p)

open class View(ctx: Context, attrs: AttributeSet)

class MyView : View {

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

open class Shape {
    open fun draw() {}
    fun fill() {}
    open val vertexCount: Int = 0
}

class Circle() : Shape() {
    override fun draw() {}
    override val vertexCount = 4
}

open class Rectangle() : Shape() {
    final override fun draw() { }
}

interface ShapeInheritance {
    val vertexCount: Int
}

class RectangleForInheritance(override val vertexCount: Int = 4) : ShapeInheritance // Always has 4 vertices

class Polygon : ShapeInheritance {
    override var vertexCount: Int = 0  // Can be set to any number later
}

open class BaseInitOrder(val name: String) {

    init { println("Initializing Base") }

    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}

class DerivedInitOrder(
        name: String,
        val lastName: String
) : BaseInitOrder(name.capitalize().also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}
