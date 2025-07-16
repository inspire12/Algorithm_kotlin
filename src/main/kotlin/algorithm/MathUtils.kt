package com.inspire12.algorithm

class MathUtils {
    fun isPrime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }

    fun createIndexMap(input: List<Int>): List<IndexedValue<Int>> {
        val withIndex = input.withIndex().toList() // O(N)
        val sorted = withIndex.sortedBy { it.value }
        return sorted
    }

    fun binarySearch(inputData: List<Int>, searchValue: Int): Pair<Int, Int> {
        val NotData: Pair<Int, Int> = -1 to -1
        val sortedData = inputData.sorted() // 정렬이 되어있어야한다.
        // idea left right
        var left = 0;
        var right = sortedData.size - 1;
        while (left <= right) {
            val mid = left + (right - left) / 2;
            when {
                sortedData[mid] == searchValue -> sortedData[mid] to mid
                sortedData[mid] < searchValue -> left = mid + 1
                sortedData[mid] > searchValue -> right = mid - 1
            }
        }
        return NotData;
    }


    /**
     * 좌표
     */

    fun isInRange(x: Int, y: Int, n: Int, m: Int): Boolean {
        return x >= 0 && x < n && y >= 0 && y < m
    }

    fun rotate90(arr: Array<IntArray?>): Array<IntArray?> {
//        	좌표계 → arr[y][x]
        val n = arr.size
        val m = arr[0]!!.size
        val res = Array<IntArray?>(m) { IntArray(n) }

        for (i in 0..<n) {
            for (j in 0..<m) {
                res[j]!![n - i - 1] = arr[i]!![j]
            }
        }
        return res
    }
}

