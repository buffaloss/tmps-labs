from domain.performer import Performer
from abc import abstractmethod  # Import the ABC (Abstract Base Class) module for defining interfaces


class Artist(Performer):
    def __init__(self, name, debut_date):
        super().__init__(name)
        self.debut_date = debut_date

    @abstractmethod
    def introduce(self):
        pass
