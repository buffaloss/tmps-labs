from character_entity import CharacterEntity


class User(CharacterEntity):
    def __init__(self, name, dob):
        super().__init__(name)
        self.dob = dob
        self.playlists = []

    def introduce(self):
        print(f"Hey, I'm {self.name}.")

    def display_info(self):
        print(f"Name: {self.name}")
        print(f"Date of birth: {self.dob}")
        print(f"Current playlists: {self.playlists}")
