import o.mg.minOperations
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class `Crawler Log Folder Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMinOperations(logs: Array<String>, expected: Int) {
        val result = minOperations(logs)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf("d1/", "d2/", "../", "d21/", "./"), 2),
                Arguments.of(arrayOf("d1/", "d2/", "./", "d3/", "../", "d31/"), 3),
                Arguments.of(arrayOf("d1/", "../", "../", "../"), 0),
            )
        }
    }
}