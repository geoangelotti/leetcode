import o.mg.minimumDeletions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Minimum Deletions to Make String Balanced Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMinimumDeletions(s: String, expected: Int) {
        val result = minimumDeletions(s)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("aababbab", 2),
                Arguments.of("bbaaaaabb", 2),
            )
        }
    }
}