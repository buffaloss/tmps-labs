# Topic: *Creational Design Patterns*
## Author: *Golban Beatricia*
### Group: *FAF-213*
------
&ensp; &ensp; __1. Study and understand the Creational Design Patterns.__

&ensp; &ensp; __2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.__

&ensp; &ensp; __3. Use some creational design patterns for object instantiation in a sample project.__

## Some Theory:
&ensp; &ensp; Creational design patterns are a type of design pattern that focuses on the process of creating an object. They enable the production of objects in a flexible and controlled manner, while divorcing client code from object creation specifics. Creational design patterns address basic difficulties in object creation, such as how to generate objects with varied initialization values, how to create objects depending on particular criteria, or how to create just one instance of an object. There are various creational design patterns, each with its own set of advantages and disadvantages. Each of them is better suited to handling certain object production difficulties. Developers may increase the flexibility, maintainability, and scalability of their programs by employing creational design patterns.

&ensp; &ensp; The design patterns implemented in this project are:

   * Singleton
   * Builder
   * Prototype
   * Factory Method
   
## Main tasks:
&ensp; &ensp; __1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).__

&ensp; &ensp; __2. Select a domain area for the sample project.__

&ensp; &ensp; __3. Define the main involved classes and think about what instantiation mechanisms are needed.__

&ensp; &ensp; __4. Based on the previous point, implement at least 2 creational design patterns in your project.__

## Project Overview
&ensp; &ensp; For this project, I have successfully developed a comprehensive music library in Kotlin, leveraging four crucial creational design patterns: singleton, builder, prototype, and factory. The library supports a broad range of music-related entities, including albums, songs, podcasts, and playlists. Each entity is represented by a class, and the design patterns were used to ensure controlled and consistent instantiation of these classes. The application of these patterns has significantly enhanced the project's structure and readability, facilitating efficient memory usage and system performance.


## Creational design patterns implementation

### &ensp; &ensp; Singleton design pattern
&ensp; &ensp; The Singleton pattern is implemented in the ContentManagerSingleton and UserEntitySingleton classes. ContentManagerSingleton manages a list of MediaItem objects, providing methods to add and remove items, and to retrieve the entire list. UserEntitySingleton manages a single User object, providing methods to log in and log out a user. This pattern ensures that only one instance of each class exists, providing a global point of access to their methods.

```
object ContentManagerSingleton {
    private val contentList: MutableList<MediaItem> = mutableListOf()
    fun addContent(item: MediaItem) {
        contentList.add(item)
    }
    fun removeContent(item: MediaItem) {
        contentList.remove(item)
    }
    fun getAllContent(): List<MediaItem> {
        return contentList
    }
}
```
&ensp; &ensp; The ContentManagerSingleton object has a private mutable list of MediaItem objects. The addContent method adds a MediaItem to the list, and the getAllContent method returns the entire list. 
```
object UserEntitySingleton {
    var user: User? = null
    fun loginUser(name: String, dob: String) {
        user = User(name, dob)
    }
    fun logoutUser() {
        user = null
    }
}
```
&ensp; &ensp; The UserEntitySingleton object has a nullable User variable. The loginUser method creates a new User object and assigns it to the user variable, and the logoutUser method sets the user variable to null.

&ensp; &ensp; These classes use the object keyword to declare a singleton, which means that only one instance of each class is created. The methods of these classes can be accessed directly using the class name.

### &ensp; &ensp; Builder design pattern
&ensp; &ensp; The Builder pattern is implemented through the MediaItemBuilder abstract class and its subclasses AlbumBuilder, PlaylistBuilder, PodcastBuilder, and SongBuilder. Each subclass overrides the build method to return a specific type of MediaItem. This pattern is useful because it allows for the construction of complex objects step by step, and it makes the code more readable and maintainable by separating the construction logic from the main code.

