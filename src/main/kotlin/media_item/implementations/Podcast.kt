package media_item.implementations
import media_item.MediaItem

class Podcast(
        override val title: String,
        override val creationDate: String,
        val duration: Float,
        val podcaster: String
) : MediaItem {
    override fun play() {
        println("Playing the podcast: $title with $podcaster")
    }

    override fun displayInfo() {
        println("Podcast: $title with $podcaster")
        println("Duration: $duration minutes")
        println("Release date: $creationDate")
    }

    override fun clone(): MediaItem {
        return Podcast(title, creationDate, duration, podcaster)
    }

    override fun toString(): String {
        return "Podcast(title='$title', creationDate='$creationDate', duration=$duration, podcaster='$podcaster')"
    }
}