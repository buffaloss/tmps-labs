package order

class CommandHistory {
    private val history = mutableListOf<Command>()

    fun push(command: Command) {
        history.add(command)
    }

    fun pop(): Command? {
        val lastCommand = history.lastOrNull()
        if (lastCommand != null) {
            history.removeAt(history.size - 1)
        }
        return lastCommand
    }
}