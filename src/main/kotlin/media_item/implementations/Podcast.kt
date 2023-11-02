package media_item.implementations
import media_item.MediaItem
import media_item_implementation.MediaItemImplementation
import media_item_implementation.implementations.PodcastImplementation

class Podcast(
        override val title: String,
        override val creationDate: String,
        val duration: Float,
        val podcaster: String,
        override val implementation: PodcastImplementation
) : MediaItem() {

    override fun displayInfo() {
        println("Podcast: $title with $podcaster")
        println("Duration: $duration minutes")
        println("Release date: $creationDate")
    }

    override fun toString(): String {
        return "Podcast(title='$title', creationDate='$creationDate', duration=$duration, podcaster='$podcaster')"
    }
}