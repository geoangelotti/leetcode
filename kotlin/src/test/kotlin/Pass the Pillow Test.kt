import o.mg.passThePillow
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Pass the Pillow Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testPassPillow(n: Int, time: Int, expected: Int) {
        val result = passThePillow(n, time)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(4, 5, 2),
                Arguments.of(3, 2, 3),
            )
        }
    }
}