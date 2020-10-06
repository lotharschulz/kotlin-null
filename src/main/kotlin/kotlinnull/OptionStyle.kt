package kotlinnull

import arrow.core.None
import arrow.core.Option
import arrow.core.Some

object OptionStyle {
    fun parse(s: String): Option<Int> =
        when(s.matches(Regex("-?[0-9]+"))){
            true -> Some(s.toInt())
            false -> None
        }

    fun reciprocal(i: Int): Option<Double> =
        when(i == 0){
            true -> None
            false -> Some(1.0 / i)
        }
}