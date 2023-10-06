import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――")
        println("Welcome to the Creational Design Patterns Demonstration!")
        println("Please select an option:")
        println("1. Singleton")
        println("2. Builder")
        println("3. Prototype")
        println("4. Factory")
        println("5. Exit")

        when (scanner.nextInt()) {
            1 -> {
                println("―――――――――――――――――――――――――――――――――――――――――――")
                println("Singleton Pattern Demonstration: variant 1")
                println("―――――――――――――――――――――――――――――――――――――――――――")
                singletonDemonstration1()
                println("―――――――――――――――――――――――――――――――――――――――――――")
                println("Singleton Pattern Demonstration: variant 2")
                println("―――――――――――――――――――――――――――――――――――――――――――")
                singletonDemonstration2()
            }

            2 -> {
                println("―――――――――――――――――――――――――――――")
                println("Builder Pattern Demonstration")
                println("―――――――――――――――――――――――――――――")
                BuilderDemonstration()
            }

            3 -> {
                println("―――――――――――――――――――――――――――――――")
                println("Prototype Pattern Demonstration")
                println("―――――――――――――――――――――――――――――――")
                PrototypeDemonstration()
            }

            4 -> {
                println("――――――――――――――――――――――――――――――――――――――――")
                println("Factory Pattern Demonstration: variant 1")
                println("――――――――――――――――――――――――――――――――――――――――")
                FactoryDemonstration1()
                println("――――――――――――――――――――――――――――――――――――――――")
                println("Factory Pattern Demonstration: variant 2")
                println("――――――――――――――――――――――――――――――――――――――――")
                FactoryDemonstration2()
            }

            5 -> {
                println("Exiting the program...")
                return
            }

            else -> println("Invalid option. Please select a number between 1 and 5.")
        }
    }
}