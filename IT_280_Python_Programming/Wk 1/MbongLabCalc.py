P = float(input("Provide the principal amount (P): "))
r = float(input("provide annual interest rate (as a decimal): "))
n = int(input("Provide number interest is compounded yearly (n): "))
t = float(input("Provide number of years (t):"))

A = P * (1 + r/n)**(n*t)
interest_earned = A - P

print(f"The interest earned is: ${interest_earned: .2f} (rounded to 2 decimal places).")
print(f"The total amount after {t} years is: ${A: .2f} (rounded to 2 decimal places).")
