from datetime import date
from domain.album import Album
from domain.playlist import Playlist
from domain.podcast import Podcast
from domain.song import Song
from domain.solo_artist import SoloArtist
from domain.band import Band
from domain.user import User
from domain.podcaster import Podcaster
from domain.playlist_manager import PlaylistManager
from domain.album_manager import AlbumManager
from domain.media_item import media_item


def main():
    # Create some instances of media items
    album1 = Album("Revival", date(2015, 9, 10), "Selena Gomez", "Dance-Pop", 16)
    playlist1 = Playlist("Sad moments", date(2022, 12, 12), "Songs for crying", "buffaloss")
    podcast1 = Podcast("Horror Hill", date(2021, 3, 15), 198, "Erik Peabody")
    song1 = Song("Zarplata", date(2016, 4, 20), 3.27, "Carla's Dreams")

    # Create some instances of characters
    solo_artist1 = SoloArtist("Eli Brown", date(2020, 6, 12), date(1999, 2, 13), "Electronic", "USA")
    band1 = Band("One Direction", date(2014, 8, 5), "Pop", "UK")
    user1 = User("Betty", date(2002, 12, 8))
    podcaster1 = Podcaster("Erik Peabody", date(2018, 10, 3), date(1985, 7, 14), "Horror")

    # Add some media items to managers
    playlist_manager = PlaylistManager("My playlist manager")
    album_manager = AlbumManager("My album manager")

    playlist_manager.add_item(playlist1)
    playlist_manager.add_item(song1)  # Note: You can add songs to a playlist
    album_manager.add_item(album1)

    # Add media items to artists
    solo_artist1.albums.append(album1)
    band1.albums.append(album1)

    # Add playlists to a user
    user1.playlists.append(playlist1)

    # Introduce performers
    solo_artist1.introduce()
    band1.introduce()
    podcaster1.introduce()

    # Display media item info
    album1.display_info()
    playlist1.display_info()
    podcast1.display_info()
    song1.display_info()

    # Play media items
    album1.play()
    playlist1.play()
    podcast1.play()
    song1.play()

    # Display contents from managers
    print("\nContents in Playlist Manager:")
    playlist_manager.display_contents()
    print("\nContents in Album Manager:")
    album_manager.display_contents()

    # Define a function that takes a media_item object and demonstrates LISKOV SUBSTITUTION PRINCIPLE
    def demonstrate_lsp(media_item):
        media_item.display_info()
        media_item.play()
    # Create instances of Album and demonstrate LSP
    album = Album("Album 1", date(2020, 1, 1), "Artist 1", "Rock", 12)
    # Demonstrate LSP with different media_item types
    demonstrate_lsp(album)


    # Demonstrate the dependency inversion principle
    def play_media(media_item: media_item):
        media_item.play()
    # Create instances and demonstrate DIP
    album = Album("Album 1", date(2020, 1, 1), "Artist 1", "Rock", 12)
    podcast = Podcast("Podcast 1", date(2020, 1, 1), 30, "Podcaster 1")
    # Demonstrate DIP by passing different media_item types to the function
    play_media(album)
    play_media(podcast)

if __name__ == "__main__":
    main()
