from domain.performer import Performer


class Podcaster(Performer):
    def __init__(self, name, debut_date, dob, topic):
        super().__init__(name)
        self.debut_date = debut_date
        self.dob = dob
        self.topic = topic
        self.genre = "Podcast"

    def introduce(self):
        print(f"Hello, I am {self.name}, a podcast host. I have been active since {self.debut_date}.")
        print(f"Usually, I talk about {self.topic}.")

    def perform(self):
        print(f"{self.name} is currently hosting a podcast episode.")
