import o.mg.numberToWords
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Integer to English Words Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testNumberToWords(num: Int, expect: String) {
        val result = numberToWords(num)
        assertEquals(expect, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(123, "One Hundred Twenty Three"),
                Arguments.of(12345, "Twelve Thousand Three Hundred Forty Five"),
                Arguments.of(1234567, "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"),
            )
        }
    }
}