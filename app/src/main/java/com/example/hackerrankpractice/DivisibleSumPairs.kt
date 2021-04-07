package com.example.hackerrankpractice

class DivisibleSumPairs {

    companion object {
        fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
            var numberOfPairs = 0

            for (i in 0 until ar.size - 1) {

                for (j in i + 1 until ar.size) {
                    if (((ar[i] + ar[j]) % k) == 0) {
                        numberOfPairs++
                    }
                }
            }
            return numberOfPairs
        }
    }
}
