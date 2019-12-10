package com.example.hackerrankpractice

class NonDivisibleSubset {

    companion object {
        fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
            val remains = IntArray(k)
            for (element in s) {
                remains[element % k]++
            }
            var result = 0
            if (remains[0] > 0) {
                result++
            }
            for (i in 1 until remains.size) {
                if (i == k - i) {
                    result++
                } else {
                    if (remains[i] >= remains[k - i]) {
                        result += remains[i]
                    } else {
                        result += remains[k - i]
                    }
                    remains[i] = 0
                    remains[k - i] = 0
                }
            }
            return result
        }
    }
}
