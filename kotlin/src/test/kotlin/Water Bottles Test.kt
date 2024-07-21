import o.mg.numWaterBottles
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Water Bottles Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testNumWaterBottles(numBottles: Int, numExchange: Int, expected: Int) {
        val result =numWaterBottles(numBottles, numExchange)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(9, 3, 13),
                Arguments.of(15, 4, 19),
            )
        }
    }
}