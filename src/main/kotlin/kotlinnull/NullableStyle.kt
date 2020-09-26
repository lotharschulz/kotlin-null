package kotlinnull

object NullableStyle {
    fun parse(s: String): Int? =
            if (s.matches(Regex("-?[0-9]+"))) s.toInt()
            else null

    fun reciprocal(i: Int): Double? =
            if (i == 0) null
            else 1.0 / i
}