import o.mg.isPerfectSquare
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Valid Perfect Square Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testIsPerfectSquare(num: Int, expected: Boolean) {
        val result = isPerfectSquare(num)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(16, true),
                Arguments.of(14, false),
            )
        }
    }
}