package items_manager.implementations
import items_manager.ItemsManager
import media_item.MediaItem
import media_item.implementations.Playlist

class PlaylistItemsManager(private val playlist: Playlist) : ItemsManager {
    override fun addItem(item: MediaItem) {
        playlist.items.add(item)
    }

    override fun removeItem(item: MediaItem) {
        playlist.items.remove(item)
    }
}
