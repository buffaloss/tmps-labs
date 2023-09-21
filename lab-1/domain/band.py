from domain.artist import Artist


class Band(Artist):
    def __init__(self, name, debut_date, genre, country):
        super().__init__(name, debut_date)
        self.genre = genre
        self.country = country
        self.albums = []

    def introduce(self):
        print(f"Hello, we are {self.name}, a {self.genre} band from {self.country}.")
        print(f"We have been activating in the music industry since {self.debut_date}.")
