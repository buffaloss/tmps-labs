import content_manager.singleton.ContentManagerSingleton
import media_item.implementations.Song
import user_entity.singleton.UserEntitySingleton


fun singletonDemonstration1() {
    val song = Song("Song Title", "2022-03-01", 3.5f, "Artist Name")
    ContentManagerSingleton.addContent(song)
    println(ContentManagerSingleton.getAllContent())
}

fun singletonDemonstration2() {
    // Log in a user
    UserEntitySingleton.loginUser("John Doe", "01-01-1990")
    // Check if a user is logged in
    if (UserEntitySingleton.user != null) {
        println("User is logged in")
        UserEntitySingleton.user?.displayInfo()
    } else {
        println("No user is logged in")
    }
    // Log out the current user
    UserEntitySingleton.logoutUser()
    // Check again if a user is logged in
    if (UserEntitySingleton.user != null) {
        println("User is logged in")
    } else {
        println("No user is logged in")
    }
}