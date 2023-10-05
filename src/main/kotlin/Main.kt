import java.util.Scanner
import content_manager.singleton.ContentManagerSingleton
import media_item.implementations.Song

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Design Patterns Demonstration!")
    println("Please select an option:")
    println("1. Singleton")
    println("2. Builder")
    println("3. Factory")
    println("4. Prototype")

    when (scanner.nextInt()) {
        1 -> {
            println("Singleton Pattern Demonstration")
            val song = Song("Song Title", "2022-03-01", 3.5f, "Artist Name")
            ContentManagerSingleton.addContent(song)
            println(ContentManagerSingleton.getAllContent())
        }
        2 -> {
            println("Builder Pattern Demonstration")
            // Implementation will be added later
        }
        3 -> {
            println("Factory Pattern Demonstration")
            // Implementation will be added later
        }
        4 -> {
            println("Prototype Pattern Demonstration")
            // Implementation will be added later
        }
        else -> println("Invalid option. Please select a number between 1 and 4.")
    }
}