from abc import ABC, abstractmethod  # Import the ABC (Abstract Base Class) module for defining interfaces


class CharacterEntity(ABC):
    def __init__(self, name):
        self.name = name

    @abstractmethod
    def introduce(self):
        pass
