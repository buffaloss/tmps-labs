from domain.user_entity import UserEntity


class User(UserEntity):
    def __init__(self, name, dob):
        super().__init__(name, dob)
        self.playlists = []

    def introduce(self):
        print(f"Hey, I'm {self.name}.")

    def display_info(self):
        print(f"Name: {self.name}")
        print(f"Date of birth: {self.dob}")
        print(f"Current playlists: {self.playlists}")
