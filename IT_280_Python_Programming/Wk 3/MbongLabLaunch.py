import subprocess
import time

# Opens an image file with the default image viewer
def open_image_file(image_file):
    subprocess.Popen(['start', 'Paint 3D', image_file], shell=True)

# Opens a sound file with default media player
def open_sound_file(sound_file):
    subprocess.Popen(['start', 'VLC media player', sound_file], shell=True)

# Request from user the names of the sound and image files
sound_file = input("Provide sound file name (e.g., sound.mp3): ")
image_file = input("Provide image file name (e.g., image.png): ")

# (5 secs) delay before image file opening
time.sleep(5)
print(f"Opening {image_file}...")
open_image_file(image_file)

# (3 secs) delay before sound file opening
time.sleep(3)
print(f"Opening {sound_file}...")
open_sound_file(sound_file)
