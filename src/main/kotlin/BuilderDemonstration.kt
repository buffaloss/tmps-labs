import media_item.*

fun BuilderDemonstration() {

    // album builder demo
    val albumBuilder = AlbumBuilder()
    albumBuilder.title = "My Album"
    albumBuilder.creationDate = "2022-03-15"
    albumBuilder.artist = "My Artist"
    albumBuilder.genre = "My Genre"
    albumBuilder.noSongs = 10
    val album = albumBuilder.build()
    println("\nAlbum Builder demonstration:")
    println("Album title: ${album.title}")
    println("Album creation date: ${album.creationDate}")
    println("Album artist: ${album.artist}")
    println("Album genre: ${album.genre}")
    println("Number of songs in album: ${album.noSongs}")

    // playlist builder demo
    val playlistBuilder = PlaylistBuilder()
    playlistBuilder.title = "My Playlist"
    playlistBuilder.creationDate = "2022-03-15"
    playlistBuilder.description = "My Playlist Description"
    playlistBuilder.user = "Janelle"
    val playlist = playlistBuilder.build()
    println("\nPlaylist Builder demonstration:")
    println("Playlist title: ${playlist.title}")
    println("Created by: ${playlist.user}")
    println("Description: ${playlist.description}")
    println("Playlist creation date: ${playlist.creationDate}")

    // podcast builder demo
    val podcastBuilder = PodcastBuilder()
    podcastBuilder.title = "My Podcast"
    podcastBuilder.creationDate = "2022-03-15"
    podcastBuilder.podcaster = "Harry Styles"
    val podcast = podcastBuilder.build()
    println("\nPodcast Builder demonstration:")
    println("Podcast title: ${podcast.title}")
    println("Here with: ${podcast.podcaster}")
    println("Podcast creation date: ${podcast.creationDate}")

    // song builder demo
    val songBuilder = SongBuilder()
    songBuilder.title = "My Song"
    songBuilder.creationDate = "2022-03-15"
    songBuilder.duration = 3.3f
    songBuilder.artist = "Beatricia Golban"
    val song = songBuilder.build()
    println("\nSong Builder demonstration:")
    println("Song title: ${song.title}")
    println("By ${song.artist}")
    println("Song creation date: ${song.creationDate}")
    println("Song duration: ${song.duration}")

}