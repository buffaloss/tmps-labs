package staff

class Waitress(val name: String) : Subscriber {
    override fun update(item: String) {
        println("Waitress $name: Order $item ready - can be picked up...")
    }
}