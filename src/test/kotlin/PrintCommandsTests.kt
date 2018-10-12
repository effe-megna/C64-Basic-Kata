import exceptions.CommandNotRecognizedException
import commands.PrintCommand
import keywords.PrintKeyWord
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PrintCommandsTests {

    @Test
    fun createPrintCommand() {
        PrintKeyWord("priNt")
    }

    @Test
    fun throwCommandNotRecognizedOnPrintCommand() {
        assertThrows<CommandNotRecognizedException> {
            PrintKeyWord("p")
        }
    }

    @Test
    fun executePrintCommandWithoutArgument() {
        val result = PrintCommand.newInstance("PrInT *").execute()

        assert(result == null)
    }

    @Test
    fun executePrintCommandOnString() {
        val result = PrintCommand.newInstance("PrInT *Hello, World!").execute()

        assert(result!!.value == "Hello, World!")
    }

    @Test
    fun executePrintCommandOnNumber() {
        val result = PrintCommand.newInstance("PrinT *-3").execute()

        assert(result!!.value == (-3).toString())
    }

    @Test
    fun executePrintCommandOnBoolean() {
        val result = PrintCommand.newInstance("Print *true").execute()

        assert(result!!.value == true.toString())
    }
}