package solver.programmers.pccp

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time

class P340211 {

    fun solution(points: Array<IntArray>, routes: Array<IntArray>): Int {

        val allRobotPaths = mutableListOf<List<Pair<Int, Int>>>()
        var maxTime = 0;
        for (route in routes) {
            val start = route[0] - 1
            val end = route[1] - 1
            val robotPath = mutableListOf<Pair<Int, Int>>()
            val startPos = points[start]
            val endPos = points[end]
            var curPos = startPos
            var time = 0;
            while () {
                while (curPos[0] != endPos[0]) {
                    if (curPos[0] - endPos[0] > 0) {
                        curPos[0]--
                    } else {
                        curPos[0]++
                    }
                    robotPath.add(curPos[0] to curPos[1])
                }
                while (curPos[1] != endPos[1]) {
                    if (curPos[1] - endPos[1] > 0) {
                        curPos[1]--
                    } else {
                        curPos[1]++
                    }
                    robotPath.add(curPos[0] to curPos[1])
                }
                allRobotPaths.add(robotPath)
                time ++
            }
            maxTime = Math.max(maxTime, time)
        }
        val countMap = mutableMapOf<Pair<Int, Int>, Int>()
        var answer = 0;
        for (t in 0 until maxTime) {
            for (robotRobot in allRobotPaths) {
                if (t < robotRobot.size) {
                    countMap.put(robotRobot.get(t), countMap.getOrDefault(robotRobot.get(t), 0) + 1);
                    if (countMap.get(robotRobot.get(t)) == 2){
                        answer++
                    }
                }
            }
        }
        return answer
    }
}