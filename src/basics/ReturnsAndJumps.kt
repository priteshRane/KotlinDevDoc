package basics

fun main() {
    println("Returns and Jumps example: ")
    returnsAndJumpsExample()
    println()

    println("Break and Continue example: ")
    breakAndContinueLabels()
    println()

    println("Return at Labels example: ")
    returnAtLabelsExample()
    println()
}

fun returnsAndJumpsExample() {

}

fun breakAndContinueLabels() {
    loopExample()
}

fun returnAtLabelsExample() {
    returnFromFunction()
    returnFromLambda()
    returnToImplicitLabels()
    returnFromAnonymousFunction()
}

fun loopExample() {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            print("$j ")
            if (j == 3) break@loop
        }
    }
}

fun returnFromFunction() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        print(it)
    }
    println("this poin is unreachable")
}

fun returnFromLambda() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit
        print(it)
    }
}

fun returnToImplicitLabels() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with implicit label")
}

fun returnFromAnonymousFunction() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
        print(value)
    })
    print(" done with anonymous function")
}