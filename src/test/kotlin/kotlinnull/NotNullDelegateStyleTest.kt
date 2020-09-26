package kotlinnull

import kotlinnull.TestConsts.SOME_STRING
import org.junit.Test
import kotlin.test.assertEquals

class NotNullDelegateStyleTest {
    @Test
    fun testParse() {
        assertEquals(NotNullDelegateStyle.parse(TestConsts.FOURTY_TWO_STRING), TestConsts.FOURTY_TWO_INT, TestConsts.PARSING_42_STRING)
        assertEquals(NotNullDelegateStyle.parse(TestConsts.SOME_STRING), 79, "${SOME_STRING} shall be parsed to 79.")
    }

    @Test
    fun testReciprocal(){
        assertEquals(NotNullDelegateStyle.reciprocal(TestConsts.FOUR_INT), TestConsts.ONE_QUARTER, TestConsts.ONE_FOURTH_EXPECTED)
        assertEquals(NotNullDelegateStyle.reciprocal(TestConsts.ZERO_INT), 79.0, "reciprocal of 0 is 79.0 in this specific case.")
    }
}