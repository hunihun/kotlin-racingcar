package racingcar

object Verify {
    fun isIntType(input: String): Boolean {
        return try {
            input.toInt()
            true
        } catch (exception: IllegalArgumentException) {
            false
        }
    }
}
