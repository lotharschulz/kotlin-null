package kotlinnull

import kotlinnull.TestConsts.FOUR_INT
import kotlinnull.TestConsts.FOURTY_TWO_INT
import kotlin.test.Test
import kotlinnull.TestConsts.FOURTY_TWO_STRING
import kotlinnull.TestConsts.ONE_FOURTH_EXPECTED
import kotlin.test.assertEquals
import kotlinnull.TestConsts.SOME_STRING
import kotlinnull.TestConsts.ONE_QUARTER
import kotlinnull.TestConsts.PARSING_42_STRING
import kotlinnull.TestConsts.RECIPROCAL_ZERO
import kotlinnull.TestConsts.SOME_STRING_CANT_BE_PARSED
import kotlinnull.TestConsts.ZERO_INT

class AnyStyleTest {
    @Test
    fun testParse(){
        assertEquals(AnyStyle.parse(FOURTY_TWO_STRING), FOURTY_TWO_INT, PARSING_42_STRING)
        assertEquals(AnyStyle.parse(SOME_STRING).toString(), NumberFormatException("$SOME_STRING is not a valid integer.").toString(), SOME_STRING_CANT_BE_PARSED)
    }

    @Test
    fun testReciprocal(){
        assertEquals(AnyStyle.reciprocal(FOUR_INT), ONE_QUARTER, ONE_FOURTH_EXPECTED)
        assertEquals(AnyStyle.reciprocal(ZERO_INT).toString(), IllegalArgumentException("Can not take reciprocal of 0.").toString(), RECIPROCAL_ZERO)
    }

}