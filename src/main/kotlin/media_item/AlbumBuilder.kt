package media_item
import media_item.MediaItemBuilder
import media_item.implementations.Album

class AlbumBuilder : MediaItemBuilder() {
    override var title: String = ""
    override var creationDate: String = ""
    lateinit var artist: String
    lateinit var genre: String
    var noSongs: Int = 0

    override fun build(): Album {
        return Album(title, creationDate, artist, genre, noSongs)
    }
}
