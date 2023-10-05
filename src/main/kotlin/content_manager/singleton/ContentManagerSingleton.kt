package content_manager.singleton
import media_item.MediaItem

object ContentManagerSingleton {
    // Initialize the shared resource
    private val contentList: MutableList<MediaItem> = mutableListOf()

    // Method to add content to the list
    fun addContent(item: MediaItem) {
        contentList.add(item)
    }

    // Method to remove content from the list
    fun removeContent(item: MediaItem) {
        contentList.remove(item)
    }

    // Method to get all content
    fun getAllContent(): List<MediaItem> {
        return contentList
    }
}