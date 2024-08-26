import o.mg.fractionAddition
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Fraction Addition and Subtraction Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testFractionAddition(expression: String, expected: String) {
        val result = fractionAddition(expression)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("-1/2+1/2", "0/1"),
                Arguments.of("-1/2+1/2+1/3", "1/3"),
                Arguments.of("1/3-1/2", "-1/6"),
            )
        }
    }
}