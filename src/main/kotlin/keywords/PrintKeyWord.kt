package keywords

import exceptions.CommandNotRecognizedException

class PrintKeyWord(private val inputValue: String) : IKeyWord {
    override val value: String
        get() = inputValue.toUpperCase()

    override val keyword: String = "PRINT"

    init {
        if (value != keyword) {
            throw CommandNotRecognizedException(value)
        }
    }
}