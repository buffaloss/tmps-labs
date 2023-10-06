package user_entity.singleton
import user_entity.implementations.User


object UserEntitySingleton {
    var user: User? = null

    fun loginUser(name: String, dob: String) {
        user = User(name, dob)
    }

    fun logoutUser() {
        user = null
    }
}