from abc import ABC, abstractmethod  # Import the ABC (Abstract Base Class) module for defining interfaces


# the 'name' attribute refers to the name or identifier given to the specific instance of a content manager.
class ContentManager(ABC):
    def __init__(self, name):
        self.name = name

    @abstractmethod
    def add_item(self, item):
        pass

    @abstractmethod
    def remove_item(self, item):
        pass

    @abstractmethod
    def display_contents(self):
        pass
