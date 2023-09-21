from domain.content_manager import ContentManager


class AlbumManager(ContentManager):
    def __init__(self, name):
        super().__init__(name)
        self.albums = []

    def add_item(self, album):
        self.albums.append(album)

    def remove_item(self, album):
        if album in self.albums:
            self.albums.remove(album)

    def display_contents(self):
        for album in self.albums:
            album.display_info()
