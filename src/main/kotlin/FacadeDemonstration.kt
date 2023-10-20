import content_manager.ContentFacade
import media_item.implementations.Podcast
import media_item.implementations.Song

fun facadeDemonstration() {
    val contentFacade = ContentFacade()

    val songs = listOf(
        Song("Bohemian Rhapsody", "01-11-1975", 5.55f, "Queen"),
        Song("Imagine", "09-09-1971", 3.01f, "John Lennon")
    )
    val album = contentFacade.produceAlbum("Greatest Hits", "Queen", "26-10-1981", "Rock", 17, songs)
    println("Created album: ${album.title}")
    println("Additional info for testing:")
    println("Songs: ${songs}")
    println("Album info: ${album}")

    val mediaItems = listOf(
        Song("Smells Like Teen Spirit", "10-09-1991", 5.01f, "Nirvana"),
        Podcast("The Daily: Today's Headlines", "12-03-2023", 20.0f, "The New York Times")
    )
    val playlist = contentFacade.producePlaylist("My Favorite Tracks", "12-03-2023", "A mix of my favorite songs and podcasts", "User 1", mediaItems)
    println("Created playlist: ${playlist.title}")
    println("Additional info for testing:")
    println("Media items: ${mediaItems}")
    println("Playlist info: ${playlist}")
}