package com.example.hackerrankpractice

import kotlin.math.abs

class MakingAnagram {

    companion object {

        private const val NUM_LETTERS = 26


         fun makeAnagram(first: String, second: String): Int {
            val array1 = createFilledArray(first)
            val array2 = createFilledArray(second)

            var deletions = 0
            for (i in 0 until NUM_LETTERS) {
                deletions += abs(array1[i] - array2[i])
            }
            return deletions
        }

        private fun createFilledArray(str: String): IntArray {
            val array = IntArray(NUM_LETTERS)
            for (element in str) {
                val ch = element
                array[ch - 'a']++
            }
            return array
        }
    }
}