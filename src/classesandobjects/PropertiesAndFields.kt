package classesandobjects

import java.lang.AssertionError

fun main() {
    println("Declaring properties")
    declaringPropertiesExample()
    println()

    println("Getters and Setters")
    getterAndSettersExample()
    println()

    println("Backing fields")
    backingFieldsExample()
    println()

    println("Backing properties")
    backingPropertiesExample()
    println()

    println("Checking initialization")
    checkInitializationExample()
    println()
}

fun declaringPropertiesExample() {
    copyAddress(Address())
}

fun getterAndSettersExample() {
    exampleOne()
    exampleTwo()
    println("Custom getter ${customGetter(0).isEmpty}")
    customeSetter().stringRepresentation = "20"
    println("Custom setter ${customeSetter().stringRepresentation}")
    println("Omit property type: ${omitPropertyType(20)}")
    println("Change visibility of accessor: ${visibilityOfAccessor().setterVisibility}")
}

fun backingFieldsExample() {
    println("Backing fields counter: ${backingFields().counter}")
}

fun backingPropertiesExample() {
    println("Backing property table: ${backingProperty().table}")
}

fun checkInitializationExample() {
    if (foo::bar.isLateinit) {
        println("Bar is lateinit")
    } else {
        println("Bar is not lateinit")
    }
}

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip

    return result
}

class exampleOne {
    // var allByDefault: Int? // error: Property must be initialized or be abstract
    var initialized = 1
}

class exampleTwo {
    // val simple: Int? // error: Property must be initialized or be abstract
    val inferredType = 1
}

class customGetter(val size: Int) {
    val isEmpty: Boolean
    get() = this.size == 0
}

class customeSetter() {
    var stringRepresentation: String
    get() = this.toString()
    set(value) {
        setDataFromString(value)
    }

    private fun setDataFromString(value: String): Int {
        return value.toInt()
    }
}

class omitPropertyType(val size: Int) {
    val isEmpty get() = this.size == 0
}

class visibilityOfAccessor() {
    var setterVisibility: String = "abc"
    private set
}

class backingFields {
    var counter = 0
    set(value) {
        if (value >= 0) field = value
    }
}

class backingProperty {
    private var _table: Int? = null
    val table: Int
    get() {
        if (_table == null) {
            _table = 20
        }
        return _table ?: throw AssertionError("Set to null by another thread")
    }
}

class foo {
    lateinit var bar: String
}