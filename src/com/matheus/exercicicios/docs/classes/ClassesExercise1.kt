package com.matheus.exercicicios.docs.classes

data class Employee(val name: String, var salary: Double)

fun main() {
    val emp = Employee("Mary", 20.00)
    println(emp)
    emp.salary += 10.00
    println(emp)
}

