package media_item.implementations
import media_item.MediaItem
import singleton.GlobalSearchIndex

class Podcast(
        override val title: String,
        override val creationDate: String,
        val duration: Int,
        val podcaster: String
) : MediaItem {
    init {
        GlobalSearchIndex.index(this)
    }

    override fun play() {
        println("Playing the podcast: $title with $podcaster")
    }

    override fun displayInfo() {
        println("Podcast: $title with $podcaster")
        println("Duration: $duration minutes")
        println("Release date: $creationDate")
    }
}