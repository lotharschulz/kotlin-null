package kotlinnull

import arrow.core.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import io.kotlintest.assertions.arrow.either.shouldBeRight
import io.kotlintest.assertions.arrow.either.shouldBeLeft

class AppTest {

    private val classUnderTest = App()
    private val someString = "dfasdfs"
    private val fourtytwoString = "42"

    @Test
    fun testParseWithOption() {
        assertTrue(classUnderTest.parseWithOption(fourtytwoString).isDefined(), "some expected for number input")
        assertEquals(classUnderTest.parseWithOption(fourtytwoString), Some(42), "some expected for number input")
        assertTrue(classUnderTest.parseWithOption(someString).isEmpty(), "none expected for not valid integer input")
        assertEquals(classUnderTest.parseWithOption(someString), None, "none expected for not valid integer input")
    }

    @Test
    fun testReciprocalWithOption() {
        assertTrue(classUnderTest.reciprocalWithOption(4).isDefined(), "some expected for number input greater than zero")
        assertEquals(classUnderTest.reciprocalWithOption(4), Some(0.25), "some expected for number input greater than zero")
        assertTrue(classUnderTest.reciprocalWithOption(0).isEmpty(), "none expected for not valid integer input")
        assertEquals(classUnderTest.reciprocalWithOption(0), None, "none expected for not valid integer input")
    }

    @Test
    fun testReciprocalWithException() {
        assert(classUnderTest.reciprocalWithException(4) == 0.25) {"one fourth expected"}
    }
    @Test(expected = IllegalArgumentException::class)
    fun testReciprocalException() {
        assert(classUnderTest.reciprocalWithException(0) != 0.0) {"one fourth expected"}
    }

    @Test
    fun testParseWithEither() {
        assertTrue(classUnderTest.parseWithEither(fourtytwoString).isRight(), "parsing 42 shall return a valid/right result")
        classUnderTest.parseWithEither(fourtytwoString).right().shouldBeRight(Right(42))
        assertTrue(classUnderTest.parseWithEither(someString).isLeft(), "parsing characters shall return an invalid/left result")
        classUnderTest.parseWithEither(someString).left().shouldBeLeft()
    }

    @Test
    fun testReciprocalWithEither() {
        assertTrue(classUnderTest.reciprocalWithEither(4).isRight(), "one fourth expected of either expected")
        // https://stackoverflow.com/a/54667128
        // consider ShouldSpec as in https://github.com/BTheunissen/toy-robot-kotlin/blob/master/src/test/kotlin/robot/DirectionSpec.kt @ 2020 09 21
        classUnderTest.reciprocalWithEither(4).right().shouldBeRight(Right(0.25))
        assertTrue(classUnderTest.reciprocalWithEither(0).isLeft(), "Either left expected for reciprocal of zero")
        classUnderTest.reciprocalWithEither(0).left().shouldBeLeft()
    }

}
