package staff

class Cook {
    val events = EventManager()

    fun prepareFood(item: String) {
        cook(item)
        events.notify(item)
    }

    private fun cook(item: String) {
        println("Cooking $item...")
    }
}