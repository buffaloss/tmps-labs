package content_manager

import content_manager.implementations.AlbumManager
import content_manager.implementations.IndividualAlbumManager
import content_manager.implementations.IndividualPlaylistManager
import content_manager.implementations.PlaylistManager
import facade.Facade
import media_item.MediaItem
import media_item.implementations.Album
import media_item.implementations.Playlist
import media_item.implementations.Song
import user_entity.UserEntity

class ContentFacade : Facade {
    private val albumManager = AlbumManager("Album Manager")
    private val playlistManager = PlaylistManager("Playlist Manager")
    private val individualAlbumManager = IndividualAlbumManager("Individual Album Manager")
    private val individualPlaylistManager = IndividualPlaylistManager("Individual Playlist Manager")

    override fun produceAlbum(title: String, creationDate: String, artist: String, genre: String, noSongs: Int, songs: List<Song>): Album {
        val album = Album(title, creationDate, artist, genre, noSongs)
        individualAlbumManager.setIndividualAlbum(album)
        songs.forEach { individualAlbumManager.addItem(it) }
        albumManager.addItem(album)
        return album
    }

    override fun producePlaylist(title: String, creationDate: String, description: String, user: String, mediaItems: List<MediaItem>): Playlist {
        val playlist = Playlist(title, creationDate, description, user)
        individualPlaylistManager.setIndividualPlaylist(playlist)
        mediaItems.forEach { individualPlaylistManager.addItem(it) }
        playlistManager.addItem(playlist)
        return playlist
    }
}