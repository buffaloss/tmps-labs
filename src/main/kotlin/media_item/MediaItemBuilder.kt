package media_item

abstract class MediaItemBuilder {
    abstract var title: String
    abstract var creationDate: String
    abstract fun build(): MediaItem
}