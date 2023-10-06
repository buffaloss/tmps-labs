import media_item.implementations.Album
import media_item.implementations.Playlist
import media_item.implementations.Podcast
import media_item.implementations.Song

fun PrototypeDemonstration() {
    // Create an instance of each media item
    val originalAlbum = Album("Album Title", "Creation Date", "Artist", "Genre", 10)
    val originalPodcast = Podcast("Podcast Title", "Creation Date", 60.0f, "Podcaster")
    val originalPlaylist = Playlist("Playlist Title", "Creation Date", "Description", "User")
    val originalSong = Song("Song Title", "Creation Date", 3.5f, "Artist")

    // Clone each media item
    val clonedAlbum = originalAlbum.clone()
    val clonedPodcast = originalPodcast.clone()
    val clonedPlaylist = originalPlaylist.clone()
    val clonedSong = originalSong.clone()

    // Print out the original and cloned items to demonstrate that they have the same properties
    println("Original Album: $originalAlbum")
    println("Cloned Album: $clonedAlbum")

    println("Original Podcast: $originalPodcast")
    println("Cloned Podcast: $clonedPodcast")

    println("Original Playlist: $originalPlaylist")
    println("Cloned Playlist: $clonedPlaylist")

    println("Original Song: $originalSong")
    println("Cloned Song: $clonedSong")

}