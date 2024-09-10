import o.mg.lengthOfLastWord
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Length of Last Word Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testLengthOfLastWord(s: String, expected: Int) {
        val result = lengthOfLastWord(s)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6),
            )
        }
    }
}