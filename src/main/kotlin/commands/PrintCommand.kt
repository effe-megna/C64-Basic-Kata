package commands

import keywords.IKeyWord
import keywords.PrintKeyWord
import types.StringType

class PrintCommand private constructor(
        override val keyWord: IKeyWord,
        private val argument: StringType?
): ICommand {
    override fun execute(): StringType? {
        if (argument?.value == null) {
            println()
        }

        return argument?.apply {
            print(this.value)
        }
    }

    companion object Interpreter : ICommandInterpreter {
        override fun newInstance(input: String): PrintCommand {
            val words = input.split("*")

            return PrintCommand(
                    PrintKeyWord(words[0].trim()),
                    if (words[1].isNotEmpty()) StringType(words[1]) else null
            )
        }
    }
}