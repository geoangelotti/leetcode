import o.mg.findTheWinner
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Find the Winner of the Circular Game Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testFindTheWinner(n: Int, k: Int, expected: Int) {
        val result = findTheWinner(n, k)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(5, 2, 3),
                Arguments.of(6, 5, 1),
            )
        }
    }
}