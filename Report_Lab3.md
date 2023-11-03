# Topic: *Structural Design Patterns*
## Author: *Golban Beatricia*
### Group: *FAF-213*
------
&ensp; &ensp; __1. Study and understand the Structural Design Patterns.__

&ensp; &ensp; __2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.__

&ensp; &ensp; __3. Implement some additional functionalities, or create a new project using structural design patterns.__
## Some Theory:
&ensp; &ensp; Structural design patterns are a category of design patterns that ease the design by identifying a simple way to realize relationships between entities. They focus on how classes and objects can be composed, to form larger structures. The structural design patterns simplify the structure by identifying relationships.

&ensp; &ensp; The design patterns implemented in this project are:

* Facade
* Adapter
* Bridge
* Proxy

## Main tasks:
&ensp; &ensp; __1. By creating a new project, or extending your last one (Lab work Nr2), implement at least 2 structural design patterns in your project:__
* The implemented design pattern should help to perform the tasks involved in your system.
* The object creation mechanisms/patterns can now be buried into the functionalities instead of using them into the client.
* There should only be one client for the whole system.

&ensp; &ensp; __2. Keep your files grouped (into packages/directories) by their responsibilities.__

&ensp; &ensp; __3. Document your work in a separate markdown file according to the requirements.__

## Structural design patterns implementation

### &ensp; &ensp; Facade design pattern

&ensp; &ensp; I've used the Facade pattern to simplify interactions with a complex music library subsystem. I've designed an interface, Facade, with two methods: produceAlbum and producePlaylist. The ContentFacade class, acting as the Facade, abstracts the intricate process of managing songs, media items, and multiple albums and playlists.
```
override fun produceAlbum(title: String, creationDate: String, artist: String, genre: String, noSongs: Int, songs: List<Song>): Album {
        val album = Album(title, creationDate, artist, genre, noSongs, AlbumImplementation(title, creationDate, artist, genre, noSongs))
        individualAlbumManager.setIndividualAlbum(album)
        songs.forEach { individualAlbumManager.addItem(it) }
        albumManager.addItem(album)
        return album
    }
    
override fun producePlaylist(title: String, creationDate: String, description: String, user: String, mediaItems: List<MediaItem>): Playlist {
        val playlist = Playlist(title, creationDate, description, user, PlaylistImplementation(title, creationDate, description, user))
        individualPlaylistManager.setIndividualPlaylist(playlist)
        mediaItems.forEach { individualPlaylistManager.addItem(it) }
        playlistManager.addItem(playlist)
        return playlist
    }
```
&ensp; &ensp; This code shows how ContentFacade streamlines album and playlist creation. The client code simply provides details and calls the produceAlbum and producePlaylist methods, sidestepping the complexity of managing individual media items.

&ensp; &ensp; In essence, the Facade pattern conceals subsystem complexity, enhancing maintainability and ease of use.
### &ensp; &ensp; Adapter design pattern

&ensp; &ensp; For the Adapter pattern, I created the interface AdvancedMediaPlayer, which declares the operations that the advanced media player can perform, and is implemented by AdvancedPlayer class, which provides fucntionality to play MP3 and MP4 files.  Then, the MediaPlayer interface represents a simpler media player that can only play a file, without distinguishing between MP3 and MP4. 

&ensp; &ensp; The AdvancedPlayerAdapter class adapts the interface of the AdvancedPlayer to the MediaPlayer interface. It takes an instance of AdvancedPlayer and uses it to implement the MediaPlayer interface.

```
class AdvancedPlayerAdapter(private val advancedPlayer: AdvancedPlayer) : MediaPlayer {
    override fun play(filename: String) {
        if (filename.endsWith(".mp3")) {
            advancedPlayer.playMP3(filename)
        } else if (filename.endsWith(".mp4")) {
            advancedPlayer.playMP4(filename)
        }
    }
}
```
&ensp; &ensp; The Adapter pattern is implemented in the AdvancedPlayerAdapter class, which serves as a bridge between the AdvancedPlayer and MediaPlayer interfaces. It adapts the AdvancedPlayer's ability to play MP3 and MP4 files to the simpler MediaPlayer interface. This allows code that operates on the MediaPlayer interface to use an AdvancedPlayer without knowing it.

