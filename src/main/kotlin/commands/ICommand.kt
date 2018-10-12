package commands

import keywords.IKeyWord
import types.PrimitiveType

interface ICommand {
    val keyWord: IKeyWord

    fun execute(): PrimitiveType?
}

interface ICommandInterpreter {
    fun newInstance(input: String): ICommand
}




