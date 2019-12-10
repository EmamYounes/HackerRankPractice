package com.example.hackerrankpractice

class RepeatedString {

    companion object {

        fun repeatedString(s: String, n: Long): Long {
            val numberOfCharA = getNumberOfRepeatedCharA(s)
            val charsInString = s.toCharArray()
            val sizeOfCharsInString = charsInString.size
            val numberOfRepeated = n % sizeOfCharsInString
            if (n < sizeOfCharsInString)
                return getNumberOfRepeatedCharA(s.substring(0,n.toInt()))
            if (numberOfCharA == n)
                return n
            if (numberOfRepeated == 0L)
                return ((n / sizeOfCharsInString) * numberOfCharA)
            if (numberOfRepeated > 0)
                return ((n / sizeOfCharsInString) * numberOfCharA) +
                        getNumberOfRepeatedCharA(s.substring(0, numberOfRepeated.toInt()))
            return 0
        }


        private fun getNumberOfRepeatedCharA(s: String): Long {
            val listOfChar = s.toCharArray()
            return listOfChar.filter { char -> char == 'a' }.toList().size.toLong()
        }
    }
}