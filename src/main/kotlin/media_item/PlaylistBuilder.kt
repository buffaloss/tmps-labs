package media_item
import media_item.implementations.Playlist

class PlaylistBuilder : MediaItemBuilder() {
    override var title: String = ""
    override var creationDate: String = ""
    lateinit var description: String
    lateinit var user: String

    override fun build(): Playlist {
        return Playlist(title, creationDate, description, user)
    }
}