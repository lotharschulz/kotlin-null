package kotlinnull

import org.junit.Test
import kotlin.test.assertEquals

class NullableAnnotationStyleTest {
    @Test
    fun testParse() {
        assertEquals(NullableAnnotationStyle.parse(TestConsts.FOURTY_TWO_STRING), TestConsts.FOURTY_TWO_INT, TestConsts.PARSING_42_STRING)
        assertEquals(NullableAnnotationStyle.parse(TestConsts.SOME_STRING), null, TestConsts.SOME_STRING_CANT_BE_PARSED)
    }

    @Test
    fun testReciprocal(){
        assertEquals(NullableAnnotationStyle.reciprocal(TestConsts.FOUR_INT), TestConsts.ONE_QUARTER, TestConsts.ONE_FOURTH_EXPECTED)
        assertEquals(NullableAnnotationStyle.reciprocal(TestConsts.ZERO_INT), null, TestConsts.RECIPROCAL_ZERO)
    }
}