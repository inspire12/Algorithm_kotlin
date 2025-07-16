package solver.programmers.pccp
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P340211Test {

    @Test
    fun test() {
        // "[[3, 2], [6, 4], [4, 7], [1, 4]]"
        val points = arrayOf(
            intArrayOf(3, 2),
            intArrayOf(6, 4),
            intArrayOf(4, 7),
            intArrayOf(1, 4)
        )
        val routes = arrayOf(
            intArrayOf(4, 2),
            intArrayOf(1, 3),
            intArrayOf(2, 4)
        )
//        [[4, 2], [1, 3], [2, 4]]
        val solution = P340211().solution(points, routes)
        assertEquals(solution, 1)
    }

}