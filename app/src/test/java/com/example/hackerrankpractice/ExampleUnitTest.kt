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
        assertEquals("YES", Kangaroo.kangaroo(14,4,98,2))
        assertEquals("YES", Kangaroo.kangaroo(42,3,94,2))
    }
}
