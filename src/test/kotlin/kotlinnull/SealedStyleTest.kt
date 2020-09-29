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
import kotlin.test.fail

class SealedStyleTest {
    @Test
    fun testParse(){
        assertEquals(SealedStyle.parse(FOURTY_TWO_STRING), ParseResult.IntResult(FOURTY_TWO_INT), PARSING_42_STRING)
        assertEquals(SealedStyle.parse(SOME_STRING), ParseResult.Exception("$SOME_STRING is not a valid integer."), SOME_STRING_CANT_BE_PARSED)

        when(val r = SealedStyle.parse(FOURTY_TWO_STRING)) {
            is ParseResult.IntResult -> assertEquals(r.value, FOURTY_TWO_INT)
            is ParseResult.Exception -> fail(r.error)
        }
    }

    @Test
    fun testReciprocal(){
        assertEquals(SealedStyle.reciprocal(FOUR_INT), ReciprocalResult.DoubleResult(ONE_QUARTER), ONE_FOURTH_EXPECTED)
        assertEquals(SealedStyle.reciprocal(ZERO_INT), ReciprocalResult.Exception("Cannot take reciprocal of 0."), RECIPROCAL_ZERO)
    }
}