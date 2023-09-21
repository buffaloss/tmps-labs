from content_manager import ContentManager


class IndividualPlaylistManager(ContentManager):
    def __init__(self, name):
        super().__init__(name)
        self.playlist = None  # A single playlist managed

    def set_playlist(self, playlist):
        self.playlist = playlist

    def add_item(self, item):
        if self.playlist:
            self.playlist.add_item(item)

    def remove_item(self, item):
        if self.playlist:
            self.playlist.remove_item(item)

    def display_contents(self):
        if self.playlist:
            self.playlist.display_info()
