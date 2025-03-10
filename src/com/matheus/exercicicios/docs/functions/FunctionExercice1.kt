package com.matheus.exercicicios.docs.functions

/*
Write a function called circleArea that takes the radius of a circle in integer
format as a parameter and outputs the area of that circle.
 */
import kotlin.math.PI

fun circleArea(radius: Int ) : Double =  PI * ( radius * radius)

// Write your code here
fun main() {
    println(circleArea(radius = 2))
}