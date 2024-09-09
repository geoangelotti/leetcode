import o.mg.rob
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `House Robber Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testRob(nums: IntArray, expected: Int) {
        val result = rob(nums)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1,2,3,1), 4),
                Arguments.of(intArrayOf(2,7,9,3,1), 12),
            )
        }
    }
}