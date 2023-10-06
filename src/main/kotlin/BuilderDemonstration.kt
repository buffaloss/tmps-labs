import media_item.*

fun BuilderDemonstration() {

    // album builder demo
    val albumBuilder = AlbumBuilder()
    albumBuilder.title = "A Night at the Opera"
    albumBuilder.creationDate = "1975-11-21"
    albumBuilder.artist = "Queen"
    albumBuilder.genre = "Rock"
    albumBuilder.noSongs = 12
    val album = albumBuilder.build()
    println("\nAlbum Builder demonstration:")
    println("Album title: ${album.title}")
    println("Album creation date: ${album.creationDate}")
    println("Album artist: ${album.artist}")
    println("Album genre: ${album.genre}")
    println("Number of songs in album: ${album.noSongs}")

    // playlist builder demo
    val playlistBuilder = PlaylistBuilder()
    playlistBuilder.title = "Chill Vibes"
    playlistBuilder.creationDate = "2021-07-12"
    playlistBuilder.description = "A collection of relaxing songs to unwind."
    playlistBuilder.user = "SpotifyUser123"
    val playlist = playlistBuilder.build()
    println("\nPlaylist Builder demonstration:")
    println("Playlist title: ${playlist.title}")
    println("Created by: ${playlist.user}")
    println("Description: ${playlist.description}")
    println("Playlist creation date: ${playlist.creationDate}")

    // podcast builder demo
    val podcastBuilder = PodcastBuilder()
    podcastBuilder.title = "The Daily"
    podcastBuilder.creationDate = "2017-01-30"
    podcastBuilder.podcaster = "Michael Barbaro"
    val podcast = podcastBuilder.build()
    println("\nPodcast Builder demonstration:")
    println("Podcast title: ${podcast.title}")
    println("Here with: ${podcast.podcaster}")
    println("Podcast creation date: ${podcast.creationDate}")

    // song builder demo
    val songBuilder = SongBuilder()
    songBuilder.title = "Bohemian Rhapsody"
    songBuilder.creationDate = "1975-10-31"
    songBuilder.duration = 5.55f
    songBuilder.artist = "Queen"
    val song = songBuilder.build()
    println("\nSong Builder demonstration:")
    println("Song title: ${song.title}")
    println("By ${song.artist}")
    println("Song creation date: ${song.creationDate}")
    println("Song duration: ${song.duration}")

}