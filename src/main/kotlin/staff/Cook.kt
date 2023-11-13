package staff

class Cook {
    val events = EventManager()

    fun prepareFood(item: String) {
        cook(item)
        events.notify(item)
    }

    private fun cook(item: String) {
        println("Cooking $item...")
        // Simulate the time it takes to prepare the food
        Thread.sleep(2000)
        println("The $item is ready!")
    }
}