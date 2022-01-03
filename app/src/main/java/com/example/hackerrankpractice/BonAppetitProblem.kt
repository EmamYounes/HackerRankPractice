package com.example.hackerrankpractice

class BonAppetitProblem {

    companion object {
        fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
            // Write your code here
            var sum = 0
            for (item in bill) {
                sum += item
            }
            sum -= bill[k]
            val average = sum / 2
            if (average == b)
                print("Bon Appetit")
            else
                print(b - average)
        }
    }

}