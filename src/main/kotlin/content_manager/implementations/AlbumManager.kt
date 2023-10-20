package content_manager.implementations
import content_manager.ContentManager
import media_item.MediaItem
import media_item.implementations.Album

class AlbumManager(override val name: String) : ContentManager {
    val albums = mutableListOf<Album>()

    override fun addItem(item: MediaItem) {
        if (item is Album) {
            albums.add(item)
        }
    }

    override fun removeItem(item: MediaItem) {
        albums.remove(item)
    }

    override fun displayContents() {
        albums.forEach { it.displayInfo() }
    }
}

