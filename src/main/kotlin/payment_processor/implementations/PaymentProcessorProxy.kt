package payment_processor.implementations

import payment_method.PaymentMethod
import payment_processor.PaymentProcessor

//class PaymentProcessorProxy(private val realPaymentProcessor: RealPaymentProcessor) : PaymentProcessor {
//    override fun processPayment(amount: Double) {
//        // You can add additional behavior here.
//        realPaymentProcessor.processPayment(amount)
//        // You can add additional behavior here.
//    }
//}

class PaymentProcessorProxy(private val paymentMethod: PaymentMethod) : PaymentProcessor {
    private val realPaymentProcessor by lazy { RealPaymentProcessor(paymentMethod) }

    override fun processPayment(amount: Double) {
        realPaymentProcessor.processPayment(amount)
        // You can add additional behavior here.
    }
}