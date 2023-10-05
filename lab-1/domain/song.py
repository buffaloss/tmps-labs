from domain.media_item import media_item


class Song(media_item):
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
