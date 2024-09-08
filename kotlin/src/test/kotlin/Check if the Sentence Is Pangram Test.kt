import o.mg.checkIfPangram
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Check if the Sentence Is Pangram Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testCheckIfPangram(sentence: String, expected: Boolean) {
        val result = checkIfPangram(sentence)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("thequickbrownfoxjumpsoverthelazydog", true),
                Arguments.of("leetcode", false),
            )
        }
    }
}