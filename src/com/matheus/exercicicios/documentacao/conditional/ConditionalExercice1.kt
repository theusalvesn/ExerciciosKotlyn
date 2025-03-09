package com.matheus.exercicicios.documentacao.conditional

import kotlin.random.Random

/*
Exercise 1
Create a simple game where you win if throwing two dice results in the same number.
Use if to print You win :) if the dice match or You lose :( otherwise
 */


fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    println(if(firstResult == secondResult) "You Win :)" else "You lose :(")

}