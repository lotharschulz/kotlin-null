package kotlinnull

object ExceptionStyle {
    fun parse(s: String): Int =
            if (s.matches(Regex("-?[0-9]+"))) s.toInt()
            else throw IllegalArgumentException("Can not parse string of with characters.")

    fun reciprocal(i: Int): Double =
            if (i == 0) throw IllegalArgumentException("Can not take reciprocal of 0.")
            else 1.0 / i
}