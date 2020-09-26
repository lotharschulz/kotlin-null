package kotlinnull

data class MyInt(val value: Int)
data class MyDouble(val value: Double)

object LateInitStyle {
    private lateinit var toBeDefinedInt : MyInt
    private lateinit var toBeDefinedDouble : MyDouble

    fun parse(s: String): Int {
        return when (s.matches(Regex("-?[0-9]+"))) {
            true -> s.toInt()
            false -> if (this::toBeDefinedInt.isInitialized) toBeDefinedInt.value else 79
        }
    }

    fun reciprocal(i: Int): Double {
        return when (i == 0) {
            true -> if(this::toBeDefinedDouble.isInitialized) toBeDefinedDouble.value else 79.0
            false -> 1.0 / i
        }
    }


}