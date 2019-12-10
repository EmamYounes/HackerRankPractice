package com.example.hackerrankpractice

class CutTheSticks {
    companion object {

        fun cutTheSticks(arr: Array<Int>): Array<Int> {
            var temArr = mutableListOf<Int>()
            val sticksCut = arrayListOf<Int>()
            temArr.addAll(arr)
            while (temArr.isNotEmpty()) {
                val lengthOfCut = temArr.min()?.toInt()
                if (lengthOfCut != null) {
                    sticksCut.add(temArr.size)
                    temArr = temArr.filter { i -> i > lengthOfCut }.toMutableList()
                }
            }
            val array = arrayOfNulls<Int>(sticksCut.size)
            return sticksCut.toArray(array)
        }

    }
}