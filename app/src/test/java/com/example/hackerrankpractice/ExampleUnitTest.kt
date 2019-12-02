package com.example.hackerrankpractice

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun Grading_Students() {
        assertEquals(arrayOf(75,67,40,33), gradingStudents(arrayOf(73,67,38,33)))
    }

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
}
