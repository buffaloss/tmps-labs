package subscription

import user_entity.UserEntity

class Subscription(val user: UserEntity,
                   //private val paymentProcessor: PaymentProcessor
) : Subscribable {
    var startDate: String? = null
    var endDate: String? = null

    override fun startSubscription() {
        // Implement the logic for starting a subscription here.
        // This could involve setting the startDate and calling paymentProcessor.processPayment().
    }

    override fun endSubscription() {
        // Implement the logic for ending a subscription here.
        // This could involve setting the endDate.
    }

    override fun renewSubscription() {
        // Implement the logic for renewing a subscription here.
        // This could involve updating the endDate and calling paymentProcessor.processPayment().
    }
}