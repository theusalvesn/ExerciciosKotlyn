package com.matheus.exercicicios.documentacao.collections

/*
Exercise 2
You have a set of protocols supported by your server.
A user requests to use a particular protocol.
Complete the program to check whether the requested protocol
is supported or not (isSupported must be a Boolean value).
 */

fun main() {
    val supported = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in supported
    println("Support for $requested: $isSupported")
}
