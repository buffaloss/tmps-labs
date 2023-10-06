package media_item
import media_item.implementations.Podcast

class PodcastBuilder : MediaItemBuilder() {
    override var title: String = ""
    override var creationDate: String = ""
    var duration: Float = 0f
    lateinit var podcaster: String

    override fun build(): Podcast {
        return Podcast(title, creationDate, duration, podcaster)
    }
}