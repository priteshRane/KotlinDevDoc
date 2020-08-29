package classesandobjects.inlineclasses

inline class Password(val value: String)

fun inlineClass() {
    val securePassword = Password("Do not try this production")
    println(securePassword)
}

inline class Name(val s: String) {
    val length: Int
    get() = s.length

    fun great() {
        println("Hello, $s")
    }
}

fun members() {
    val name = Name("Kotlin")
    name.great()
    println(name.length)
}

interface Printable {
    fun prettyPrint(): String
}

inline class Name2(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}

fun inheritance() {
    val name = Name2("Kotlin")
    println(name.prettyPrint())
}

fun main() {
    println("Inline class example: ")
    inlineClass()
    println()

    println("Members example: ")
    members()
    println()

    println("Inheritance example: ")
    inheritance()
    println()
}
