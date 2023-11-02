package media_item_implementation.implementations

import media_item.MediaItem
import media_item_implementation.MediaItemImplementation

class SongImplementation(
    override val title: String,
    override val creationDate: String,
    val duration: Float,
    val artist: String
) : MediaItemImplementation {

    override fun play() {
        println("Playing the song: $title by $artist")
    }

    override fun displayInfo() {
        println("Song: $title by $artist")
        println("Duration: $duration minutes")
        println("Release date: $creationDate")
    }

    override fun toString(): String {
        return "Song(title='$title', creationDate='$creationDate', duration=$duration, artist='$artist')"
    }
}