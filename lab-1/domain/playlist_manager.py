from content_manager import ContentManager


class PlaylistManager(ContentManager):
    def __init__(self, name):
        super().__init__(name)
        self.playlists = []

    def add_item(self, playlist):
        self.playlists.append(playlist)

    def remove_item(self, playlist):
        if playlist in self.playlists:
            self.playlists.remove(playlist)

    def display_contents(self):
        for playlist in self.playlists:
            playlist.display_info()
