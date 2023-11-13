import menu.RegularMenu
import menu.SeasonalMenu
import order.Order
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
        println("3. Command")
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
                println("―――――――――――――――――――――――――――――")
                println("Command Pattern Demonstration")
                println("―――――――――――――――――――――――――――――")
                // Create a chef
                val cook = Cook()

                // Create orders
                val order1 = Order(cook, "Pizza")
                val order2 = Order(cook, "Burger")
                val order3 = Order(cook, "Pasta")

                // Create a waitress
                val waitress = Waitress("Alice")

                // The waitress takes the first order and posts it
                waitress.takeOrder(order1)
                waitress.orderUp()

                // The waitress takes the second order and posts it
                waitress.takeOrder(order2)
                waitress.orderUp()

                // Oops, the second order was a mistake. Undo it.
                waitress.undoOrder()

                // The waitress takes the third order and posts it
                waitress.takeOrder(order3)
                waitress.orderUp()
            }

            4 -> {
                println("Exiting the program...")
                return
            }

            else -> println("Invalid option. Please select a number between 1 and 4.")
        }
    }
}