&ensp; &ensp; The MediaItemBuilder abstract class declares two abstract properties, title and creationDate, and an abstract build method that returns a MediaItem. Each subclass of MediaItemBuilder provides its own implementation of the build method to construct a specific type of MediaItem.
```
abstract class MediaItemBuilder {
    abstract var title: String
    abstract var creationDate: String
    abstract fun build(): MediaItem
}
```
&ensp; &ensp; For example, the AlbumBuilder class includes additional properties artist, genre, and noSongs, and its build method returns an Album object. This structure allows for the creation of different types of MediaItem objects using a consistent interface, which is the essence of the Builder pattern.
```
class AlbumBuilder : MediaItemBuilder() {
    override var title: String = ""
    override var creationDate: String = ""
    lateinit var artist: String
    lateinit var genre: String
    var noSongs: Int = 0

    override fun build(): Album {
        return Album(title, creationDate, artist, genre, noSongs)
    }
}

```

### &ensp; &ensp; Prototype design pattern
&ensp; &ensp; The Prototype pattern is implemented through the MediaItem interface and its subclasses Album, Playlist, Podcast, and Song. Each subclass overrides the clone method to return a copy of itself. This pattern is useful because it allows for the creation of new objects by copying existing ones, which can be more efficient than creating new objects from scratch, especially when the object creation process is complex or costly.

&ensp; &ensp; The MediaItem interface declares a clone method that returns a MediaItem. Each subclass of MediaItem provides its own implementation of the clone method to return a copy of itself. 
```
interface MediaItem {

    ...

    fun clone(): MediaItem
}
```
&ensp; &ensp; For example, the Album class includes additional properties artist, genre, and noSongs, and its clone method returns a new Album object with the same properties. 
```
class Album(
        override val title: String,
        override val creationDate: String,
        val artist: String,
        val genre: String,
        val noSongs: Int
) : MediaItem {
    
    ...

    override fun clone(): MediaItem {
        return Album(title, creationDate, artist, genre, noSongs)
    }
}
```
&ensp; &ensp; This structure allows for the creation of new MediaItem objects by copying existing ones, which is the essence of the Prototype pattern. The PrototypeDemonstration function demonstrates this by creating original MediaItem objects, cloning them, and printing out the properties of the original and cloned objects to show that they are the same.

### &ensp; &ensp; Factory design pattern
&ensp; &ensp; The Factory pattern is implemented through the PerformerFactory class, which provides methods to create Performer objects of different types: Podcaster, Band, and SoloArtist. The createPerformer method takes a PerformerDescription object and returns a Performer object based on the type property of the description. This pattern is useful because it abstracts the process of creating objects, allowing the client code to be independent of the concrete classes.
```
class PerformerFactory {
    
    ...

    fun createPerformer(description: PerformerDescription): Performer {
        return when (description.type) {
            "Podcaster" -> Podcaster(description.name, description.debutDate!!, description.dob!!, description.topic!!)
            "Band" -> Band(description.name, description.debutDate!!, description.genre!!, description.country!!)
            "SoloArtist" -> SoloArtist(description.name, description.debutDate!!, description.dob!!, description.genre!!, description.country!!)
            else -> throw IllegalArgumentException("Invalid performer type")
        }
    }
}
```
&ensp; &ensp; The PerformerFactory class includes a createPerformer method that takes a PerformerDescription object and returns a Performer object. The method uses a when expression to check the type property of the description and creates a Performer object of the corresponding type. 

&ensp; &ensp; For example, if the type is "Podcaster", it creates a Podcaster object with the properties of the description. If the type is not recognized, it throws an IllegalArgumentException. This structure allows for the creation of different types of Performer objects using a consistent interface, which is the essence of the Factory pattern. The FactoryDemonstration functions demonstrate this by creating Performer objects using the factory and printing out their properties.


## Conclusions
&ensp; &ensp; The implementation of the Singleton, Builder, Prototype, and Factory design patterns in my Kotlin project has greatly enhanced its structure, readability, and maintainability.

&ensp; &ensp; The Singleton pattern has ensured a global point of access to the content manager and user entity, thereby ensuring data consistency. The Builder pattern has simplified the creation of complex media items, making the code more organized. The Prototype pattern has optimized the process of creating new media items by cloning existing ones, enhancing system performance. Lastly, the Factory pattern has abstracted the creation of performer objects, making the client code independent of the concrete classes. 

&ensp; &ensp; These patterns have collectively made the code more flexible, reusable, and easier to maintain.