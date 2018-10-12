package keywords

import exceptions.CommandNotRecognizedException

class EqualKeyword(private val inputValue: String) : IKeyWord {
    override val value: String
        get() = inputValue.toUpperCase()

    override val keyword: String = "="

    init {
        if (value != keyword) {
            throw CommandNotRecognizedException(value)
        }
    }
}