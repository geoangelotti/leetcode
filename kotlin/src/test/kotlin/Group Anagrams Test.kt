import o.mg.groupAnagrams
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Group Anagrams Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testGroupAnagrams(input: Array<String>, expected: List<List<String>>) {
        val result = groupAnagrams(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    arrayOf("eat", "tea", "tan", "ate", "nat", "bat"),
                    listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat"))
                ),
                Arguments.of(
                    arrayOf(""),
                    listOf(listOf(""))
                ),
                Arguments.of(
                    arrayOf("a"),
                    listOf(listOf("a"))
                ),
            )
        }
    }
}