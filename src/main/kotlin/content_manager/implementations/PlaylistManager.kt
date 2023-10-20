package content_manager.implementations
import content_manager.ContentManager
import media_item.MediaItem
import media_item.implementations.Playlist

class PlaylistManager(override val name: String) : ContentManager {
    val playlists = mutableListOf<Playlist>()

    override fun addItem(item: MediaItem) {
        if (item is Playlist) {
            playlists.add(item)
        }
    }

    override fun removeItem(item: MediaItem) {
        playlists.remove(item)
    }

    override fun displayContents() {
        playlists.forEach { it.displayInfo() }
    }
}