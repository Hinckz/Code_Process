import re

# Defining the patterns for the expressions
ssn_pattern = r'\b\d{3}[-.]\d{2}[-.]\d{4}\b'
phone_pattern = r'\b\d{3}-\d{3}-\d{4}\b'
zip_pattern = r'\b\d{5}(-\d{4})?\b'

# Function of patterns in a text to count occurrences
def count_patterns_in_text(text, patterns):
    counts = {}
    for pattern_name, pattern in patterns.items():
        matches = re.findall(pattern, text)
        counts[pattern_name] = len(matches)
    return counts

# Request name of text file from user
file_name = input("Please provide the text file name: ")

try:
    with open(file_name, 'r') as file:
        text = file.read()
        patterns = {
            "US National ID (Social Security Number)": ssn_pattern,
            "US Phone Number": phone_pattern,
            "US Postal Code (Zip Code)": zip_pattern
        }
        counts = count_patterns_in_text(text, patterns)

        for pattern_name, count in counts.items():
            print(f"Num of {pattern_name} found: {count}")
except FileNotFoundError:
    print(f"File '{file_name}' not found. kindly provide a valid file name.")
except Exception as e:
    print(f"An error encountered: {str(e)}")
