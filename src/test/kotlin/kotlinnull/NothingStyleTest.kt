package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull

class NothingStyleTest {
    @Test(expected = IllegalArgumentException::class)
    fun testParse(){
        NothingStyle.parse()
    }

    @Test(expected = IllegalArgumentException::class)
    fun testReciprocal(){
        NothingStyle.reciprocal()
    }
}