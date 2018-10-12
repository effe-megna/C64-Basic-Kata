import exceptions.CommandNotRecognizedException
import commands.PrintCommand
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class InterpreterTests {
    @Test
    fun findPrintCommand() {
        val interpreter = Interpreter(listOf(PrintCommand.Interpreter))

        interpreter.readCommand("Print*Hello, World!")
    }

    @Test
    fun executePrintCommand() {
        val interpreter = Interpreter(listOf(PrintCommand.Interpreter))

        interpreter.readCommand("Print*Hello, World!")

        val executionResults = interpreter.executeCommands()

        assert((executionResults.first()?.value as String) == "Hello, World!")
    }

    @Test
    fun throwCommandNotRecognizedOnInterpretation() {
        val interpreter = Interpreter(listOf(PrintCommand.Interpreter))

        assertThrows<CommandNotRecognizedException> {
            interpreter.readCommand("PrintFOO*Hello, World!")
        }
    }
}