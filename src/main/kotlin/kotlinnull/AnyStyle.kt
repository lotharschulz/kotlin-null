package kotlinnull

object AnyStyle {
    fun parse(s: String): Any =
            if (s.matches(Regex("-?[0-9]+"))) s.toInt()
            else NumberFormatException("$s is not a valid integer.")

    fun reciprocal(i: Int): Any =
            if (i == 0) IllegalArgumentException("Cannot take reciprocal of 0.")
            else 1.0 / i

}