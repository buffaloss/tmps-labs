import advanced_media_player.AdvancedPlayer
import media_player.AdvancedPlayerAdapter

fun adapterDemonstration() {
    // Create an AdvancedPlayerAdapter.
    val player = AdvancedPlayerAdapter(AdvancedPlayer())

    // Use the AdvancedPlayerAdapter to play an MP3 file.
    println("Playing an MP3 file:")
    player.play("song.mp3")

    // Use the AdvancedPlayerAdapter to play an MP4 file.
    println("Playing an MP4 file:")
    player.play("video.mp4")

    // Try to play an unsupported file format.
    println("Trying to play an unsupported file format:")
    player.play("song.wav")
}