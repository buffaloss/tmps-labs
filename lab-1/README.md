# Topic: *SOLID Principles*
## Author: *Golban Beatricia*
### Group: *FAF-213*
------
## Objectives:
&ensp; &ensp; __1. Study and understand the SOLID Principles.__

&ensp; &ensp; __2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.__

&ensp; &ensp;__3. Create a sample project that respects SOLID Principles.__

## Theory:
&ensp; &ensp; SOLID is a set of five object-oriented design principles intended to make software designs more maintainable, flexible, and easy to understand. The acronym stands for Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle. Each principle addresses a specific aspect of software design, such as the organization of responsibilities, the handling of dependencies, and the design of interfaces. By following these principles, software developers can create more modular, testable, and reusable code that is easier to modify and extend over time. These principles are widely accepted and adopted in the software development community and can be applied to any object-oriented programming language.
   
## Main tasks:
&ensp; &ensp; __1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).__

&ensp; &ensp; __2. Select a domain area for the sample project.__

&ensp; &ensp; __3. Define the main involved classes and think about what instantiation mechanisms are needed.__

&ensp; &ensp; __4. Respect SOLID Principles in your project.__

## Project Overview
&ensp; &ensp; For this project, I chose the Python programming language for development. It focuses on creating a Music Library system, housed in a modular structure with a primary *main.py* program and a separate *domain* folder containing all other project files. This Music Library system enables users to effectively manage media items like albums, playlists, podcasts, and songs. The primary objective of this project is to demonstrate the SOLID principles while maintaining a structured and organized codebase.

## Project Structure
&ensp; &ensp; The project is structured as follows:

&ensp; &ensp; __1. main.py:__ This is the main program and serves as the entry point for the Music Library system. It demonstrates the interaction between different classes and modules within the project.

&ensp; &ensp; __2. domain:__ This directory houses the core domain logic and is structured into several modules/packages, each with specific responsibilities:

- media_items: This module contains the definition of the MediaItem abstract base class, which serves as the foundation for all media item types. It also includes derived classes such as Album, Playlist, Podcast, and Song, each implementing specific media item features.

- characters: This module defines character-related entities. It contains abstract base class CharacterEntity and derived classes such as Podcaster, User, Artist, SoloArtist, and Band, each representing various characters involved in the Music Library system.

- content_management: This module handles content management and includes the ContentManager abstract base class. It also has derived classes like PlaylistManager and AlbumManager, responsible for managing playlists and albums, respectively.

## Respecting SOLID principles 
&ensp; &ensp; Let's evaluate how each SOLID principle is implemented in the project:

&ensp; &ensp; __1. Single Responsibility Principle (SRP):__

&ensp; &ensp; Each class (*Album, Playlist, Podcast*, etc) within the domain module has a single responsibility related to its type of entity or functionality, ensuring a clear separation of concerns. For example, looking at the *Song* class, it is obvious that its only role is to store and display information about a song, with no unnecessary methods.

```
class Song(MediaItem):
    def __init__(self, title, creation_date, duration, artist):
        super().__init__(title, creation_date)
        self.duration = duration
        self.artist = artist

    def play(self):
        print(f"Playing the song: {self.title} by {self.artist}")

    def display_info(self):
        print(f"Song: {self.title} by {self.artist}")
        print(f"Duration: {self.duration} minutes")
        print(f"Release date: {self.creation_date}")

```

&ensp; &ensp; Additionally, I can mention that the *MediaItem* class defines a common interface for all media items but doesn't implement specific functionality.

&ensp; &ensp; __2. Open-Closed Principle (OCP):__

&ensp; &ensp; The project is open for extension but closed for modification. New media item types, character entities, or content managers can be added without altering existing classes. 

&ensp; &ensp; Take for example the *MediaItem* class. This abstract base class serves as an interface for all media item types. It defines common methods such as play and display_info. The *Album* class, representing a specific media item type, derives from *MediaItem*. It extends the functionality by providing implementations for the abstract methods play and display_info. This is the crucial point for OCP: you can add new media item types (e.g., Movie, Documentary) without modifying the *MediaItem* class or any existing media item classes.

