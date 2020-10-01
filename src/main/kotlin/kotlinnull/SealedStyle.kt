package kotlinnull

sealed class ParseResult {
    data class IntResult(val value: Int): ParseResult()
    data class Exception(val error: String): ParseResult()
}

sealed class ReciprocalResult {
    data class DoubleResult(val value: Double): ReciprocalResult()
    data class Exception(val error: String): ReciprocalResult()
}

object SealedStyle {
    fun parse(s: String): ParseResult =
            if (s.matches(Regex("-?[0-9]+"))) ParseResult.IntResult(s.toInt())
            else ParseResult.Exception(NumberFormatException("$s is not a valid integer.").message.toString())

    fun reciprocal(i: Int): ReciprocalResult =
            if (i == 0) ReciprocalResult.Exception(IllegalArgumentException("Can not take reciprocal of 0.").message.toString())
            else ReciprocalResult.DoubleResult(1.0 / i)

}