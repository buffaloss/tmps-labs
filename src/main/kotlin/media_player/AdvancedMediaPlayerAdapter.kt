package media_player

import advanced_media_player.AdvancedPlayer

class AdvancedPlayerAdapter(private val advancedPlayer: AdvancedPlayer) : MediaPlayer {
    override fun play(filename: String) {
        if (filename.endsWith(".mp3")) {
            advancedPlayer.playMP3(filename)
        } else if (filename.endsWith(".mp4")) {
            advancedPlayer.playMP4(filename)
        }
    }
}