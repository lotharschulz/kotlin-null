package kotlinnull

import arrow.core.Either

object NullableStyle {
    fun parse(s: String): Int? =
        when(s.matches(Regex("-?[0-9]+"))){
            true -> s.toInt()
            false -> null
        }

    fun reciprocal(i: Int): Double? =
        when(i == 0){
            true -> null
            false -> 1.0 / i
        }
}