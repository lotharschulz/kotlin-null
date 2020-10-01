package kotlinnull

import kotlinnull.TestConsts.EXCEPTION_EXPECTED
import kotlin.test.Test
import kotlinnull.TestConsts.FOUR_INT
import kotlinnull.TestConsts.FOURTY_TWO_INT
import kotlinnull.TestConsts.FOURTY_TWO_STRING
import kotlinnull.TestConsts.ONE_FOURTH_EXPECTED
import kotlinnull.TestConsts.ONE_QUARTER
import kotlinnull.TestConsts.PARSING_42_STRING
import kotlinnull.TestConsts.SOME_STRING
import kotlinnull.TestConsts.ZERO_INT

class ExceptionStyleTest {
    @Test
    fun testParseWithException() {
        assert(ExceptionStyle.parse(FOURTY_TWO_STRING) == FOURTY_TWO_INT) {PARSING_42_STRING}
    }
    @Test(expected = IllegalArgumentException::class)
    fun testParseException() {
        ExceptionStyle.parse(SOME_STRING)
    }

    @Test
    fun testReciprocalWithException() {
        assert(ExceptionStyle.reciprocal(FOUR_INT) == ONE_QUARTER) {ONE_FOURTH_EXPECTED}
    }
    @Test(expected = IllegalArgumentException::class)
    fun testReciprocalException() {
        ExceptionStyle.reciprocal(ZERO_INT)
    }
}