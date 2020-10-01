package kotlinnull

import kotlin.test.Test
import kotlin.test.assertEquals

class UnitStyleTest {
    @Test
    fun testParse(){
        assertEquals(UnitStyle.parse(), Unit)
    }

    private val printNumber = { x: Number -> println("UnitStyleTest: 'printNumber' side effect -> Number: $x") }
    @Test
    fun testCallFunction(){
        assertEquals(UnitStyle.callFunction(printNumber), Unit)
    }
    @Test
    fun testReciprocal(){
        assertEquals(UnitStyle.reciprocal(), Unit)
    }

}