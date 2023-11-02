import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――")
        println("Welcome to the Structural Design Patterns Demonstration!")
        println("Please select an option:")
        println("1. Facade")
        println("2. Adapter")
        println("3. Composite")
        println("4. Proxy")
        println("5. Exit")

        when (scanner.nextInt()) {
            1 -> {
                println("――――――――――――――――――――――――――――")
                println("Facade Pattern Demonstration")
                println("――――――――――――――――――――――――――――")
                facadeDemonstration()

            }

            2 -> {
                println("―――――――――――――――――――――――――――――")
                println("Adapter Pattern Demonstration")
                println("―――――――――――――――――――――――――――――")
                adapterDemonstration()
            }

            3 -> {
                println("―――――――――――――――――――――――――――――――")
                println("Composite Pattern Demonstration")
                println("―――――――――――――――――――――――――――――――")
//              here goes the demonstration, if needed
            }

            4 -> {
                println("―――――――――――――――――――――――――――")
                println("Proxy Pattern Demonstration")
                println("―――――――――――――――――――――――――――")
                proxyDemonstration()
            }

            5 -> {
                println("Exiting the program...")
                return
            }

            else -> println("Invalid option. Please select a number between 1 and 5.")
        }
    }
}