package com.example.hackerrankpractice

class BreakingTheRecords {

    companion object {

        fun breakingRecords(scores: Array<Int>): Array<Int> {
            var highestScoreVariable = scores[0]
            var highestScore = 0
            var lowestScoreVariable = scores[0]
            var lowestScore = 0
            (1 until scores.size).forEach { i ->
                if (scores[i] > highestScoreVariable) {
                    highestScoreVariable = scores[i]
                    highestScore++
                } else if (scores[i] < lowestScoreVariable) {
                    lowestScoreVariable = scores[i]
                    lowestScore++
                }
            }

            return arrayOf(highestScore, lowestScore)
        }
    }
}