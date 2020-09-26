package kotlinnull

import kotlin.properties.Delegates

object NotNullDelegateStyle {
    var toBeDefinedInt : Int by Delegates.notNull()
    var toBeDefinedDouble : Double by Delegates.notNull()

    fun parse(s: String): Int {
            toBeDefinedInt = 79
            return if (s.matches(Regex("-?[0-9]+"))) s.toInt()
            else toBeDefinedInt
    }

    fun reciprocal(i: Int): Double {
            toBeDefinedDouble = 79.0
            return if (i == 0) toBeDefinedDouble
            else 1.0 / i
    }
}