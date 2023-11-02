package media_item.implementations
import media_item.MediaItem
import media_item_implementation.MediaItemImplementation
import media_item_implementation.implementations.SongImplementation


class Song(
        override val title: String,
        override val creationDate: String,
        val duration: Float,
        val artist: String,
        override val implementation: SongImplementation // Directly initialize the property here
) : MediaItem() {

    override fun displayInfo() {
        println("Song: $title by $artist")
        println("Duration: $duration minutes")
        println("Release date: $creationDate")
    }

    override fun toString(): String {
        return "Song(title='$title', creationDate='$creationDate', duration=$duration, artist='$artist')"
    }
}