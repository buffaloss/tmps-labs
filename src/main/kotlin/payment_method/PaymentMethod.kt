package payment_method

interface PaymentMethod {
    fun processPayment(amount: Double)
}