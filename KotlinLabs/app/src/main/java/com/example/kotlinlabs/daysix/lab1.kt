package com.example.kotlinlabs.daysix

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


/****launch****/


//
//fun main() {
//    runBlocking {
//        val job = launch {
//            for (i in 1..10) {
//                println("Launch: Number $i")
//                delay(500)
//            }
//        }
//        job.join()
//    }
//}


/****async****/
fun main() {
    runBlocking {
        val job = async {
            val numbers = mutableListOf<Int>()
            for (i in 1..10) {
                numbers.add(i)
                delay(500)
            }
            numbers
        }

        val result = job.await()
        println("$result")
    }
}
