package solver.programmers.pccp

/**
 * PCCP 1번 동영상 재생기
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
 */
class P340213 {
    private fun to_postition(pos: String): Int {
        var split = pos.split(':')
        var r = split[0].toInt() * 60
        return r + split[1].toInt()
    }

    private fun from_postition(position: Int): String {
        var minute = position / 60
        var second = position % 60
        return String.format("%02d:%02d", minute, second)
    }


    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        var position = to_postition(pos)
        var op_start_position = to_postition(op_start)
        var op_end_position = to_postition(op_end)
        var video_len_position = to_postition(video_len)
        if (position <= op_end_position && position >= op_start_position) {
            position = op_end_position
        }
        for (command in commands) {
            if (command == "prev") {
                position -= 10
                if (position < 0) {
                    position = 0
                }
            } else if (command == "next") {
                position += 10
                if (position > video_len_position) {
                    position = video_len_position
                }
            }
            if (position <= op_end_position && position >= op_start_position) {
                position = op_end_position
            }
        }

        return from_postition(position)
    }
}