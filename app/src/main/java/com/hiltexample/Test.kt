package com.hiltexample

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    var main = runBlocking {
        var job : Job =launch {
           delay(1000)
            println("This is launch ")
        }
        println("This is Outer runBlocking")

    }
}