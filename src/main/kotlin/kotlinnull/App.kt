package kotlinnull

fun main() {
    OptionStyle.parseWithOption("42")
    OptionStyle.reciprocalWithOption(4)
    ExceptionStyle.parseWithException("42")
    ExceptionStyle.reciprocalWithException(4)
    EitherStyle.parseWithEither("42")
    EitherStyle.reciprocalWithEither(4)
}