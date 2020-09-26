package kotlinnull

import kotlinnull.TestConsts.PARSING_42_STRING
import kotlinnull.TestConsts.SOME_STRING_CANT_BE_PARSED
import kotlinnull.TestConsts.FOUR_INT
import kotlinnull.TestConsts.FOURTY_TWO_INT
import kotlin.test.Test
import kotlinnull.TestConsts.FOURTY_TWO_STRING
import kotlinnull.TestConsts.ONE_FOURTH_EXPECTED
import kotlin.test.assertEquals
import kotlinnull.TestConsts.SOME_STRING
import kotlinnull.TestConsts.ONE_QUARTER
import kotlinnull.TestConsts.RECIPROCAL_ZERO
import kotlinnull.TestConsts.ZERO_INT

class NullableStyleTest {
    @Test
    fun testParse() {
        assertEquals(NullableStyle.parse(FOURTY_TWO_STRING), FOURTY_TWO_INT, PARSING_42_STRING)
        assertEquals(NullableStyle.parse(SOME_STRING), null, SOME_STRING_CANT_BE_PARSED)
    }

    @Test
    fun testReciprocal(){
        assertEquals(NullableStyle.reciprocal(FOUR_INT), ONE_QUARTER, ONE_FOURTH_EXPECTED)
        assertEquals(NullableStyle.reciprocal(ZERO_INT), null, RECIPROCAL_ZERO)
    }
}