package kotlinnull

import org.jetbrains.annotations.Nullable

object NullableAnnotationStyle {
    @Nullable
    fun parse(s: String): Int? =
            //@TODO find a java lib call that may return null
            if (s.matches(Regex("-?[0-9]+"))) s.toInt()
            else null

    @Nullable
    fun reciprocal(@Nullable i: Int): Double? =
            if (i == 0) null
            else 1.0 / i
}