package performer.implementations.artist.implementations
import media_item.implementations.Album
import performer.implementations.artist.Artist

class Band(
        name: String,
        debutDate: String,
        val genre: String,
        val country: String
) : Artist(name, debutDate) {
    val albums = mutableListOf<Album>()

    override fun introduce() {
        println("Hello, we are $name, a $genre band from $country.")
        println("We have been activating in the music industry since $debutDate.")
    }

    override fun toString(): String {
        return "Band(name='$name', debutDate='$debutDate', genre='$genre', country='$country')"
    }

}