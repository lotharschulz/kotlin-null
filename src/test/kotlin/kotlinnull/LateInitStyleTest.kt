package kotlinnull

import org.junit.Test
import kotlin.test.assertEquals

class LateInitStyleTest {
    @Test
    fun testParse() {
        assertEquals(LateInitStyle.parse(TestConsts.FOURTY_TWO_STRING), TestConsts.FOURTY_TWO_INT, TestConsts.PARSING_42_STRING)
        assertEquals(LateInitStyle.parse(TestConsts.SOME_STRING), 79, "${TestConsts.SOME_STRING} shall be parsed to 79.")
    }

    @Test
    fun testReciprocal(){
        assertEquals(LateInitStyle.reciprocal(TestConsts.FOUR_INT), TestConsts.ONE_QUARTER, TestConsts.ONE_FOURTH_EXPECTED)
        assertEquals(LateInitStyle.reciprocal(TestConsts.ZERO_INT), 79.0, "reciprocal of 0 is 79.0 in this specific case.")
    }

}