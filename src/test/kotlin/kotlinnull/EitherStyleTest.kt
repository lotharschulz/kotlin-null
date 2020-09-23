package kotlinnull

import arrow.core.None
import arrow.core.Some
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlinnull.TestConsts.fourInt
import kotlinnull.TestConsts.fourtytwoInt
import kotlinnull.TestConsts.fourtytwoString
import kotlinnull.TestConsts.oneQuarter
import kotlinnull.TestConsts.someString
import kotlinnull.TestConsts.zeroInt

class EitherStyleTest {
    @Test
    fun testParseWithOption() {
        assertTrue(OptionStyle.parse(fourtytwoString).isDefined(), "some expected for number input")
        assertEquals(OptionStyle.parse(fourtytwoString), Some(fourtytwoInt), "some expected for number input")
        assertTrue(OptionStyle.parse(someString).isEmpty(), "none expected for not valid integer input")
        assertEquals(OptionStyle.parse(someString), None, "none expected for not valid integer input")
    }

    @Test
    fun testReciprocalWithOption() {
        assertTrue(OptionStyle.reciprocal(fourInt).isDefined(), "some expected for number input greater than zero")
        assertEquals(OptionStyle.reciprocal(fourInt), Some(oneQuarter), "some expected for number input greater than zero")
        assertTrue(OptionStyle.reciprocal(zeroInt).isEmpty(), "none expected for not valid integer input")
        assertEquals(OptionStyle.reciprocal(zeroInt), None, "none expected for not valid integer input")
    }
}