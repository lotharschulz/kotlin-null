package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals

class UnitStyleTest {
    @Test
    fun testParseToUnitAlways(){
        assertEquals(UnitStyle.parse(), Unit)
    }

    val printNumber = { x: Number -> println("Number: $x") }
    @Test
    fun testCallFunction(){
        assertEquals(UnitStyle.callFunction(printNumber), Unit)
    }
    @Test
    fun testReciprocalToUnitAlways(){
        assertEquals(UnitStyle.reciprocal(), Unit)
    }

}