package com.example.kotlinlabs.daytwo


abstract class Shape(var dim: Double) {



    init {
        dim = 0.0
    }
    abstract fun calcArea(): Double
}

class Rectangle(var width: Double,var height: Double) : Shape(width) {


    //Law Square fa el 2 sides equal
    constructor(side: Double) : this(side, side)



    override fun calcArea(): Double {
        return width * height
    }
}

class Circle(var radius: Double) : Shape(radius) {

    override fun calcArea(): Double {
        return 3.14 * radius * radius
    }
}

class Triangle(var base: Double, var height: Double) : Shape(base)
{


    override fun calcArea(): Double {
        return 0.5 * base * height
    }
}
class Picture {
    fun sumAreas(s1: Shape, s2: Shape, s3: Shape): Double {
        return s1.calcArea() + s2.calcArea() + s3.calcArea()
    }
}

fun main() {
    val rect = Rectangle(4.0, 6.0)
    val square = Rectangle(5.0)
    val circ = Circle(3.0)
    val tri = Triangle(3.0, 4.0)

    val picture = Picture()
    println("Sum of rect, circ, tri areas = ${picture.sumAreas(rect, circ, tri)}")
    println("Sum of square, circ, tri areas = ${picture.sumAreas(square, circ, tri)}")
}
