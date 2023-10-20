import media_item.MediaItem
import media_item.implementations.Album
import media_item.implementations.Playlist
import media_item.implementations.Podcast
import media_item.implementations.Song

fun PrototypeDemonstration() {
    // Create an instance of each media item
    val originalAlbum = Album("Electra Heart", "2012-04-27", "Marina and the Diamonds", "Pop", 12)
    val originalPodcast = Podcast("Tiny Desk Concerts - Audio", "2008-12-05", 15.0f, "NPR")
    val originalPlaylist = Playlist("Best of BTS", "2021-12-31", "A collection of the best songs from BTS.", "Spotify")
    val originalSong = Song("Sweater Weather", "2012-03-05", 4.0f, "The Neighbourhood")

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