package com.example.hackerrankpractice

class AppleAndOrange {


    companion object {
        fun countApplesAndOranges(
            s: Int,
            t: Int,
            a: Int,
            b: Int,
            apples: Array<Int>,
            oranges: Array<Int>
        ): Unit {

            var applesInHouseCount = 0
            var orangesInHouseCount = 0
            apples.map {
                val apple = it.plus(a)
                if (apple in s..t) applesInHouseCount++
            }
            oranges.map {
                val orange = it.plus(b)
                if (orange in s..t) orangesInHouseCount++

            }
            println(applesInHouseCount)
            println(orangesInHouseCount)
        }
    }
}