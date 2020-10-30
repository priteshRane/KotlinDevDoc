package morelanguageconstruct

data class Person(val name: String, val age: Int, val country: String)
val numberMap = mapOf("one" to 1, "two" to 2, "three" to 3)

fun main() {
    println("Destructuring Declaration")
    destructuringDeclarationExample()

    println("Underscore for unused variable")
    underscoreExample()

    println("Destructuring in Lambdas")
    destructuringInLambdas()
}

fun destructuringDeclarationExample() {
    val person = Person("John", 29, "United States")
    val (name, age) = person
    println("name: $name")
    println("age: $age")
}

fun underscoreExample() {
    val person = Person("Jimmy", 20, "Germany")
    val (personName, _, personCountry) = person
    println("name: $personName")
    println("country: $personCountry")
}

fun destructuringInLambdas() {
    numberMap.mapValues { entry -> print("${entry.value}") }
    println()
    numberMap.mapValues { (key, value) -> print("$value") }
    println()
    numberMap.mapValues { (_, value) -> print("$value") }
}