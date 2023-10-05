package content_manager.implementations
import content_manager.ContentManager
import media_item.MediaItem
import media_item.implementations.Album
import items_manager.implementations.AlbumItemsManager

class IndividualAlbumManager(override val name: String) : ContentManager {
    var album: Album? = null
    var albumItemsManager: AlbumItemsManager? = null

    fun setAlbum(album: Album) {
        this.album = album
        this.albumItemsManager = AlbumItemsManager(album)
    }

    override fun addItem(item: MediaItem) {
        if (album != null) {
            albumItemsManager?.addItem(item)
        }
    }

    override fun removeItem(item: MediaItem) {
        if (album != null) {
            albumItemsManager?.removeItem(item)
        }
    }

    override fun displayContents() {
        album?.displayInfo()
    }
}