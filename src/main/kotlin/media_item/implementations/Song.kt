package media_item.implementations
import media_item.MediaItem
import singleton.GlobalSearchIndex

class Song(
        override val title: String,
        override val creationDate: String,
        val duration: Float,
        val artist: String
) : MediaItem {
    init {
        GlobalSearchIndex.index(this)
    }

    override fun toString(): String {
        return "Song title: '$title', creationDate: '$creationDate', duration: $duration, artist: '$artist')"
    }

    override fun play() {
        println("Playing the song: $title by $artist")
    }

    override fun displayInfo() {
        println("Song: $title by $artist")
        println("Duration: $duration minutes")
        println("Release date: $creationDate")
    }
}