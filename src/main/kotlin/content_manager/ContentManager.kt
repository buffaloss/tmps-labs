package content_manager
import media_item.MediaItem

interface ContentManager {
    val name: String

    fun addItem(item: MediaItem)
    fun removeItem(item: MediaItem)
    fun displayContents()
}