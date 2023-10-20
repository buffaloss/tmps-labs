package media_item

abstract class MediaItem: Cloneable {
    abstract val title: String
    abstract val creationDate: String

    abstract fun play()

    abstract fun displayInfo()

    public override fun clone(): Any {
        return super.clone()
    }
}