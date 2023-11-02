package payment_processor.implementations

import payment_method.PaymentMethod
import payment_processor.PaymentProcessor

class RealPaymentProcessor(private val paymentMethod: PaymentMethod) : PaymentProcessor {
    override fun processPayment(amount: Double) {
        paymentMethod.processPayment(amount)
    }
}