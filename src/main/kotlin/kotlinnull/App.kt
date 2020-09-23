package kotlinnull

fun main() {
    println("""
    OptionStyle.parseWithOption("42"): ${OptionStyle.parse("42")} 
    OptionStyle.reciprocalWithOption(4): ${OptionStyle.reciprocal(4)}
    ExceptionStyle.parseWithException("42"): ${ExceptionStyle.parse("42")}
    ExceptionStyle.reciprocalWithException(4): ${ExceptionStyle.reciprocal(4)}
    EitherStyle.parseWithEither("42"): ${EitherStyle.parse("42")}
    EitherStyle.reciprocalWithEither(4): ${EitherStyle.reciprocal(4)}
    SealedStyle.parseWithSealed("42"): ${SealedStyle.parse("42")}
    SealedStyle.reciprocalWithEither(4): ${SealedStyle.reciprocal(4)}
    AnyStyle.parseWithSealed("42"): ${AnyStyle.parse("42")}
    AnyStyle.reciprocalWithEither(4): ${AnyStyle.reciprocal(4)}
    """)
}