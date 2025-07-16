package solver.programmers.pccp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.Arrays
import java.util.Collections.list
import kotlin.coroutines.coroutineContext

class P340213_2Test {
    @Test
    fun solution() {
        val solution = P340213_2().solution("34:33", "13:00", "00:55", "02:55", arrayOf("next", "prev"));
        assertEquals(solution, "13:00")
    }


    @Test
    fun solution2() {
        val solution = P340213_2().solution("04:33", "13:00", "00:55", "02:55", arrayOf("next", "prev"));
        assertEquals(solution, "")
    }
}