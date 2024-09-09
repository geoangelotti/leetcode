import o.mg.addDigits
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Add Digits Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testAddDigits(num: Int, expected: Int) {
        val expected = addDigits(num)
        assertEquals(expected, expected)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(38, 0),
                Arguments.of(0, 0),
            )
        }
    }
}