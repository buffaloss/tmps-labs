from abc import ABC, abstractmethod  # Import the ABC (Abstract Base Class) module for defining interfaces


# Define the MediaItem class as an abstract base class (interface)
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
