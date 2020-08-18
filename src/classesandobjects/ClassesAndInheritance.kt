package classesandobjects

import javax.naming.Context
import javax.swing.text.AttributeSet

fun main() {
    println("Classes example")
    classesExample()
    println()

    println("Primary constructor example")
    primaryConstructorExample()
    println()

    println("Secondary constructor example")
    secondaryConstructorExample()
    println()

    println("Inheritance example")
    inheritanceExample()
    println()

    println("Overriding methods example")
    overridingMethodsExample()
    println()

    println("Overriding properties example")
    overridingPropertiesExample()
    println()

    println("Abstract classes example")
    abstractClassesExample()
    println()

    println("Derived class initialization order example")
    derivedClassInitOrderExample()
    println()

    println("Overriding rules example")
    overridingRulesExample()
    println()

    println("Calling the superclass implementation example")
    filledRectangleExample()
    println()
}

fun classesExample() {
    Invoice()
    Empty()
}

fun primaryConstructorExample() {
    PersonWithConstructorKeyword("Max")
    PersonWithoutConstructorKeyword("Max")
    InitOrderDemo("Max")
    Customer("Max")
    // DontCreateMe // Error: Classifier 'DontCreateMe' does not have a companion object, and thus must be initialized here
}

fun secondaryConstructorExample() {
    // PersonWithSecondaryConstructor()
    PersonWithDelegationSecondaryConstructor("Max")
    Constructors(10)
}

fun inheritanceExample() {

}

fun overridingMethodsExample() {

}

fun overridingPropertiesExample() {

}

fun derivedClassInitOrderExample() {
    DerivedInitOrder("Max", "Rock")
}

fun filledRectangleExample() {
    FilledRectangle().draw()
    println("Filled rectangle fill color: ${FilledRectangle().fillColor}")
    InnerRectangle().Filler().fill()
    InnerRectangle().Filler().drawAndFill()
}

fun overridingRulesExample() {
    Square().draw()
}

fun abstractClassesExample() {
    val rectangle = object: RectangleAbstract() {
        override fun draw() {
            println("Draw rectangle")
        }
    }
    rectangle.draw()
}

class Invoice { }

class Empty

class PersonWithConstructorKeyword constructor(firstName: String) { }

class PersonWithoutConstructorKeyword(firstName: String) { }

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
}

class PersonWithSecondaryConstructor {
    var children: MutableList<PersonWithSecondaryConstructor> = mutableListOf<PersonWithSecondaryConstructor>()
    constructor(parent: PersonWithSecondaryConstructor) {
        parent.children.add(this)
    }
}

class PersonWithDelegationSecondaryConstructor(val name: String) {
    var children: MutableList<PersonWithDelegationSecondaryConstructor> = mutableListOf<PersonWithDelegationSecondaryConstructor>()
    constructor(name: String, parent: PersonWithDelegationSecondaryConstructor) : this(name) {
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

class DontCreateMe private constructor () { }

open class Base(p: Int)

class Derived(p: Int) : Base(p)

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

open class RectangleSuper {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : RectangleSuper() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

class InnerRectangle : RectangleSuper() {
//    fun draw() { /* ... */ }
//    val borderColor: String get() = "black"

    inner class Filler {
        fun fill() { println("Fill() in Filler inner class of InnerRectangle") }
        fun drawAndFill() {
            super@InnerRectangle.draw()
            fill()
            println("Drawn a filled rectangle with color ${super@InnerRectangle.borderColor}")
        }
    }
}

open class RectangleRule {
    open fun draw() {  println("Rectangle rule draw") }
}

interface PolygonRule {
    fun draw() { println("Polygon rule draw") }
}

class Square() : RectangleRule(), PolygonRule {
    override fun draw() {
        super<RectangleRule>.draw()
        super<PolygonRule>.draw()
    }
}

open class Polygon {
    open fun draw() { println("Draw polygon") }
}

abstract class RectangleAbstract : Polygon() {
    abstract override fun draw()
}
