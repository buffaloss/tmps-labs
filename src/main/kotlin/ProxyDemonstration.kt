import payment_method.PaymentMethod
import payment_method.implementations.PaypalPayment
import payment_processor.implementations.PaymentProcessorProxy
import subscription.Subscription
import user_entity.UserEntity
import user_entity.implementations.User

fun proxyDemonstration() {
    // Create a user object.
    val user = User("buffaloss", "09-10-2001")

    val paymentMethod = PaypalPayment()

    // Create a PaymentProcessorProxy object.
    val paymentProcessorProxy = PaymentProcessorProxy(paymentMethod)

    // Create a Subscription object using the PaymentProcessorProxy object.
    val subscription = Subscription(user, paymentProcessorProxy, 30, 9.99)

    // Start the subscription.
    subscription.startSubscription()

    // Renew the subscription.
    subscription.renewSubscription()

    // End the subscription.
    subscription.endSubscription()

    // Print the subscription end date.
    println("Subscription ended on ${subscription.endDate}")
}