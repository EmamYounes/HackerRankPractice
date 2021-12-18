package com.example.hackerrankpractice

import com.example.hackerrankpractice.ten_days_of_statistics.MeanMedianMode
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
    fun Jumping_On_TheClouds() {
        assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0)))
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(arrayOf(0, 0, 0, 1, 0, 0)))
    }

    @Test
    fun Breaking_TheRecords() {
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
    fun Cut_The_Sticks() {
        assertEquals(arrayOf(6, 4, 2, 1), CutTheSticks.cutTheSticks(arrayOf(5, 4, 4, 2, 2, 8)))
        assertEquals(
            arrayOf(8, 6, 4, 1),
            CutTheSticks.cutTheSticks(arrayOf(1, 2, 3, 4, 3, 3, 2, 1))
        )
    }

    @Test
    fun Non_Divisible_Subset() {
        assertEquals(3, NonDivisibleSubset.nonDivisibleSubset(3, arrayOf(1, 7, 2, 4)))
        assertEquals(
            11, NonDivisibleSubset.nonDivisibleSubset(
                7,
                arrayOf(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436)
            )
        )
    }

    @Test
    fun Repeated_String() {
        assertEquals(7, RepeatedString.repeatedString("aba", 10))
        assertEquals(1000000000000, RepeatedString.repeatedString("a", 1000000000000))
        assertEquals(588525, RepeatedString.repeatedString("aab", 882787))
        val s4 =
            "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm"
        assertEquals(51574523448, RepeatedString.repeatedString(s4, 736778906400))
        assertEquals(2, RepeatedString.repeatedString("ababa", 3))
    }

    @Test
    fun Divisible_Sum_Pairs() {
        assertEquals(3, DivisibleSumPairs.divisibleSumPairs(6, 5, arrayOf(1, 2, 3, 4, 5, 6)))
    }

    @Test
    fun Migratory_Birds() {
        assertEquals(3, MigratoryBirds.migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)))
    }

    @Test
    fun Minimum_Swaps() {
        assertEquals(3, MinimumSwaps.minimumSwaps(arrayOf(2, 3, 1, 4)))
    }

    @Test
    fun Making_Anagram() {
        assertEquals(30, MakingAnagram.makeAnagram("fcrxzwscanmligyxyvym",
            "jxwtrhvujlmrpdoqbisbwhmgpmeoke"))
    }

    @Test
    fun Mean_Median_Mode() {
/*        assertEquals(43900.6,
            MeanMedianMode.getMeanNumber(arrayOf(64630,11735,14216,99233,14470,4978,73429,38120,51135,67060)),
            0.0)

        assertEquals(44627.5,
            MeanMedianMode.getMedianNumber(arrayOf(64630,11735,14216,99233,14470,4978,73429,38120,51135,67060)),
            0.0)

        assertEquals(4978,
            MeanMedianMode.getModeNumber(arrayOf(64630,11735,14216,99233,14470,4978,73429,38120,51135,67060)))*/

        assertEquals(
            49921.5,
            MeanMedianMode.getMeanNumber(MeanMedianMode.getList()), 0.0
        )
    }
}
