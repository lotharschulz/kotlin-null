package kotlinnull

object ExceptionStyle {
    fun parse(s: String): Int =
        when(s.matches(Regex("-?[0-9]+"))){
            true -> s.toInt()
            false -> throw IllegalArgumentException("Can not parse string of with characters.")
        }

    fun reciprocal(i: Int): Double =
        when(i == 0){
            true -> throw IllegalArgumentException("Can not take reciprocal of 0.")
            false -> 1.0 / i
        }
}