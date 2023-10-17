import math
def calculate_circle_area(diameter):
    radius = diameter / 2
    area = math.pi * (radius ** 2)
    return area

def calculate_mpg(distance, gallons):
    mpg = distance / gallons
    return mpg

def calculate_total_hours(hours_per_day):
    total_hours = sum(hours_per_day)
    return total_hours

def calculate_sales_tax(item_cost, tax_rate):
    sales_tax = item_cost * tax_rate
    total_cost = item_cost + sales_tax
    return sales_tax, total_cost

def calculate_triangle_area(base, height):
    area = 0.5 * base * height
    return area

def menu():
    print("Select a mathematical function:")
    print("1. Calculate area of a circle")
    print("2. Calculate MPG for a vehicle")
    print("3. Calculate total hours worked in a week")
    print("4. Calculate sales tax and total cost")
    print("5. Calculate area of a triangle")
    choice = int(input("Provide your choice (1/2/3/4/5): "))

    if choice == 1:
        diameter = float(input("Provide diameter of the circle: "))
        area = calculate_circle_area(diameter)
        print(f"The area of the circle is {area:.2f} square units.")
    elif choice == 2:
        distance = float(input("Provide distance traveled (in miles): "))
        gallons = float(input("Provide gallons of fuel used: "))
        mpg = calculate_mpg(distance, gallons)
        print(f"The MPG (Miles Per Gallon) is {mpg:.2f} miles per gallon.")
    elif choice == 3:
        hours_per_day = [float(input(f"Provide hours worked on {day}: "))
                         for day in ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]]
        total_hours = calculate_total_hours(hours_per_day)
        print(f"Total hours in a week is {total_hours:.2f} hours.")
    elif choice == 4:
        item_cost = float(input("Provide item cost: "))
        tax_rate = float(input("Provide sales tax rate (e.g., 6.5% as 0.065): "))
        sales_tax, total_cost = calculate_sales_tax(item_cost, tax_rate)
        print(f"The sales tax is {sales_tax:.2f} and the total cost is {total_cost:.2f}.")
    elif choice == 5:
        base = float(input("Provide the base of the triangle: "))
        height = float(input("Provide the height of the triangle: "))
        area = calculate_triangle_area(base, height)
        print(f"The area of the triangle is {area:.2f} square units.")
    else:
        print("Invalid choice!")

while True:
    menu()
    another_calculation = input("Do you want to perform another calculation? (yes/no): ")
    if another_calculation.lower() != "yes":
        break
