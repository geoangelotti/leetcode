import o.mg.checkRecord
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class `Student Attendance Record I Test` {

    @Test
    fun case1() {
        val result = checkRecord("PPALLP")
        assertTrue { result }
    }

    @Test
    fun case2() {
        val result = checkRecord("PPALLL")
        assertFalse { result }
    }
}