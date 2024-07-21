import o.mg.reverseParentheses
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Reverse Substrings Between Each Pair of Parentheses Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testReverseParentheses(s: String, expected: String) {
        val result = reverseParentheses(s)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("(abcd)", "dcba"),
                Arguments.of("(u(love)i)", "iloveu"),
                Arguments.of("(ed(et(oc))el)", "leetcode"),
            )
        }
    }
}