package kotlinnull

import arrow.core.Either
import arrow.core.None
import arrow.core.Option
import arrow.core.Some

class App {
    // Option style
    fun parseWithOption(s: String): Option<Int> =
        if (s.matches(Regex("-?[0-9]+"))) Some(s.toInt())
        else None

    fun reciprocalWithOption(i: Int): Option<Double> =
        if (i == 0) None
        else Some(1.0 / i)

    // Exception style
    fun reciprocalWithException(i: Int): Double =
        if (i == 0) throw IllegalArgumentException("Cannot take reciprocal of 0.")
        else 1.0 / i

    // Either Style
    fun parseWithEither(s: String): Either<NumberFormatException, Int> =
            if (s.matches(Regex("-?[0-9]+"))) Either.Right(s.toInt())
            else Either.Left(NumberFormatException("$s is not a valid integer."))

    fun reciprocalWithEither(i: Int): Either<IllegalArgumentException, Double> =
            if (i == 0) Either.Left(IllegalArgumentException("Cannot take reciprocal of 0."))
            else Either.Right(1.0 / i)



}

fun main() {
    println(App().parseWithOption("42"))
}



/*
// Either Style
fun parse(s: String): Either<NumberFormatException, Int> =
        if (s.matches(Regex("-?[0-9]+"))) Either.Right(s.toInt())
        else Either.Left(NumberFormatException("$s is not a valid integer."))

fun reciprocal(i: Int): Either<IllegalArgumentException, Double> =
        if (i == 0) Either.Left(IllegalArgumentException("Cannot take reciprocal of 0."))
        else Either.Right(1.0 / i)
        
 */