&ensp; &ensp; I can continue to extend the system with new media item types by creating additional classes that inherit from *MediaItem*. These new classes can introduce their unique behaviors while adhering to the existing interface.


```
class MediaItem(ABC):
    def __init__(self, title, creation_date):
        self.title = title
        self.creation_date = creation_date

    @abstractmethod
    def play(self):
        pass

    @abstractmethod
    def display_info(self):
        pass
```

&ensp; &ensp; __3. Liskov Substitution Principle (LSP):__

&ensp; &ensp; Derived classes (e.g., *Album, Podcaster, PlaylistManager*) can be used interchangeably with their base classes (e.g., *MediaItem, CharacterEntity, ContentManager*) without impacting program correctness.

&ensp; &ensp; The following code snippet demonstrates the Liskov Substitution Principle (LSP) by creating a function, *demonstrate_lsp*, that takes a *MediaItem* object as a parameter and showcases the interchangeability of derived classes (e.g., *Album*) with their base class (*MediaItem*). The function calls common methods (display_info and play) on the media_item, emphasizing that different *MediaItem* types can be used seamlessly, adhering to the LSP's requirement that derived classes must be substitutable for their base class without affecting program correctness.

```
    def demonstrate_lsp(media_item):
        media_item.display_info()
        media_item.play()

    album = Album("Issues", date(2020, 1, 1), "The Neighborhood", "Rock", 12)
    demonstrate_lsp(album)
```
&ensp; &ensp; __4. Interface Segregation Principle (ISP):__
 
&ensp; &ensp; The project defines focused interfaces (e.g., *MediaItem, CharacterEntity, ContentManager*) with only methods relevant to their responsibilities. Implementing classes adhere to these interfaces, ensuring they provide specific functionality without unnecessary dependencies.

&ensp; &ensp; The Interface Segregation Principle (ISP) is demonstrated in my code through the creation of minimal and focused interfaces (abstract base classes) with only the methods relevant to specific responsibilities. Here's an example:

```
class ContentManager(ABC):
    def __init__(self, name):
        self.name = name

    @abstractmethod
    def add_item(self, item):
        pass

    @abstractmethod
    def remove_item(self, item):
        pass

    @abstractmethod
    def display_contents(self):
        pass
```
&ensp; &ensp; The *ContentManager* class defines an abstract interface for managing content, specifying methods like add_item, remove_item, and display_contents. Subclasses like *PlaylistManager* and *AlbumManager* implement these methods based on their specific responsibilities.

&ensp; &ensp; By creating focused interfaces, the ISP is demonstrated because each class adheres to an interface with only the methods relevant to its role, ensuring that implementing classes do not have unnecessary dependencies on methods they don't need.

&ensp; &ensp; __5. Dependency Inversion Principle (DIP):__

&ensp; &ensp; The project adheres to DIP by depending on abstractions (e.g., interfaces) rather than concrete implementations. High-level modules (e.g., *main.py*) depend on these abstractions, promoting flexibility, reducing coupling, and enabling easier substitution of implementations.

&ensp; &ensp; In the following code, the play_media function takes a *MediaItem* object as an argument, adhering to the DIP by depending on the abstraction (*MediaItem*) rather than concrete implementations (*Album, Podcast*). This allows for easy substitution of different media item types without modifying the high-level module.

```
def play_media(media_item: MediaItem):
        media_item.play()
    
    album = Album("Album 1", date(2020, 1, 1), "Artist 1", "Rock", 12)
    podcast = Podcast("Podcast 1", date(2020, 1, 1), 30, "Podcaster 1")
    
    play_media(album)
    play_media(podcast)
```

## Conclusions
&ensp; &ensp; In this project, I created a Music Library system which showcases the SOLID principles while maintaining a modular structure with main.py as the central program and a dedicated domain folder containing all project files. 

&ensp; &ensp; This Music Library system empowers users to manage media items effectively, and the codebase demonstrates a commitment to maintainability, flexibility, and clean architecture. Adhering to the SOLID principles has resulted in a robust and extensible design that enhances code quality and promotes a user-friendly and efficient Music Library system.