package media_item_implementation.implementations

import media_item.MediaItem
import media_item_implementation.MediaItemImplementation

class PodcastImplementation(
    override val title: String,
    override val creationDate: String,
    val duration: Float,
    val podcaster: String
) : MediaItemImplementation {

    override fun play() {
        println("Playing the podcast: $title with $podcaster")
    }

    override fun displayInfo() {
        println("Podcast: $title with $podcaster")
        println("Duration: $duration minutes")
        println("Release date: $creationDate")
    }

    override fun toString(): String {
        return "Podcast(title='$title', creationDate='$creationDate', duration=$duration, podcaster='$podcaster')"
    }
}