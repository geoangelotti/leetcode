import o.mg.addBinary
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Add Binary Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testAddBinary(a: String, b: String, expected: String) {
        val result = addBinary(a, b)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("11", "1", "110"),
                Arguments.of("1010", "1011", "10101"),
            )
        }
    }
}