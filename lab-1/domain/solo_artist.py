from artist import Artist


class SoloArtist(Artist):
    def __init__(self, name, debut_date, dob, genre, country):
        super().__init__(name, debut_date)
        self.dob = dob
        self.genre = genre
        self.country = country
        self.albums = []

    def introduce(self):
        print(f"Hello, I am {self.name}, a solo artist from {self.country}.")
        print(f"I have been activating in the music industry since {self.debut_date}.")
