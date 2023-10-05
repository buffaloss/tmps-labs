package items_manager.implementations
import items_manager.ItemsManager
import media_item.MediaItem
import media_item.implementations.Album

class AlbumItemsManager(private val album: Album) : ItemsManager {
    override fun addItem(item: MediaItem) {
        album.items.add(item)
    }

    override fun removeItem(item: MediaItem) {
        album.items.remove(item)
    }
}