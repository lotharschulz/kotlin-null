package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class NothingStyleTest {
    @Test
    fun testParseToNothingAlways(){
        assertNull(NothingStyle.parseToNothingAlways())
        assertEquals(NothingStyle.parseToNothingAlways(), null)
    }
    @Test
    fun testReciprocalToNothingAlways(){
        assertNull(NothingStyle.reciprocalToNothingAlways())
        assertEquals(NothingStyle.reciprocalToNothingAlways(), null)
    }
}