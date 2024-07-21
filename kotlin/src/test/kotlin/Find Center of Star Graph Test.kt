import o.mg.findCenter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Find Center of Star Graph Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMergeTwoLists(input: Array<IntArray>, expected: Int) {
        val result = findCenter(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 2)), 2),
                Arguments.of(arrayOf(intArrayOf(1, 2), intArrayOf(5, 1), intArrayOf(1, 3), intArrayOf(1, 4)), 1),
            )
        }
    }
}