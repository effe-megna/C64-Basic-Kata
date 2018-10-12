package exceptions

class CommandNotRecognizedException(command: String) : Exception("Command: $command is not recognized")