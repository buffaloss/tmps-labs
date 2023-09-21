from media_item import MediaItem


class Podcast(MediaItem):
    def __init__(self, title, creation_date, duration, podcaster):
        super().__init__(title, creation_date)
        self.duration = duration
        self.podcaster = podcaster

    def play(self):
        print(f"Playing the podcast: {self.title} with {self.podcaster}")

    def display_info(self):
        print(f"Podcast: {self.title} with {self.podcaster}")
        print(f"Duration: {self.duration} minutes")
        print(f"Release date: {self.creation_date}")
