package media_item_implementation

interface MediaItemImplementation {
    abstract val title: String
    abstract val creationDate: String

    fun play()
    abstract fun displayInfo()
}