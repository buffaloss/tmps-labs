package items_manager

import media_item.MediaItem

interface ItemsManager {
    fun addItem(item: MediaItem)
    fun removeItem(item: MediaItem)
}