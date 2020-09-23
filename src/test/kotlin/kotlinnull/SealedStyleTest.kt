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
        assertEquals(SealedStyle.parseWithSealed(fourtytwoString), Result.IntResult(fourtytwoInt), "parsing 42 shall return a valid/right result.")
        assertEquals(SealedStyle.parseWithSealed(someString), Result.Exception("$someString is not a valid integer."), "$someString can't be parsed.")
    }

    @Test
    fun testReciprocal(){
        assertEquals(SealedStyle.reciprocalWithEither(fourInt), Result.DoubleResult(oneQuarter), "one fourth expected of either expected.")
        assertEquals(SealedStyle.reciprocalWithEither(zeroInt), Result.Exception("Cannot take reciprocal of 0."), "Reciprocal of 0 must cause an exception.")
    }
}