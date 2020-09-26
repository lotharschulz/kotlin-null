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

class SealedStyleTest {
    @Test
    fun testParse(){
        assertEquals(SealedStyle.parse(FOURTY_TWO_STRING), Result.IntResult(FOURTY_TWO_INT), PARSING_42_STRING)
        assertEquals(SealedStyle.parse(SOME_STRING), Result.Exception("$SOME_STRING is not a valid integer."), SOME_STRING_CANT_BE_PARSED)
    }

    @Test
    fun testReciprocal(){
        assertEquals(SealedStyle.reciprocal(FOUR_INT), Result.DoubleResult(ONE_QUARTER), ONE_FOURTH_EXPECTED)
        assertEquals(SealedStyle.reciprocal(ZERO_INT), Result.Exception("Cannot take reciprocal of 0."), RECIPROCAL_ZERO)
    }
}