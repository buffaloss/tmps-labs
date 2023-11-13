package order

interface Command {
    fun execute()
    fun undo()
}