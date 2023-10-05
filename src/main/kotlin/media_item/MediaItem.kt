package media_item

interface MediaItem {
    val title: String
    val creationDate: String

    fun play()
    fun displayInfo()
}