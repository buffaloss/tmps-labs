package media_item
import media_item.implementations.Song


class SongBuilder : MediaItemBuilder() {
    override var title: String = ""
    override var creationDate: String = ""
    var duration: Float = 0f
    lateinit var artist: String

    override fun build(): Song {
        return Song(title, creationDate, duration, artist)
    }
}