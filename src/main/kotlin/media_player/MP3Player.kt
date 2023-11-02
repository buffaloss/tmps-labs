package media_player

class MP3Player : MediaPlayer {
    override fun play(filename: String) {
        println("Playing MP3 file: $filename")
    }
}