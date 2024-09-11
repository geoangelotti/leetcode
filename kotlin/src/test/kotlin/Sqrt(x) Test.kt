import o.mg.mySqrt
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Sqrt(x) Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMySqrt(x: Int, expected: Int) {
        val result = mySqrt(x)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(4, 2),
                Arguments.of(8, 2),
            )
        }
    }
}