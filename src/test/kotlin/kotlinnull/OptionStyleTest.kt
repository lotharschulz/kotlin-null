package kotlinnull

import arrow.core.None
import arrow.core.Some
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlinnull.TestConsts.FOUR_INT
import kotlinnull.TestConsts.FOURTY_TWO_INT
import kotlinnull.TestConsts.FOURTY_TWO_STRING
import kotlinnull.TestConsts.NONE_EXPECTED
import kotlinnull.TestConsts.ONE_QUARTER
import kotlinnull.TestConsts.SOME_EXPECTED_NUMBER
import kotlinnull.TestConsts.SOME_EXPECTED_GREATER_ZERO
import kotlinnull.TestConsts.SOME_STRING
import kotlinnull.TestConsts.ZERO_INT

class OptionStyleTest {
    @Test
    fun testParseWithOption() {
        assertTrue(OptionStyle.parse(FOURTY_TWO_STRING).isDefined(), SOME_EXPECTED_NUMBER)
        assertEquals(OptionStyle.parse(FOURTY_TWO_STRING), Some(FOURTY_TWO_INT), SOME_EXPECTED_NUMBER)
        assertTrue(OptionStyle.parse(SOME_STRING).isEmpty(), NONE_EXPECTED)
        assertEquals(OptionStyle.parse(SOME_STRING), None, NONE_EXPECTED)
    }

    @Test
    fun testReciprocalWithOption() {
        assertTrue(OptionStyle.reciprocal(FOUR_INT).isDefined(), SOME_EXPECTED_GREATER_ZERO)
        assertEquals(OptionStyle.reciprocal(FOUR_INT), Some(ONE_QUARTER), SOME_EXPECTED_GREATER_ZERO)
        assertTrue(OptionStyle.reciprocal(ZERO_INT).isEmpty(), NONE_EXPECTED)
        assertEquals(OptionStyle.reciprocal(ZERO_INT), None, NONE_EXPECTED)
    }
}