package content_manager.implementations
import content_manager.ContentManager
import media_item.MediaItem
import media_item.implementations.Playlist
import items_manager.implementations.PlaylistItemsManager

class IndividualPlaylistManager(override val name: String) : ContentManager {
    var playlist: Playlist? = null
    var playlistItemsManager: PlaylistItemsManager? = null

    fun setIndividualPlaylist(playlist: Playlist) {
        this.playlist = playlist
        this.playlistItemsManager = PlaylistItemsManager(playlist)
    }

    override fun addItem(item: MediaItem) {
        if (playlist != null) {
            playlistItemsManager?.addItem(item)
        }
    }

    override fun removeItem(item: MediaItem) {
        if (playlist != null) {
            playlistItemsManager?.removeItem(item)
        }
    }

    override fun displayContents() {
        playlist?.displayInfo()
    }
}