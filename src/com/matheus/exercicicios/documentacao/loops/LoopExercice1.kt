package com.matheus.exercicicios.documentacao.loops
/*
Exercise 1
You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
Use a while loop.
Use a do-while loop.

fun main() {
        var pizzaSlices = 0
        // Start refactoring here
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        The following examples use the increment operator ++ to increment the value of the cakesEaten variable.
        85
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    // End refactoring here
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    }
*/

fun main () {

    // using while
    var pizzaSlicesWhile = 0
    while(pizzaSlicesWhile < 7) {
        pizzaSlicesWhile++
        println("There's only $pizzaSlicesWhile")
    }
    pizzaSlicesWhile++
    println("There are $pizzaSlicesWhile slices of pizza. Hooray! We have a whole pizza! :D")


    // using do-while
    var pizzaSlicesDoWhile = 0
    pizzaSlicesDoWhile++
    do {
        println("There's only $pizzaSlicesDoWhile")
        pizzaSlicesDoWhile++
    } while (pizzaSlicesDoWhile < 8)
    println("There are $pizzaSlicesWhile slices of pizza. Hooray! We have a whole pizza! :D ( Do-While) ")
}