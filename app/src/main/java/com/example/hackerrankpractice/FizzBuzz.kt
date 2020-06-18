package com.example.hackerrankpractice

class FizzBuzz {

    companion object {

        fun fizzBuzz(n: Int): Unit {
            (1..n).forEach { number ->
                if (number % 3 == 0 && number % 5 == 0)
                    println("FizzBuzz")
                else if (number % 3 == 0)
                    println("Fizz")
                else if (number % 5 == 0)
                    println("Buzz")
                else
                    println(number)
            }
        }
    }
}