package com.example.kotlinlabs.dayone

fun main() {
    val rows = 6

    for (i in 1..rows) {
        for (j in 1..i) {
            print("*")
        }

        for (space in 1..(rows - i + 6)) {
            print(" ")
        }

        for (space in 1..(rows - i)) {
            print(" ")
        }
        for (j in 1..(2 * i - 1)) {
            print("*")
        }

        println()
    }
}