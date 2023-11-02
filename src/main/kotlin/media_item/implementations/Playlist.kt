package media_item.implementations
import media_item.MediaItem
import media_item_implementation.MediaItemImplementation
import media_item_implementation.implementations.PlaylistImplementation

class Playlist(
        override val title: String,
        override val creationDate: String,
        val description: String,
        val user: String,
        override val implementation: PlaylistImplementation
) : MediaItem() {
    val items = mutableListOf<MediaItem>()

    override fun displayInfo() {
        println("Playlist title: $title created by $user")
        println("Description: $description")
        println("Created on: $creationDate")
        println("Items:")
        items.forEach {
            println(it.title)
        }
    }

    override fun toString(): String {
        return "Playlist(title='$title', creationDate='$creationDate', description='$description', user='$user')"
    }
}