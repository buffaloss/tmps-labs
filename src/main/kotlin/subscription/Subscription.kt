package subscription

import payment_processor.PaymentProcessor
import user_entity.UserEntity
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Subscription(
    val user: UserEntity,
    private val paymentProcessor: PaymentProcessor,
    private val subscriptionPeriod: Long, // in days
    private val subscriptionPrice: Double // price
) : Subscribable {
    private val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    var startDate: String? = null
    var endDate: String? = null

    override fun startSubscription() {
        // Set the startDate to the current date.
        startDate = LocalDate.now().format(formatter)

        // Set the endDate to a future date based on the subscription period.
        endDate = LocalDate.now().plusDays(subscriptionPeriod).format(formatter)

        // Process the payment for the subscription.
        paymentProcessor.processPayment(subscriptionPrice)
    }

    override fun endSubscription() {
        // Set the endDate to the current date.
        endDate = LocalDate.now().format(formatter)

        // Notify the user that their subscription has ended.
        println("User ${user.name}: Your subscription has ended.")
    }

    override fun renewSubscription() {
        paymentProcessor.processPayment(subscriptionPrice)
    }
}