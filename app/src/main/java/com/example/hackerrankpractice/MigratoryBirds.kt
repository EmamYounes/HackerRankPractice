package com.example.hackerrankpractice

class MigratoryBirds {

    companion object {
        fun migratoryBirds(arr: Array<Int>): Int {
            val tempArray = arr.groupingBy { it }.eachCount().filter { it.value > 1 }
            return tempArray.maxBy { it -> it.value }?.key!!
        }
    }

}