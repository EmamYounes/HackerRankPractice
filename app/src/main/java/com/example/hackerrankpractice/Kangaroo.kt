package com.example.hackerrankpractice

class Kangaroo {

    companion object {

        fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
            var x1v1 = x1 + v1
            var x2v2 = x2 + v2
            when (true) {
                x1 > x2 -> return "NO"
                v2 > v1 -> return "NO"
            }
            for (i in 0..5000) {
                if (x1v1 == x2v2)
                    return "YES"
                else {
                    x1v1 += v1
                    x2v2 += v2
                }
            }
            return "NO"
        }
    }
}