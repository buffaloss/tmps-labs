from content_manager import ContentManager


class IndividualAlbumManager(ContentManager):
    def __init__(self, name):
        super().__init__(name)
        self.album = None  # A single album managed

    def set_album(self, album):
        self.album = album

    def add_item(self, item):
        if self.album:
            self.album.add_item(item)

    def remove_item(self, item):
        if self.album:
            self.album.remove_item(item)

    def display_contents(self):
        if self.album:
            self.album.display_info()