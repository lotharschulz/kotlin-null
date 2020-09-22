package kotlinnull

import arrow.core.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import io.kotlintest.assertions.arrow.either.shouldBeRight
import io.kotlintest.assertions.arrow.either.shouldBeLeft

class AppTest {
    private val someString = "dfasdfs"
    private val fourtytwoString = "42"
    private val fourtytwoInt = 42
    private val fourInt = 4
    private val zeroInt = 0
    private val oneQuarter = 0.25
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

    @Test
    fun testReciprocalWithException() {
        assert(ExceptionStyle.reciprocalWithException(fourInt) == oneQuarter) {"one fourth expected"}
    }
    @Test(expected = IllegalArgumentException::class)
    fun testReciprocalException() {
        assert(ExceptionStyle.reciprocalWithException(zeroInt) != oneQuarter) {"one fourth expected"}
    }

    @Test
    fun testParseWithException() {
        assert(ExceptionStyle.parseWithException(fourtytwoString) == fourtytwoInt) {"42 expected"}
    }
    @Test(expected = IllegalArgumentException::class)
    fun testParseException() {
        assert(ExceptionStyle.parseWithException(someString) != fourtytwoInt) {"some string expected"}
    }

    @Test
    fun testParseWithEither() {
        assertTrue(EitherStyle.parseWithEither(fourtytwoString).isRight(), "parsing 42 shall return a valid/right result")
        EitherStyle.parseWithEither(fourtytwoString).right().shouldBeRight(Right(fourtytwoInt))
        assertTrue(EitherStyle.parseWithEither(someString).isLeft(), "parsing characters shall return an invalid/left result")
        EitherStyle.parseWithEither(someString).left().shouldBeLeft()
    }

    @Test
    fun testReciprocalWithEither() {
        assertTrue(EitherStyle.reciprocalWithEither(fourInt).isRight(), "one fourth expected of either expected")
        // https://stackoverflow.com/a/54667128
        // consider ShouldSpec as in https://github.com/BTheunissen/toy-robot-kotlin/blob/master/src/test/kotlin/robot/DirectionSpec.kt @ 2020 09 21
        EitherStyle.reciprocalWithEither(fourInt).right().shouldBeRight(Right(oneQuarter))
        assertTrue(EitherStyle.reciprocalWithEither(zeroInt).isLeft(), "Either left expected for reciprocal of zero")
        EitherStyle.reciprocalWithEither(zeroInt).left().shouldBeLeft()
    }

}
