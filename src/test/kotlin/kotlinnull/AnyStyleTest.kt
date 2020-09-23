package kotlinnull

import kotlinnull.TestConsts.fourInt
import kotlinnull.TestConsts.fourtytwoInt
import kotlin.test.Test
import kotlinnull.TestConsts.fourtytwoString
import kotlin.test.assertEquals
import kotlinnull.TestConsts.someString
import kotlinnull.TestConsts.oneQuarter
import kotlinnull.TestConsts.zeroInt

class AnyStyleTest {
    @Test
    fun testParse(){
        assertEquals(AnyStyle.parse(fourtytwoString), fourtytwoInt, "parsing 42 shall return a valid result.")
        assertEquals(AnyStyle.parse(someString).toString(), NumberFormatException("$someString is not a valid integer.").toString(), "$someString can't be parsed.")
    }

    @Test
    fun testReciprocal(){
        assertEquals(AnyStyle.reciprocal(fourInt), oneQuarter, "one fourth expected.")
        assertEquals(AnyStyle.reciprocal(zeroInt).toString(), IllegalArgumentException("Cannot take reciprocal of 0.").toString(), "Reciprocal of 0 must cause an exception.")
    }

}