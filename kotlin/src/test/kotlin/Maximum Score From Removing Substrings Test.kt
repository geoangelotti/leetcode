import o.mg.maximumGain
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Maximum Score From Removing Substrings Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMaximumGain(s: String, x: Int, y: Int, expected: Int) {
        val result = maximumGain(s, x, y)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("cdbcbbaaabab", 4, 5, 19),
                Arguments.of("aabbaaxybbaabb", 5, 4, 20),
            )
        }
    }
}