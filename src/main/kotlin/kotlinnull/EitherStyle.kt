package kotlinnull

import arrow.core.Either
import arrow.core.None
import arrow.core.Some

object EitherStyle {
    fun parse(s: String): Either<NumberFormatException, Int> =
        when(s.matches(Regex("-?[0-9]+"))){
            true -> Either.Right(s.toInt())
            false -> Either.Left(NumberFormatException("$s is not a valid integer."))
        }

    fun reciprocal(i: Int): Either<IllegalArgumentException, Double> =
        when(i == 0){
            true -> Either.Left(IllegalArgumentException("Can not take reciprocal of 0."))
            false -> Either.Right(1.0 / i)
        }
}