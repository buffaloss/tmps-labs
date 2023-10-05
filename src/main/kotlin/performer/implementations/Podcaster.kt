package performer.implementations
import performer.Performer

class Podcaster(
        override val name: String,
        val debutDate: String,
        val dob: String,
        val topic: String
) : Performer {
    val genre = "Podcast"

    override fun introduce() {
        println("Hello, I am $name, a podcast host. I have been active since $debutDate.")
        println("Usually, I talk about $topic.")
    }

    fun perform() {
        println("$name is currently hosting a podcast episode.")
    }
}