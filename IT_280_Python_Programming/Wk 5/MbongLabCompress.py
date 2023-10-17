import zipfile
import gzip

# Paths to files
file1 = 'Hinckz.txt'
file2 = 'zophie.jpg'
archive_name = 'MbongArchive.zip'

# Using gzip to compress
compressed_file1 = 'Hinckz.txt.gz'
compressed_file2 = 'zophie.jpg.gz'

with open(file1, 'rb') as f_in, gzip.open(compressed_file1, 'wb') as f_out:
    f_out.writelines(f_in)

with open(file2, 'rb') as f_in, gzip.open(compressed_file2, 'wb') as f_out:
    f_out.writelines(f_in)

# Creating ZIP archive and adding compressed files
with zipfile.ZipFile(archive_name, 'w', zipfile.ZIP_DEFLATED) as archive:
    archive.write(compressed_file1, 'compressed_Hinckz.txt')
    archive.write(compressed_file2, 'compressed_zophie.jpg')

# Cleanup (deleting the compressed files)
import os
os.remove(compressed_file1)
os.remove(compressed_file2)

print(f'Files compressed and added to {archive_name}')
