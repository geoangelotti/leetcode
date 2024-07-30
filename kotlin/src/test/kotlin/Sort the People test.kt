import o.mg.sortPeople
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Sort the People test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testSortPeople(names: Array<String>, heights: IntArray, expected: Array<String>) {
        val result = sortPeople(names, heights)
        assertTrue(expected.contentEquals(result))
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    arrayOf("Mary", "John", "Emma"),
                    intArrayOf(180, 165, 170),
                    arrayOf("Mary", "Emma", "John")
                ),
                Arguments.of(
                    arrayOf("Alice", "Bob", "Bob"),
                    intArrayOf(155, 185, 150),
                    arrayOf("Bob", "Alice", "Bob")
                )
            )
        }
    }
}