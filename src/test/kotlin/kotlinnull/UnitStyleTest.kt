package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class UnitStyleTest {
    @Test
    fun testParseToUnitAlways(){
        assertEquals(UnitStyle.parseToUnitAlways(), Unit)
    }
    @Test
    fun testReciprocalToUnitAlways(){
        assertEquals(UnitStyle.reciprocalToUnitAlways(), Unit)
    }

}