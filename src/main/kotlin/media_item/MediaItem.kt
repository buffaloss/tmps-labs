package media_item

import media_item_implementation.MediaItemImplementation
import media_item_implementation.implementations.SongImplementation

abstract class MediaItem: Cloneable {
    abstract val title: String
    abstract val creationDate: String
    abstract val implementation: MediaItemImplementation


    fun play() {
//        getImplementation().play()
        implementation.play()
    }

    abstract fun displayInfo()

}