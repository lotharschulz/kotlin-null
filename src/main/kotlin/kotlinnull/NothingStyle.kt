package kotlinnull

object NothingStyle {
    fun parse(): Nothing = throw IllegalArgumentException("Can not parse anything.")
    fun reciprocal(): Nothing = throw IllegalArgumentException("Can not take reciprocal of anything.")
}