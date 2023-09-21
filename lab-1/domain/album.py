from media_item import MediaItem


class Album(MediaItem):
    def __init__(self, title, creation_date, artist, genre, no_songs):
        super().__init__(title, creation_date)
        self.artist = artist
        self.genre = genre
        self.no_songs = no_songs

    def play(self):
        print(f"Playing the album: {self.title} with {self.artist}")

    def display_info(self):
        print(f"Album: {self.title} by {self.artist}")
        print(f"Genre: {self.genre}")
        print(f"Release date: {self.creation_date}")
        print(f"Number of songs: {self.no_songs}")
