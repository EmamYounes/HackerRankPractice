package com.example.hackerrankpractice

import kotlin.math.sqrt

class Encryption {


    companion object {
        fun encryption(s: String): String {
            val sentence = s.trim()
            var i = 0
            val arrayList= arrayListOf<String>()
            val rowsNumber = sqrt(sentence.length.toDouble()).toInt()
            while (i < sentence.length) {
                arrayList.add( sentence.subSequence(i, rowsNumber + i).toString())
                i += rowsNumber
            }
            arrayList.add(sentence.subSequence(i, sentence.length).toString())
            arrayList.forEach { j->

            }
            return sentence
        }
    }
}