import datetime

# Calculating time difference in years, months, and days
def calculate_time_difference(event_date, todays_date):
    delta = event_date - todays_date
    years = delta.days // 365
    months = (delta.days % 365) // 30
    days = (delta.days % 365) % 30
    return years, months, days

# Getting valid date input from the user input
def get_valid_date_input(prompt):
    while True:
        try:
            date_input = input(prompt + " (YYYY-MM-DD): ")
            year, month, day = map(int, date_input.split('-'))
            return datetime.date(year, month, day)
        except ValueError:
            print("Incorrect input format. Use format YYYY-MM-DD.")

# Ask the current date from the user
todays_date = get_valid_date_input("Provide todays date")

# Dates for the three events defined
event1_date = get_valid_date_input("Provide date for Event 1")
event2_date = get_valid_date_input("Provide date for Event 2")
event3_date = get_valid_date_input("Provide date for Event 3")

# Calculate and print the time difference for each event
event1_difference = calculate_time_difference(event1_date, todays_date)
event2_difference = calculate_time_difference(event2_date, todays_date)
event3_difference = calculate_time_difference(event3_date, todays_date)

print(f"Time diff btwn Event 1 and todays date: {event1_difference[0]} years, {event1_difference[1]} months, {event1_difference[2]} days")
print(f"Time diff btwn Event 2 and todays date: {event2_difference[0]} years, {event2_difference[1]} months, {event2_difference[2]} days")
print(f"Time diff btwn Event 3 and todays date: {event3_difference[0]} years, {event3_difference[1]} months, {event3_difference[2]} days")
