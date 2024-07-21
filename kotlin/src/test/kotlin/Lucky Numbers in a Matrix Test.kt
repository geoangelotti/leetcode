import o.mg.luckyNumbers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Lucky Numbers in a Matrix Test` {
    @ParameterizedTest
    @MethodSource("provideTestCase")
    fun testLuckyNumbers(matrix: Array<IntArray>, expected: List<Int>) {
        val result = luckyNumbers(matrix)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCase(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(intArrayOf(3, 7, 8), intArrayOf(9, 11, 13), intArrayOf(15, 16, 17)), listOf(15)),
                Arguments.of(
                    arrayOf(intArrayOf(1, 10, 4, 2), intArrayOf(9, 3, 8, 7), intArrayOf(15, 16, 17, 12)),
                    listOf(12)
                ),
                Arguments.of(arrayOf(intArrayOf(7, 8), intArrayOf(1, 2)), listOf(7)),

                )
        }
    }
}