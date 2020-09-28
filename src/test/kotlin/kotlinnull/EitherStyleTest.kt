package kotlinnull

import arrow.core.Right
import arrow.core.left
import arrow.core.right
import kotlin.test.Test
import kotlin.test.assertTrue
import io.kotlintest.assertions.arrow.either.shouldBeRight
import io.kotlintest.assertions.arrow.either.shouldBeLeft
import kotlinnull.TestConsts.FOUR_INT
import kotlinnull.TestConsts.FOURTY_TWO_INT
import kotlinnull.TestConsts.FOURTY_TWO_STRING
import kotlinnull.TestConsts.LEFT_EXPECTED
import kotlinnull.TestConsts.ONE_QUARTER
import kotlinnull.TestConsts.PARSING_42_STRING
import kotlinnull.TestConsts.RIGHT_EXPECTED_NUMBER
import kotlinnull.TestConsts.SOME_STRING
import kotlinnull.TestConsts.SOME_STRING_CANT_BE_PARSED
import kotlinnull.TestConsts.ZERO_INT

class EitherStyleTest {
    @Test
    fun testParseWithEither() {
        assertTrue(EitherStyle.parse(FOURTY_TWO_STRING).isRight(), PARSING_42_STRING)
        EitherStyle.parse(FOURTY_TWO_STRING).right().shouldBeRight(Right(FOURTY_TWO_INT))
        assertTrue(EitherStyle.parse(SOME_STRING).isLeft(), SOME_STRING_CANT_BE_PARSED)
        EitherStyle.parse(SOME_STRING).left().shouldBeLeft()
    }

    @Test
    fun testReciprocalWithEither() {
        assertTrue(EitherStyle.reciprocal(FOUR_INT).isRight(), RIGHT_EXPECTED_NUMBER)
        // https://stackoverflow.com/a/54667128
        // consider ShouldSpec as in https://github.com/BTheunissen/toy-robot-kotlin/blob/master/src/test/kotlin/robot/DirectionSpec.kt @ 2020 09 21
        EitherStyle.reciprocal(FOUR_INT).right().shouldBeRight(Right(ONE_QUARTER))
        assertTrue(EitherStyle.reciprocal(ZERO_INT).isLeft(), LEFT_EXPECTED)
        EitherStyle.reciprocal(ZERO_INT).left().shouldBeLeft()
    }
}