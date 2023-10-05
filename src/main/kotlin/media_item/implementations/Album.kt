package media_item.implementations
import media_item.MediaItem
import singleton.GlobalSearchIndex

class Album(
        override val title: String,
        override val creationDate: String,
        val artist: String,
        val genre: String,
        val noSongs: Int
) : MediaItem {
    val items = mutableListOf<MediaItem>()

    init {
        GlobalSearchIndex.index(this)
    }


    override fun play() {
        println("Playing the album: $title by $artist")
    }

    override fun displayInfo() {
        println("Album: $title by $artist")
        println("Genre: $genre")
        println("Release date: $creationDate")
        println("Number of songs: $noSongs")
        println("Items:")
        items.forEach {
            println(it.title)
        }
    }
}

