package com.example.hackerrankpractice

class LeftRotation {
    companion object {
        fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
            val leftA = a.take(d)
            val rightA = a.copyOfRange(d, a.count())
            return rightA + leftA
        }
    }
}