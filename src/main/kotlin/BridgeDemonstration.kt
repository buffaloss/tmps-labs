import media_item.implementations.Song
import media_item_implementation.implementations.SongImplementation

fun bridgeDemonstration() {
    // Create a SongImplementation object
    val songImplementation = SongImplementation(
        title = "Song Title",
        creationDate = "2022-01-01",
        duration = 3.5f,
        artist = "Artist Name"
    )

    // Create a Song object with the SongImplementation object
    val song = Song(
        title = "Song Title",
        creationDate = "2022-01-01",
        duration = 3.5f,
        artist = "Artist Name",
        implementation = songImplementation
    )

    // Use the Song object
    song.displayInfo() // Displays the song information
    song.play() // Plays the song
}