package singleton
import media_item.MediaItem
import media_item.implementations.Album
import media_item.implementations.Song
import java.util.*

object GlobalSearchIndex {
    private val index: MutableMap<String, MutableList<MediaItem>> = mutableMapOf()

    fun index(item: MediaItem) {
        val titleKey = item.title.lowercase(Locale.getDefault())
        index.getOrPut(titleKey) { mutableListOf() }.add(item)

        if (item is Song) {
            val artistKey = item.artist.lowercase(Locale.getDefault())
            index.getOrPut(artistKey) { mutableListOf() }.add(item)
        }

        if (item is Album) {
            val creatorKey = item.artist.lowercase(Locale.getDefault())
            index.getOrPut(creatorKey) { mutableListOf() }.add(item)
        }
    }

    fun search(query: String): List<MediaItem> {
        return index[query.lowercase(Locale.getDefault())] ?: emptyList()
    }
}