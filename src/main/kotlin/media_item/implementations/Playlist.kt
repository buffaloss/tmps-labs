package media_item.implementations
import media_item.MediaItem
import singleton.GlobalSearchIndex

class Playlist(
        override val title: String,
        override val creationDate: String,
        val description: String,
        val user: String
) : MediaItem {
    init {
        GlobalSearchIndex.index(this)
    }

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
}