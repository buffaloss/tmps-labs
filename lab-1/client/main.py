# from ..domain.album import Album
import sys
sys.path.append("..")  # Adds higher directory to python modules path.
from domain.album import Album
from domain.artist import SoloArtist

def main():
    # Create some instances of media items
    album1 = Album("Album 1", "01/01/2022", "Artist 1", "Rock", 12)
    album1.display_info()
    album1.play()


if __name__ == "__main__":
    main()
