import content_manager.ContentFacade
import media_item.MediaItem
import media_item.implementations.Podcast
import media_item.implementations.Song
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
                val contentFacade = ContentFacade()

                val songs = listOf(
                    Song("Bohemian Rhapsody", "01-11-1975", 5.55f, "Queen"),
                    Song("Imagine", "09-09-1971", 3.01f, "John Lennon")
                )
                val album = contentFacade.produceAlbum("Greatest Hits", "Queen", "26-10-1981", "Rock", 17, songs)
                println("Created album: ${album.title}")
                println("Additional info for testing:")
                println("Songs: ${songs}")
                println("Album info: ${album}")

                val mediaItems = listOf(
                    Song("Smells Like Teen Spirit", "10-09-1991", 5.01f, "Nirvana"),
                    Podcast("The Daily: Today's Headlines", "12-03-2023", 20.0f, "The New York Times")
                )
                val playlist = contentFacade.producePlaylist("My Favorite Tracks", "12-03-2023", "A mix of my favorite songs and podcasts", "User 1", mediaItems)
                println("Created playlist: ${playlist.title}")
                println("Additional info for testing:")
                println("Media items: ${mediaItems}")
                println("Playlist info: ${playlist}")

            }

            2 -> {
                println("―――――――――――――――――――――――――――――")
                println("Adapter Pattern Demonstration")
                println("―――――――――――――――――――――――――――――")
//              here goes the demonstration, if needed
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
//              here goes the demonstration, if needed
            }

            5 -> {
                println("Exiting the program...")
                return
            }

            else -> println("Invalid option. Please select a number between 1 and 5.")
        }
    }
}