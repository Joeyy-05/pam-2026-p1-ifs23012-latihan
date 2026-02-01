package beginner.controlFlow.LoopsPractice

fun main() {
    var pizzaSlices = 0
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    } while (pizzaSlices < 7)

    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}