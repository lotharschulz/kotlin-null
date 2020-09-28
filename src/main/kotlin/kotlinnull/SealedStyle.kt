package kotlinnull

sealed class Result {
    data class IntResult(val value: Int): Result()
    data class DoubleResult(val value: Double): Result()
    data class Exception(val error: String): Result()
}

object SealedStyle {
    fun parse(s: String): Result =
            if (s.matches(Regex("-?[0-9]+"))) Result.IntResult(s.toInt())
            else Result.Exception(NumberFormatException("$s is not a valid integer.").message.toString())

    fun reciprocal(i: Int): Result =
            if (i == 0) Result.Exception(IllegalArgumentException("Cannot take reciprocal of 0.").message.toString())
            else Result.DoubleResult(1.0 / i)

}