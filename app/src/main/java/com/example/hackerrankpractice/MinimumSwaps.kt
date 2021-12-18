package com.example.hackerrankpractice

class MinimumSwaps {
    companion object {
        fun minimumSwaps(arr: Array<Int>): Int {
            var swap = 0
            for (i in arr.indices) {
                while (arr[i] != i.plus(1)) {
                    val t = arr[arr[i] - 1]
                    arr[arr[i] - 1] = arr[i]
                    arr[i] = t
                    swap += 1
                }
            }
            return swap
        }
    }
}