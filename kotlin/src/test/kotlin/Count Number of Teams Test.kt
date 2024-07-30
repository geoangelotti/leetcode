import o.mg.numTeams
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Count Number of Teams Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testNumTeams(rating: IntArray, expected: Int) {
        val result = numTeams(rating)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(2, 5, 3, 4, 1), 3),
                Arguments.of(intArrayOf(2, 1, 3), 0),
                Arguments.of(intArrayOf(1, 2, 3, 4), 4),
            )
        }
    }
}