package kotlinnull

import arrow.core.Either

object EitherStyle {
    fun parse(s: String): Either<NumberFormatException, Int> =
            if (s.matches(Regex("-?[0-9]+"))) Either.Right(s.toInt())
            else Either.Left(NumberFormatException("$s is not a valid integer."))

    fun reciprocal(i: Int): Either<IllegalArgumentException, Double> =
            if (i == 0) Either.Left(IllegalArgumentException("Can not take reciprocal of 0."))
            else Either.Right(1.0 / i)
}