package com.example.hackerrankpractice

class TwoDArrayDS {

    companion object {

        fun dummyTwoDArray(): Array<Array<Int>> {
            val test2dayArray: Array<Array<Int>> = Array(6) { Array(6) { 0 } }
            test2dayArray[0][0] = 1
            test2dayArray[0][1] = 0
            test2dayArray[0][2] = 1
            test2dayArray[0][3] = 0
            test2dayArray[0][4] = 0
            test2dayArray[0][5] = 0

            test2dayArray[1][0] = 1
            test2dayArray[1][1] = 1
            test2dayArray[1][2] = 1
            test2dayArray[1][3] = 0
            test2dayArray[1][4] = 0
            test2dayArray[1][5] = 0

            test2dayArray[2][0] = 1
            test2dayArray[2][1] = 0
            test2dayArray[2][2] = 1
            test2dayArray[2][3] = 2
            test2dayArray[2][4] = 0
            test2dayArray[2][5] = 1

            test2dayArray[3][0] = 0
            test2dayArray[3][1] = 0
            test2dayArray[3][2] = 0
            test2dayArray[3][3] = 4
            test2dayArray[3][4] = 2
            test2dayArray[3][5] = 2

            test2dayArray[4][0] = 0
            test2dayArray[4][1] = 0
            test2dayArray[4][2] = 0
            test2dayArray[4][3] = 4
            test2dayArray[4][4] = 0
            test2dayArray[4][5] = 4

            test2dayArray[5][0] = 0
            test2dayArray[5][1] = 0
            test2dayArray[5][2] = 0
            test2dayArray[5][3] = 0
            test2dayArray[5][4] = 0
            test2dayArray[5][5] = 0
            return test2dayArray
        }

        fun hourglassSum(arr: Array<Array<Int>>): Int {
/*            val sumArray = arrayListOf<Int>()
            for (i in arr.indices) {
                for (j in arr[i].indices) {
                    if (arr.getOrNull(i - 1) != null && arr.getOrNull(i + 1) != null &&
                        arr[i].getOrNull(j - 1) != null && arr[i].getOrNull(j + 1) != null
                    ) {
                        val sum = arr[i - 1][j - 1] + arr[i][j - 1] + arr[i + 1][j - 1] +
                                arr[i][j] +
                                arr[i - 1][j + 1] + arr[i][j + 1] + arr[i + 1][j + 1]
                        sumArray.add(sum)
                    }
                }
            }
              return sumArray.max()!!*/
            var sumArr = listOf(0) // Bikin list penampung sum
            sumArr -= listOf(0) // biar empty dulu
            //println(sumArr)

            for(y in 0..3){
                for(x in 0..3){
                    // Hitung sum dari bentukan hourglass
                    var hourglassSum = arr[y][x] + arr[y][x+1] + arr[y][x+2] + arr[y+1][x+1] + arr[y+2][x] + arr[y+2][x+1] + arr[y+2][x+2]
                    sumArr += listOf(hourglassSum) // add ke list
                    //println(hourglassSum)
                }
            }

            //println(sumArr)
            //println(sumArr.max())

            return sumArr.max() as Int // return sum maksimum
            // '.max()' defaultnya 'Int?' jadi di cast ke Int
        }
    }
}