package kotlinnull

import kotlin.properties.Delegates

object NotNullDelegateStyle {
    var toBeDefinedInt : Int by Delegates.notNull()
    var toBeDefinedDouble : Double by Delegates.notNull()

    fun parse(s: String): Int {
        toBeDefinedInt = 79
        return when(s.matches(Regex("-?[0-9]+"))){
            true -> s.toInt()
            false -> toBeDefinedInt
        }
    }

    fun reciprocal(i: Int): Double {
        toBeDefinedDouble = 79.0
        return when(i == 0){
            true -> toBeDefinedDouble
            false -> 1.0 / i
        }
    }
}