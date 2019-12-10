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
        assertEquals(GradingStudents.expectedArray, GradingStudents.inputArray)
    }

    @Test
    fun Kangaroo() {
        assertEquals("YES", Kangaroo.kangaroo(0, 3, 4, 2))
        assertEquals("NO", Kangaroo.kangaroo(0, 2, 5, 3))
        assertEquals("NO", Kangaroo.kangaroo(21, 6, 47, 3))
        assertEquals("YES", Kangaroo.kangaroo(14, 4, 98, 2))
        assertEquals("YES", Kangaroo.kangaroo(42, 3, 94, 2))
    }

    @Test
    fun JumpingOnTheClouds() {
        assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0)))
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(arrayOf(0, 0, 0, 1, 0, 0)))
    }

    @Test
    fun BreakingTheRecords() {
        assertEquals(
            arrayOf(2, 4),
            BreakingTheRecords.breakingRecords(arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1))
        )
        assertEquals(
            arrayOf(4, 0),
            BreakingTheRecords.breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42))
        )
    }

    @Test
    fun CutTheSticks() {
        assertEquals(arrayOf(6, 4, 2, 1), CutTheSticks.cutTheSticks(arrayOf(5, 4, 4, 2, 2, 8)))
        assertEquals(arrayOf(8,6, 4,1), CutTheSticks.cutTheSticks(arrayOf(1,2,3,4,3,3,2,1)))
    }
}
