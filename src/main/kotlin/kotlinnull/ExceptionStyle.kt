package kotlinnull

object ExceptionStyle {
    fun parseWithException(s: String): Int =
            if (s.matches(Regex("-?[0-9]+"))) s.toInt()
            else throw IllegalArgumentException("Cannot parse string of with characters.")

    fun reciprocalWithException(i: Int): Double =
            if (i == 0) throw IllegalArgumentException("Cannot take reciprocal of 0.")
            else 1.0 / i
}