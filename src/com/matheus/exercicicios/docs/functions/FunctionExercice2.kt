package com.matheus.exercicicios.docs.functions

/*
Exercise 3

You have a function that translates a time interval given in hours, minutes, and seconds into seconds.
In most cases, you need to pass only one or two function
parameters while the rest are equal to 0. Improve the function and the code that calls
it by using default parameter values and named arguments so that the code is
easier to read.
 */

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0 , seconds: Int = 0 ) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(hours = 1, minutes = 20, seconds =15))
    println(intervalInSeconds( minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1 , seconds = 1))
}
