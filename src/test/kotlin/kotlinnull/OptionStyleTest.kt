package kotlinnull

import arrow.core.Right
import arrow.core.left
import arrow.core.right
import kotlin.test.Test
import kotlin.test.assertTrue
import io.kotlintest.assertions.arrow.either.shouldBeRight
import io.kotlintest.assertions.arrow.either.shouldBeLeft
import kotlinnull.TestConsts.fourInt
import kotlinnull.TestConsts.fourtytwoInt
import kotlinnull.TestConsts.fourtytwoString
import kotlinnull.TestConsts.oneQuarter
import kotlinnull.TestConsts.someString
import kotlinnull.TestConsts.zeroInt

class OptionStyleTest {
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