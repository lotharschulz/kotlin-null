package kotlinnull

object AnyStyle {
    fun parse(s: String): Any =
            when(s.matches(Regex("-?[0-9]+"))){
                true -> s.toInt()
                false -> NumberFormatException("$s is not a valid integer.")
            }
    
    fun reciprocal(i: Int): Any =
            if (i == 0) IllegalArgumentException("Can not take reciprocal of 0.")
            else 1.0 / i

}