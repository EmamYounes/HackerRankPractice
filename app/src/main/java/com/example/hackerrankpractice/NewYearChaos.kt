package com.example.hackerrankpractice

import kotlin.math.max


class NewYearChaos {
    companion object {

        fun minimumBribes(q: Array<Int>): Unit {
            var bribe = 0
            var chaotic = false
            val n = q.size
            for (i in 0 until n) {
                if (q[i] - (i + 1) > 2) {
                    chaotic = true
                    break
                }
                for (j in max(0, q[i] - 2) until i)
                    if (q[j] > q[i])
                        bribe++
            }
            if (chaotic)
                println("Too chaotic")
            else
                print(bribe)
        }

    }
}