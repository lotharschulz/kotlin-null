package kotlinnull

import org.jetbrains.annotations.Nullable

object NullableAnnotationStyle {
    @Nullable
    fun parse(s: String): Int? =
        when(s.matches(Regex("-?[0-9]+"))){
            true -> s.toInt()
            false -> null
        }

    @Nullable
    fun reciprocal(@Nullable i: Int): Double? =
        when(i == 0){
            true -> null
            false -> 1.0 / i
        }
}