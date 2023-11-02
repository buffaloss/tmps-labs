package payment

interface PaymentMethod {
    fun processPayment(amount: Double)
}