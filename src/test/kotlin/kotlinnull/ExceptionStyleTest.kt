package kotlinnull

import kotlin.test.Test
import kotlinnull.TestConsts.fourInt
import kotlinnull.TestConsts.fourtytwoInt
import kotlinnull.TestConsts.fourtytwoString
import kotlinnull.TestConsts.oneQuarter
import kotlinnull.TestConsts.someString
import kotlinnull.TestConsts.zeroInt

class ExceptionStyleTest {
    @Test
    fun testReciprocalWithException() {
        assert(ExceptionStyle.reciprocal(fourInt) == oneQuarter) {"one fourth expected"}
    }
    @Test(expected = IllegalArgumentException::class)
    fun testReciprocalException() {
        assert(ExceptionStyle.reciprocal(zeroInt) != oneQuarter) {"exception expected"}
    }

    @Test
    fun testParseWithException() {
        assert(ExceptionStyle.parse(fourtytwoString) == fourtytwoInt) {"42 expected"}
    }
    @Test(expected = IllegalArgumentException::class)
    fun testParseException() {
        assert(ExceptionStyle.parse(someString) != fourtytwoInt) {"exception expected"}
    }
}