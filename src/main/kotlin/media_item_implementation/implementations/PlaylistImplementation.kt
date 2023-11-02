package media_item_implementation.implementations

import media_item.MediaItem
import media_item_implementation.MediaItemImplementation

class PlaylistImplementation(
    override val title: String,
    override val creationDate: String,
    val description: String,
    val user: String
) : MediaItemImplementation {
    val items = mutableListOf<MediaItem>()

    override fun play() {
        println("Playlist $title is currently playing...")
    }

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