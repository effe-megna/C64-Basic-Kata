import exceptions.CommandNotRecognizedException
import commands.ICommand
import commands.ICommandInterpreter
import types.PrimitiveType

class Interpreter(private val commandsInterpeters: List<ICommandInterpreter>) {

    private val commands = mutableListOf<ICommand>()

    @Throws(CommandNotRecognizedException::class)
    fun readCommand(input: String) {
        findCommand(input)?.let {
            commands.add(it)
        } ?: throw CommandNotRecognizedException(input)
    }

    fun executeCommands(): List<PrimitiveType?> {
        return commands.map { it.execute() }
    }

    private fun findCommand(input: String): ICommand? {
        commandsInterpeters.forEach {
            try {
                return it.newInstance(input)
            } catch (ex: CommandNotRecognizedException) {

            } catch (ex: Exception) {
                throw ex
            }
        }

        return null
    }
}

//class Interpreter : IInterpreter {
//    override val commands: MutableList<ICommand<PrimitiveType>> = mutableListOf()
//
//    init {
//        println("START")
//    }
//
//    override fun <T> addCommand(value: ICommand<T>) {
//        commands.add(value as ICommand<PrimitiveType>)
//    }
//
//    override fun executeCommands() {
//        commands.forEach {
//            it.execute()
//        }
//    }
//
//    fun exit(value: String): Boolean = value.toLowerCase() == "exit"
//}
//
//class Reader {
//    fun readCommandLine(): Pair<String, String>? {
//        val input = readCommand()
//            ?: return null
//
//        val words= input.split(" ")
//
//        val command = words.first()
//        var arguments = input.split("\"")
//        arguments = arguments.filter { it.isNotBlank() }
//
//        return Pair(command, arguments.last())
//    }
//}
//
//interface IInterpreter {
//    val commands: MutableList<ICommand<PrimitiveType>>
//
//    fun <T> addCommand(value: ICommand<T>)
//    fun executeCommands()
//}
