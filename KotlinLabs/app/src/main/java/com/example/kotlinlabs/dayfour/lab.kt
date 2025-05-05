package com.example.kotlinlabs.dayfour


class Complex(val real: Int, val imag: Int) {

    constructor(real: Int) : this(real = real, imag = 0)

    operator fun plus(plus: Complex): Complex
    {
        return Complex(real = this.real + plus.real, imag = this.imag + plus.imag)
    }
    operator fun minus(minus: Complex): Complex

        {
        return Complex(real = this.real - minus.real, imag = this.imag - minus.imag)
    }
}

fun Complex.print() {
    val absImag = if (imag < 0) -imag else imag
    when {
        imag == 0 && real == 0 -> println("0")
        imag == 0 -> println("$real")
        real == 0 -> println("${imag}i")
        else -> {
            val sign = if (imag > 0) "+" else "-"
            println("$real $sign ${absImag}i")
        }
    }
}


fun displayComplex(c: Complex, label: String = "Result")
{
    print("$label: ")
    c.print()
}

fun main() {
    val c1 = Complex(real = 3, imag = 4)

    val c2 = Complex(real = 1, imag = -2)

    val sum = c1 + c2
    val diff = c1 - c2

    val c3 = Complex(real = 5)

    displayComplex(c = c1, label = "Complex 1")
    displayComplex(c = c2, label = "Complex 2")


    displayComplex(c = sum, label = "Sum")
    displayComplex(c = diff, label = "Difference")


    displayComplex(c = c3)
}
