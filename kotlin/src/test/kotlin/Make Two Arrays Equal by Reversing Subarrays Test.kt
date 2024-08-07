import o.mg.canBeEqual
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Make Two Arrays Equal by Reversing Subarrays Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testCanBeEqual(target: IntArray, arr: IntArray, expected: Boolean) {
        val result = canBeEqual(target, arr)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 2, 3, 4), intArrayOf(2, 4, 1, 3), true),
                Arguments.of(intArrayOf(7), intArrayOf(7), true),
                Arguments.of(intArrayOf(3, 7, 9), intArrayOf(3, 7, 11), false),
            )
        }
    }
}