package user_entity

interface UserEntity {
    val name: String
    val dob: String

    fun introduce()
    fun displayInfo()
}