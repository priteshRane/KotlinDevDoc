package classesandobjects.extensions

class MyClass {
    companion object {
        fun printCompanion() { println("companion") }
    }
}

fun main() {
    MyClass.printCompanion()
}