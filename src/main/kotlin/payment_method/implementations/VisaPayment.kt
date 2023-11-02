package payment_method.implementations

import payment_method.PaymentMethod
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class VisaPayment: PaymentMethod {
    override fun processPayment(amount: Double) {
        // Simulate processing a Visa payment.
        println("Connecting to the Visa API...")
        println("Processing a Visa payment of $$amount.")
        // Add code here to process the payment using the Visa API.
        // Create an HttpClient object.
        val client = HttpClient.newHttpClient()
        // Create an HttpRequest object for the Visa API.
        val visaRequest = HttpRequest.newBuilder()
            .uri(URI.create("https://sandbox.api.visa.com/vdp/helloworld"))
            .header("Authorization", "Basic YOUR_ACCESS_TOKEN")
            .build()
        // Send the Visa request and get the response.
        val visaResponse = client.send(visaRequest, HttpResponse.BodyHandlers.ofString())
        println("Visa response: ${visaResponse.body()}")
        println("Payment processed successfully!")
    }
}