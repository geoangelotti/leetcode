import o.mg.isHappy
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Happy Number Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testIsHappy(n: Int, expected: Boolean) {
        val result = isHappy(n)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(19, true),
                Arguments.of(2, false),
            )
        }
    }
}