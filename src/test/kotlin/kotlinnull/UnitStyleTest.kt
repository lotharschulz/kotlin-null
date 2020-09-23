package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals

class UnitStyleTest {
    @Test
    fun testParseToUnitAlways(){
        assertEquals(UnitStyle.parse(), Unit)
    }
    @Test
    fun testReciprocalToUnitAlways(){
        assertEquals(UnitStyle.reciprocal(), Unit)
    }

}