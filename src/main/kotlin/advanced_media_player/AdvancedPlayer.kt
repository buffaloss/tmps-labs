package advanced_media_player

class AdvancedPlayer : AdvancedMediaPlayer {
    override fun playMP3(filename: String) {
        println("Playing MP3 file: $filename")
    }

    override fun playMP4(filename: String) {
        println("Playing MP4 file: $filename")
    }
}