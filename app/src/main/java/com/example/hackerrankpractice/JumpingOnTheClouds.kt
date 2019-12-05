package com.example.hackerrankpractice

class JumpingOnTheClouds {

    companion object {

        fun jumpingOnClouds(c: Array<Int>): Int {
            var i = 0
            var minimumNumber = 0
            while (i < c.size - 1) {
                if (i + 2 < c.size && c[i + 2] == 0) i += 2
                else i++
                minimumNumber++
            }
            return minimumNumber
        }
    }
}