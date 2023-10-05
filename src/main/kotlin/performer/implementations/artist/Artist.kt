package performer.implementations.artist
import performer.Performer

abstract class Artist(
        override val name: String,
        val debutDate: String
) : Performer