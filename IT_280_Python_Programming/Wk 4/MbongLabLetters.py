def count_vowels(input_string):
    vowels = "AEIOUYaeiouy"
    vowel_count = 0
    for char in input_string:
        if char in vowels:
            vowel_count += 1
    return vowel_count

def count_consonants(input_string):
    consonants = "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz"
    consonant_count = 0
    for char in input_string:
        if char in consonants:
            consonant_count += 1
    return consonant_count

user_input = input("Please Input a string: ")

vowel_count = count_vowels(user_input)
consonant_count = count_consonants(user_input)

print("Num of vowels:", vowel_count)
print("Num of consonants:", consonant_count)
