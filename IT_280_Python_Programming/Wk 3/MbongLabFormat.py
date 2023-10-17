import random
import string

# Generate random uppercase letters (function)
def random_uppercase_letters():
    return ''.join(random.choice(string.ascii_uppercase) for _ in range(5))
# Generate a random integer between 0 and 999 (function)
def random_integer():
    return str(random.randint(0, 999)).rjust(3)
# Generate random lowercase letters (function)
def random_lowercase_letters():
    return ''.join(random.choice(string.ascii_lowercase) for _ in range(3))
# Generate a random floating-point number between 0 and 9999.99 (function)
def random_float():
    return format(random.uniform(0, 9999.99), '.2f')
# Request name of the file from user
file_name = input("Enter the name of the file: ")
# Open the file for writing
with open(file_name, 'w') as file:
    # Generate and write 20 lines of data
    for _ in range(20):
        line = f"{random_uppercase_letters()} {random_integer()} {random_lowercase_letters()} {random_float()}\n"
        file.write(line)
print(f"{file_name} has been created with 20 lines of data.")
