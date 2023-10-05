from domain.media_item import media_item


class Playlist(media_item):
    def __init__(self, title, creation_date, description, user):
        super().__init__(title, creation_date)
        self.description = description
        self.user = user

    def play(self):
        print(f"Playlist {self.title} is currently playing...")

    def display_info(self):
        print(f"Playlist title: {self.title} created by {self.user}")
        print(f"Description: {self.description}")
        print(f"Created on: {self.creation_date}")
