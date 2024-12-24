package solver.programmers.pccp1

import com.inspire12.solver.programmers.pccp1.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class SolutionTest {

    @Test
    fun case_sample1() {
        // Arrange
        // test input
        // 첫 번째 셋
        val videoLen = "34:33"
        val pos = "13:00"
        val opStart = "00:55"
        val opEnd = "02:55"
        val commands = arrayOf("next", "prev")
        val result1 = "13:00"

        val service = Solution()

        // Act
        val result = service.solution(videoLen, pos, opStart, opEnd, commands)
        // Assert
        assertEquals(result, result1)
    }

    @Test
    fun case_sample2() {
        // Arrange
        // test input
        // 첫 번째 셋
// 두 번째 셋
        val videoLen = "10:55"
        val pos = "00:05"
        val opStart = "00:15"
        val opEnd = "06:55"
        val commands = arrayOf("prev", "next", "next")
        val result2 = "06:55"

        val service = Solution()

        // Act
        val result = service.solution(videoLen, pos, opStart, opEnd, commands)
        // Assert
        print(result)
        assertEquals(result, result2)
    }

    @Test
    fun case_sample3() {
        // Arrange
        // test input

        val videoLen = "07:22"
        val pos = "04:05"
        val opStart = "00:15"
        val opEnd = "04:07"
        val commands = arrayOf("next")
        val result3 = "04:17"

        val service = Solution()

        // Act
        val result = service.solution(videoLen, pos, opStart, opEnd, commands)
        print(result)
        // Assert
        assertEquals(result, result3)
    }
}
