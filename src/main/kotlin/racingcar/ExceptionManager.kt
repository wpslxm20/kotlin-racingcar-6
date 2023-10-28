package racingcar

object ExceptionManager {
    const val MAX_CARS_STRING_NUMBER = 5

    fun carException(carString: List<String>) {
        carString.map {
            if (it.length > MAX_CARS_STRING_NUMBER || it.isEmpty()) {
                throw IllegalArgumentException()
            }
        }
    }
}