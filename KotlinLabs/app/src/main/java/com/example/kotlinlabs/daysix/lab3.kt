package com.example.kotlinlabs.daysix

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull


/****with try and catch*****/
//fun main() = runBlocking {
//    try {
//        withTimeout(10000) {
//            val job1 = launch {
//                repeat(20) {
//                    println("Task 1 running... $it")
//                    delay(1000)
//                }
//            }
//
//            val job2 = launch {
//                repeat(20) {
//                    println("Task 2 running... $it")
//                    delay(1000)
//                }
//            }
//
//            job1.join()
//            job2.join()
//        }
//    } catch (e: TimeoutCancellationException) {
//        println("Timeout reached")
//    }
//}



/****handling *****/


fun main() = runBlocking {
    val result = withTimeoutOrNull(10000) {
        val job1 = launch {
            repeat(20) {
                println("Task 1 running... $it")
                delay(1000)
            }
        }

        val job2 = launch {
            repeat(20) {
                println("Task 2 running... $it")
                delay(1000)
            }
        }

        job1.join()
        job2.join()

        "Both tasks completed"
    }

    if (result == null) {
        println("Timeout reached")
    } else {
        println(result)
    }
}

