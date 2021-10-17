package racingcar

import java.util.Random

object Racing {
    fun readyToRace() {
        val carList = mutableListOf<Car>()
        println("자동차 대수는 몇 대인가요?")
        val car: String = readLine()!!
        println("시도할 횟수는 몇 회인가요?")
        val count: String = readLine()!!

        for (i in 1..car.toInt()) {
            carList.add(Car(i))
        }

        start(carList, count)
    }

    private fun start(car: List<Car>, count: String) {
        val tempList = arrayListOf<Car>()
        tempList.addAll(car)
        val random = Random()
        println("실행 결과")
        for (i in 1..count.toInt()) {
            println("$i 번째 실행")
            tempList.mapIndexed { index, item ->
                val num = random.nextInt(9)
                if (num >= 4) {
                    Car(index, item.distance.plus("-"))
                } else {
                    Car(index, item.distance)
                }
            }.forEachIndexed { index, car ->
                tempList[index] = car
                println(tempList[index].distance)
            }

            println()
        }
    }
}
