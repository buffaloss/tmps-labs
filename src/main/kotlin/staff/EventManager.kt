package staff

class EventManager {
    private val listeners = mutableListOf<Subscriber>()

    fun subscribe(listener: Subscriber) {
        listeners.add(listener)
    }

    fun unsubscribe(listener: Subscriber) {
        listeners.remove(listener)
    }

    fun notify(item: String) {
        for (listener in listeners) {
            listener.update(item)
        }
    }
}