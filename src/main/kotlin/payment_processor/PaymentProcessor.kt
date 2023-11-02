package payment_processor

interface PaymentProcessor {
    fun processPayment(amount: Double)
}