package performer.implementations.artist.implementations
import media_item.implementations.Album
import performer.implementations.artist.Artist

class SoloArtist(
        name: String,
        debutDate: String,
        val dob: String,
        val genre: String,
        val country: String
) : Artist(name, debutDate) {
    val albums = mutableListOf<Album>()

    override fun introduce() {
        println("Hello, I am $name, a solo artist from $country.")
        println("I have been activating in the music industry since $debutDate.")
    }

    override fun toString(): String {
        return "SoloArtist(name='$name', debutDate='$debutDate', dob='$dob', genre='$genre', country='$country')"
    }
}