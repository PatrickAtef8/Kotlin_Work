package com.example.kotlinlabs.daythree

interface Number {
    fun getNext(): Int
    fun reset()
}

class ByThrees : Number {
     var current = 0

    override fun getNext(): Int {
        current += 3
        return current
    }

    override fun reset() {
        current = 0
    }

}

fun main() {
    val numberRef: Number = ByThrees()



    println(numberRef.getNext())
    println(numberRef.getNext())
    println(numberRef.getNext())
    println(numberRef.getNext())


    numberRef.reset()


    println(numberRef.getNext())
    println(numberRef.getNext())


}