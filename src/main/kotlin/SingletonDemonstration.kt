import content_manager.singleton.ContentManagerSingleton
import media_item.implementations.Song
import user_entity.singleton.UserEntitySingleton


fun singletonDemonstration1() {
    val song1 = Song("Viva la Vida", "25-05-2008", 4.01f, "Coldplay")
    ContentManagerSingleton.addContent(song1)
    println(ContentManagerSingleton.getAllContent())
}

fun singletonDemonstration2() {
    // Log in a user
    UserEntitySingleton.loginUser("John Doe", "01-04-1990")
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