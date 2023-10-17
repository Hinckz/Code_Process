CALORIES_PER_MINUTE = 4.8

def calculate_calories_burned(minutes):
    print("Total Calories per Minute")
    for minute in range(1, minutes + 1):
        total_calories = minute * CALORIES_PER_MINUTE
        print(f"{minute:8d} {total_calories:.2f}")

while True:
    try:
        minutes = int(input("Provide the minutes to use the elliptical: "))
        if minutes < 0:
            print("Pls provide a positive number of minutes.")
        else:
            calculate_calories_burned(minutes)
            break
    except ValueError:
        print("Invalid input! Pls provide an integer number of minutes.")
