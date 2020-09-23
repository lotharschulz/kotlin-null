package kotlinnull

import kotlinnull.TestConsts.fourInt
import kotlinnull.TestConsts.fourtytwoInt
import kotlin.test.Test
import kotlinnull.TestConsts.fourtytwoString
import kotlin.test.assertEquals
import kotlinnull.TestConsts.someString
import kotlinnull.TestConsts.oneQuarter
import kotlinnull.TestConsts.zeroInt

class SealedStyleTest {
    @Test
    fun testParse(){
        assertEquals(SealedStyle.parse(fourtytwoString), Result.IntResult(fourtytwoInt), "parsing 42 shall return a valid result.")
        assertEquals(SealedStyle.parse(someString), Result.Exception("$someString is not a valid integer."), "$someString can't be parsed.")
    }

    @Test
    fun testReciprocal(){
        assertEquals(SealedStyle.reciprocal(fourInt), Result.DoubleResult(oneQuarter), "one fourth expected.")
        assertEquals(SealedStyle.reciprocal(zeroInt), Result.Exception("Cannot take reciprocal of 0."), "reciprocal of 0 must cause an exception.")
    }
}