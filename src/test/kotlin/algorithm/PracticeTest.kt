package algorithm

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PracticeTest {
    @Test
    fun testPractice() {
        val p = Practice()
        val searchValue = p.binarySearch(listOf(1, 2, 3, 4, 5, 11, 21), 5)
        assertEquals(searchValue, 5 to 4)
    }
}