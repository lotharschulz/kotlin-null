package kotlinnull

object AnyStyle {
    fun parse(s: String): Any =
        when(s.matches(Regex("-?[0-9]+"))){
            true -> s.toInt()
            false -> NumberFormatException("$s is not a valid integer.")
        }

    fun reciprocal(i: Int): Any =
        when(i == 0){
            true -> IllegalArgumentException("Can not take reciprocal of 0.")
            false -> 1.0 / i
        }
}