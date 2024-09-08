import o.mg.countOfAtoms
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Number of Atoms Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testCountOfAtoms(formula: String, expected: String) {
        val result = countOfAtoms(formula)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("H2O", "H2O"),
                Arguments.of("Mg(OH)2", "H2MgO2"),
                Arguments.of("K4(ON(SO3)2)2", "K4N2O14S4"),
            )
        }
    }
}