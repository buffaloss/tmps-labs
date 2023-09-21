from abc import ABC, abstractmethod


class UserEntity(ABC):
    def __init__(self, name, dob):
        self.name = name
        self.dob = dob

    @abstractmethod
    def introduce(self):
        pass

    @abstractmethod
    def display_info(self):
        pass
