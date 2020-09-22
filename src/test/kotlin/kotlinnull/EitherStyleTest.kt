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
        assertTrue(OptionStyle.parseWithOption(fourtytwoString).isDefined(), "some expected for number input")
        assertEquals(OptionStyle.parseWithOption(fourtytwoString), Some(fourtytwoInt), "some expected for number input")
        assertTrue(OptionStyle.parseWithOption(someString).isEmpty(), "none expected for not valid integer input")
        assertEquals(OptionStyle.parseWithOption(someString), None, "none expected for not valid integer input")
    }

    @Test
    fun testReciprocalWithOption() {
        assertTrue(OptionStyle.reciprocalWithOption(fourInt).isDefined(), "some expected for number input greater than zero")
        assertEquals(OptionStyle.reciprocalWithOption(fourInt), Some(oneQuarter), "some expected for number input greater than zero")
        assertTrue(OptionStyle.reciprocalWithOption(zeroInt).isEmpty(), "none expected for not valid integer input")
        assertEquals(OptionStyle.reciprocalWithOption(zeroInt), None, "none expected for not valid integer input")
    }
}