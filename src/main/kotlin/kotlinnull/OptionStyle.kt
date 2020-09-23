package kotlinnull

import arrow.core.None
import arrow.core.Option
import arrow.core.Some

object OptionStyle {
    fun parse(s: String): Option<Int> =
            if (s.matches(Regex("-?[0-9]+"))) Some(s.toInt())
            else None

    fun reciprocal(i: Int): Option<Double> =
            if (i == 0) None
            else Some(1.0 / i)
}