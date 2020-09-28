package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull

class NothingStyleTest {
    @Test
    fun testParse(){
        assertNull(NothingStyle.parse())
        assertEquals(NothingStyle.parse(), null)
    }
    @Test(expected = IllegalArgumentException::class)
    fun testReciprocal(){
        NothingStyle.reciprocal()
        assertEquals(NothingStyle.reciprocal(), Unit)
    }
}