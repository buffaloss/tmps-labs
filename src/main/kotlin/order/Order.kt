package order

import staff.Cook

class Order(
    private val cook: Cook,
    private val item: String
) : Command {

    override fun execute() {
        cook.prepareFood(item)
    }

    override fun undo() {
        println("Cancelling the $item...")
    }
}