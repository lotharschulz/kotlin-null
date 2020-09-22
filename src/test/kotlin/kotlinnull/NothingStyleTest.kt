package kotlinnull

import kotlin.test.Test
import kotlin.test.assertNull

class NothingStyleTest {
    @Test
    fun testParseToNothingAlways(){
        assertNull(NothingStyle.parseToNothingAlways())
    }
    @Test
    fun testReciprocalToNothingAlways(){
        assertNull(NothingStyle.reciprocalToNothingAlways())
    }
}