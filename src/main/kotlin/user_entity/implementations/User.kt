package user_entity.implementations
import user_entity.UserEntity

data class User(
        override val name: String,
        override val dob: String
) : UserEntity {
    val playlists = mutableListOf<String>()

    override fun introduce() {
        println("Hey, I'm $name.")
    }

    override fun displayInfo() {
        println("Name: $name")
        println("Date of birth: $dob")
        println("Current playlists: $playlists")
    }
}