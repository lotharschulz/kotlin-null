package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class NothingStyleTest {
    @Test
    fun testParseToNothingAlways(){
        assertNull(NothingStyle.parse())
        assertEquals(NothingStyle.parse(), null)
    }
    @Test
    fun testReciprocalToNothingAlways(){
        assertNull(NothingStyle.reciprocal())
        assertEquals(NothingStyle.reciprocal(), null)
    }
}