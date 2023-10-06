package performer
import performer.implementations.Podcaster
import performer.implementations.artist.implementations.Band
import performer.implementations.artist.implementations.SoloArtist

class PerformerFactory {
    fun createPodcaster(name: String, debutDate: String, dob: String, topic: String): Performer {
        return Podcaster(name, debutDate, dob, topic)
    }

    fun createBand(name: String, debutDate: String, genre: String, country: String): Performer {
        return Band(name, debutDate, genre, country)
    }

    fun createSoloArtist(name: String, debutDate: String, dob: String, genre: String, country: String): Performer {
        return SoloArtist(name, debutDate, dob, genre, country)
    }

    fun createPerformer(description: PerformerDescription): Performer {
        return when (description.type) {
            "Podcaster" -> Podcaster(description.name, description.debutDate!!, description.dob!!, description.topic!!)
            "Band" -> Band(description.name, description.debutDate!!, description.genre!!, description.country!!)
            "SoloArtist" -> SoloArtist(description.name, description.debutDate!!, description.dob!!, description.genre!!, description.country!!)
            else -> throw IllegalArgumentException("Invalid performer type")
        }
    }
}