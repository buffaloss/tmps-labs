import menu.RegularMenu
import menu.SeasonalMenu
import staff.Cook
import staff.Waitress
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――")
        println("Welcome to the Behavioral Design Patterns Demonstration!")
        println("Please select an option:")
        println("1. Observer")
        println("2. Iterator")
        println("3. ")
        println("4. Exit")

        when (scanner.nextInt()) {
            1 -> {
                println("――――――――――――――――――――――――――――――")
                println("Observer Pattern Demonstration")
                println("――――――――――――――――――――――――――――――")
                // Create an instance of Chef
                val chef = Cook()

                // Create instances of Waitress
                val waitress1 = Waitress("Alice")
                val waitress2 = Waitress("Bob")

                // Subscribe the waitresses to the chef
                chef.events.subscribe(waitress1)
                chef.events.subscribe(waitress2)

                // Prepare some food
                chef.prepareFood("Pizza")
                chef.prepareFood("Burger")

                // Unsubscribe a waitress and prepare more food
                chef.events.unsubscribe(waitress1)
                chef.prepareFood("Pasta")

            }

            2 -> {
                println("――――――――――――――――――――――――――――――")
                println("Iterator Pattern Demonstration")
                println("――――――――――――――――――――――――――――――")
                // Create regular and seasonal menus
                val regularMenu = RegularMenu()
                val seasonalMenu = SeasonalMenu()

                // Create a waitress
                val waitress = Waitress("Alice", regularMenu, seasonalMenu)

                // Print the menus
                waitress.printMenu()
            }

            3 -> {
                println("―――――――――――――――――――――――――――")
                println(" Pattern Demonstration")
                println("―――――――――――――――――――――――――――")
            }

            4 -> {
                println("Exiting the program...")
                return
            }

            else -> println("Invalid option. Please select a number between 1 and 4.")
        }
    }
}