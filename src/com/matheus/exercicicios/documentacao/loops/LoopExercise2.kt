package com.matheus.exercicicios.documentacao.loops

/*
Write a program that simulates the Fizz buzz game.
 Your task is to print numbers from 1 to 100 incrementally,
 replacing any number divisible by three with the word
"fizz", and any number divisible by five with the word "buzz".
Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".

Hint 1
Use a for loop to count numbers and a when expression to decide what to print at each step.

Hint 2
Use the modulo operator (%) to return the remainder of a number being divided.
Use the equality operator (==) to check if the remainder equals zero.

*/

fun main() {
    for (x in 1..100)  {
        println(
            when {
                (x % 5 == 0 && x % 3 == 0) -> "fizzbuzz"
                (x % 5 == 0) -> "fizz"
                x % 3 == 0 -> "buzz"
                else -> x
            }
        )
    }
}

