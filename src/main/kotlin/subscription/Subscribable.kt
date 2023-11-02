package subscription

interface Subscribable {
    fun startSubscription()
    fun endSubscription()
    fun renewSubscription()
}