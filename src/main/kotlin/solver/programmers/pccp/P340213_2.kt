package solver.programmers.pccp

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time

/**
 * PCCP 1번 동영상 재생기
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
 */
class P340213_2 {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        //10 초 앞 뒤 오프닝 건너 뛰기
        val videoSecond = toSecond(video_len)
        val opStartSecond = toSecond(op_start)
        val opEndSecond = toSecond(op_end)
        var curPos = toSecond(pos)

        for (command in commands) {
            if (opStartSecond <= curPos && curPos < opEndSecond) {
                curPos = opEndSecond
            }
            when {
                command == "prev" -> {
                    curPos -= 10
                    if (curPos < 0) { curPos = 0 }
                }
                command == "next" -> {
                    curPos += 10
                    if (curPos >= videoSecond) { curPos = videoSecond }
                }
            }
        }
        if (opStartSecond <= curPos && curPos < opEndSecond) {
            curPos = opEndSecond
        }

        return toTimeFormat(curPos)
    }

    private fun toSecond(time: String): Int {
        val split = time.split(':')
        return split[0].toInt() * 60 + split[1].toInt()
    }

    private fun toTimeFormat(seconds: Int): String {
        return (seconds /60).toString().padStart(2, '0') + ":" + (seconds % 60).toString(10).padStart(2, '0')
    }
}