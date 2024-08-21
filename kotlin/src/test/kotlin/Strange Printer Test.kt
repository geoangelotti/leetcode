import o.mg.strangePrinter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Strange Printer Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testStrangePrinter(s: String, expected: Int) {
        val result = strangePrinter(s)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("aaabbb", 2),
                Arguments.of("aba=", 2),
            )
        }
    }
}