package facade

import media_item.MediaItem
import media_item.implementations.Album
import media_item.implementations.Playlist
import media_item.implementations.Song


interface Facade {

    fun produceAlbum(title: String, creationDate: String, artist: String, genre: String, noSongs: Int, songs: List<Song>): Album
    fun producePlaylist(title: String, creationDate: String, description: String, user: String, mediaItems: List<MediaItem>): Playlist

}