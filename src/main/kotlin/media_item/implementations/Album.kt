package media_item.implementations
import media_item.MediaItem
import javax.print.attribute.standard.Media

class Album(
        override val title: String,
        override val creationDate: String,
        val artist: String,
        val genre: String,
        val noSongs: Int
) : MediaItem() {
    val items = mutableListOf<MediaItem>()

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

    override fun clone(): Album {
        return Album(title, creationDate, artist, genre, noSongs)
    }

    override fun toString(): String {
        return "Album(title='$title', creationDate='$creationDate', artist='$artist', genre='$genre', noSongs=$noSongs)"
    }
}


