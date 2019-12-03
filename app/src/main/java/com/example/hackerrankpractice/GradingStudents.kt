package com.example.hackerrankpractice

class GradingStudents {


    companion object {
        fun gradingStudents(grades: Array<Int>): Array<Int> {
            // Write your code here
            var finalGrade = grades

            (grades.indices).forEach { i ->
                var grade = grades[i]
                if (grade < 38)
                    finalGrade[i] = grade
                else {
                    if (roundUp(grade) - grade < 3)
                        finalGrade[i] = roundUp(grade)
                    else
                        finalGrade[i] = grade
                }
            }
            return finalGrade
        }

        fun roundUp(n: Int): Int {
            return (n + 4) / 5 * 5
        }

        val expectedArray = arrayOf(75, 67, 40, 33)
        val inputArray = gradingStudents(arrayOf(73, 67, 38, 33))
    }
}