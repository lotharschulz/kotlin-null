package kotlinnull

data class MyInt(val value: Int)
data class MyDouble(val value: Double)

object LateInitStyle {
    private lateinit var toBeDefinedInt : MyInt
    private lateinit var toBeDefinedDouble : MyDouble

    fun parse(s: String): Int =
        when (s.matches(Regex("-?[0-9]+"))) {
            true -> s.toInt()
            false -> when (this::toBeDefinedInt.isInitialized) {
                true -> toBeDefinedInt.value
                false -> 79
            }
        }

    fun reciprocal(i: Int): Double =
        when (i == 0) {
            true -> when (this::toBeDefinedDouble.isInitialized) {
                true -> toBeDefinedDouble.value
                false -> 79.0
            }
            false -> 1.0 / i
        }
}