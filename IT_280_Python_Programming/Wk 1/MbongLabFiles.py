
input_file1_name = input("Provide first input file name: ")
input_file2_name = input("Provide second input file name: ")

output_file_name = input("Provide output file name: ")

try:
    with open(input_file1_name, 'r') as input_file1, open(input_file2_name, 'r') as input_file2:
        input_file1_contents = input_file1.read()

        input_file2_contents = input_file2.read()

        with open(output_file_name, 'a') as output_file:
            output_file.write(input_file1_contents)
            output_file.write(input_file2_contents)

        print(f"Contents from {input_file1_name} and {input_file2_name} have been appended to {output_file_name}")

except FileNotFoundError:
    print("One or both of the input files do not exist.")
except Exception as e:
    print(f"An error occurred: {str(e)}")
