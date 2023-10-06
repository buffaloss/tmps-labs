import java.util.Scanner
import user_entity.singleton.UserEntitySingleton

fun handleCommand(command: String) {
    val parts = command.split(" ")
    when (parts[0]) {
        "login" -> {
            val name = parts.getOrNull(1)
            val dob = parts.getOrNull(2)
            if (name != null && dob != null) {
                UserEntitySingleton.loginUser(name, dob)
                println("Logged in as $name")
            } else {
                println("Failed to log in")
            }
        }
        "logout" -> {
            UserEntitySingleton.logoutUser()
            println("Logged out")
        }
        // other commands...
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Creational Design Patterns Demonstration!")
    println("Please select an option:")
    println("1. Singleton")
    println("2. Builder")
    println("3. Factory")
    println("4. Prototype")

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
            // Implementation will be added later
        }
        3 -> {
            println("―――――――――――――――――――――――――――――")
            println("Factory Pattern Demonstration")
            println("―――――――――――――――――――――――――――――")
            // Implementation will be added later
        }
        4 -> {
            println("―――――――――――――――――――――――――――――――")
            println("Prototype Pattern Demonstration")
            println("―――――――――――――――――――――――――――――――")
            // Implementation will be added later
        }
        else -> println("Invalid option. Please select a number between 1 and 4.")
    }
}