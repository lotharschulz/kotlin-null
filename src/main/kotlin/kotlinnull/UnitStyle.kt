package kotlinnull

object UnitStyle {
    fun parse(){}
    fun callFunction(function: (Int) -> Unit): Unit = (1..2).forEach(function)
    fun reciprocal(){}
}