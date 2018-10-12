import commands.PrintCommand
import keywords.PrintKeyWord


//fun main(args:  Array<String>) {
//
//    val interpreter = Interpreter()
//    val reader = Reader()
//
//    val values = listOf("ggwp", "123")
//
//    while (true) {
//        val input = reader.readCommandLine()
//
//        if (input == null || input.first == "exit")
//            break
//
//        if (input.first == "execute") {
//            interpreter.executeCommands()
//            break
//        }
//
//        val command = PrintCommand(
//                PrintKeyWord(input.first),
//                input.second
//        )
//
//        interpreter.addCommand(command)
//    }
//}

