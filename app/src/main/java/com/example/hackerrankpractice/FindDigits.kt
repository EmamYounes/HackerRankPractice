package com.example.hackerrankpractice

class FindDigits {

    companion object {

        fun findDigits(n: Int): Int {
            // Write your code here
            var count = 0
            if (n == 0 || n.toString().length == 1)
                return 1
            n.toString().forEach {
                if (it.toString().toInt() != 0 && n % it.toString().toInt() == 0)
                    count++
            }
            return count
        }
    }
}