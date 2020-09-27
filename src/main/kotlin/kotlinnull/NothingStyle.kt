package kotlinnull

object NothingStyle {
    fun parse(): Nothing? = null
    fun reciprocal(): Nothing? = throw IllegalArgumentException("Cannot take reciprocal of 0.")
}