### &ensp; &ensp; Bridge design pattern

&ensp; &ensp; In order to implement the Bridge pattern, I added the 'implementation' property is of type MediaItemImplementation, which is the bridge to the concrete implementation classes, and changed the function play() so that it uses the implementation.

```
abstract class MediaItem: Cloneable {
    ...
    abstract val implementation: MediaItemImplementation
    fun play() {
        implementation.play()
    }
    ...
}
```
&ensp; &ensp; Then, I created the MediaItemImplmenattion interface, which declares the operations that the concrete implementation classes must provide. 

```
interface MediaItemImplementation {
    abstract val title: String
    abstract val creationDate: String

    fun play()
    abstract fun displayInfo()
}
```
&ensp; &ensp; The concrete classes Song, Playlist, Podcast and Album extend the MediaItem abstract class. They each have a property of a specific type that implements the MediaItemImplementation interface.
```
class Song(
    ...
    override val implementation: SongImplementation
) : MediaItem() {
    ...
}
```
&ensp; &ensp; Additionally, in the concrete classes that implement the MediaItemImplementation interface - I provided the specific functionality for each type of media item.

&ensp; &ensp; In short, the Bridge pattern is implemented in the MediaItem abstract class and the MediaItemImplementation interface. The 'implementation' property in the MediaItem class serves as a bridge to the concrete implementation classes. This decouples the abstraction from its implementation, allowing the two to vary independently. Each concrete MediaItem class (Song, Album, Podcast, Playlist) has a property of a specific type that implements the MediaItemImplementation interface, providing the specific functionality for each type of media item.

### &ensp; &ensp; Proxy design pattern

&ensp; &ensp; I've implemented the Proxy pattern to manage payment processing. The Proxy pattern provides a surrogate or placeholder for another object to control access to it. In your case, the PaymentProcessorProxy acts as a placeholder for the RealPaymentProcessor.
```
interface PaymentProcessor { 
    fun processPayment(amount: Double) 
} 

class RealPaymentProcessor(private val paymentMethod: PaymentMethod) : PaymentProcessor { 
    override fun processPayment(amount: Double) { 
        paymentMethod.processPayment(amount) 
    } 
} 

class PaymentProcessorProxy(private val paymentMethod: PaymentMethod) : PaymentProcessor { 
    private val realPaymentProcessor by lazy { RealPaymentProcessor(paymentMethod) } 
    override fun processPayment(amount: Double) { 
        realPaymentProcessor.processPayment(amount) 
        // Additional behavior can be added here.
    } 
}
```
&ensp; &ensp; In this code, the PaymentProcessor interface defines a contract for processing payments. The RealPaymentProcessor class implements this interface and handles the actual payment processing. The PaymentProcessorProxy class also implements the PaymentProcessor interface and uses lazy initialization to create an instance of RealPaymentProcessor. The proxy then delegates the processPayment call to the real object.

&ensp; &ensp; The Subscription class uses the PaymentProcessor to process payments when starting or renewing a subscription.

## Conclusions
&ensp; &ensp; In conclusion, this project effectively demonstrates the application of various structural design patterns, namely Facade, Adapter, Bridge, and Proxy, in a music library system. The Facade pattern simplifies the system's interaction with complex subsystems, while the Adapter pattern allows for seamless integration of incompatible interfaces. The Bridge pattern decouples abstraction from implementation, enabling independent variation, and the Proxy pattern controls access to an object, adding an extra layer of security. 

&ensp; &ensp; By implementing these patterns, the project achieves increased maintainability, flexibility, and ease of use, thereby demonstrating the power and utility of structural design patterns in software development.
