package racingcar

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class InputTest {
    @ParameterizedTest
    @ValueSource(strings = ["", " ", "한글", "english", "!", "12#$"])
    fun `입력값이 숫자가 아닌 경우`(input: String) {
        assertFalse(Verify.isIntType(input))
    }
}
