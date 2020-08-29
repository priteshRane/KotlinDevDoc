package classesandobjects

data class User (val name: String, val age: Int)

data class UserParameterless (val name: String = "", val age: Int = 0)

data class Person(val name: String) {
    var age: Int = 0
}

fun propertyDeclared() {
    val person1 = Person("John")
    val person2 = Person("John")
    person1.age = 10
    person2.age = 20

    println("Person1 age is ${person1.age}")
    println("Person2 age is ${person2.age}")
}

fun copying() {
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)

    println("Jack name is ${jack.name} and age is ${jack.age}")
    println("olderJack name is ${olderJack.name} and age is ${olderJack.age}")
}

fun destructuring() {
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("Jane name is $name and age is $age")
}

fun main() {
    println("Property declared example: ")
    propertyDeclared()
    println()

    println("Copying example: ")
    copying()
    println()

    println("Data classes and Destructuring Declarations example: ")
    destructuring()
    println()
}
