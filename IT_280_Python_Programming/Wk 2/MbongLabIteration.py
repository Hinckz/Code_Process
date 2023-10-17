import random

def get_user_choice():
    print("Provide your choice: ")
    print("A. Rock")
    print("B. Paper")
    print("C. Scissors")
    print("D. Lizard")
    print("E. Spock")
    
    while True:
            choice = input("Provide a letter corresponding to your choice (A/B/C/D/E): "). upper()
            if choice in range['A', 'B', 'C', 'D', 'E']:
                return choice
            else:
                print("Invalid choice! Select a letter betwn A and E.")

def get_computer_choice():
    return random.choice(['A', 'B', 'C', 'D', 'E'])

def determine_winner(user_choice, computer_choice):
    game_rules = {
        ('A', 'D'): "Rock crushes Lizard",
        ('A', 'C'): "Rock destroys Scissors",
        ('B', 'E'): "Paper disproves Spock",
        ('B', 'A'): "Paper covers Rock",
        ('C', 'B'): "Scissors cuts Paper",
        ('C', 'D'): "Scissors decapitates Lizard",
        ('D', 'B'): "Lizard eats Paper",
        ('D', 'E'): "Lizard poisons Spock",
        ('E', 'C'): "Spock smashes Scissors",
        ('E', 'A'): "Spock vaporizes Rock"
    }
    
    if user_choice == computer_choice:
        return "Stalemate!"
    
    if (user_choice, computer_choice) in game_rules:
        return f"Won, Congrats!! ({game_rules[(user_choice, computer_choice)]})"
    else:
        return f"Computer smashed!! ({game_rules[(computer_choice, user_choice)]})"

while True:
    user_choice = get_user_choice()
    computer_choice = get_computer_choice()
    
    print(f"You chose {user_choice}.")
    print(f"Computer chose {computer_choice}.")
    
    result = determine_winner(user_choice, computer_choice)
    print(result)
    
    play_again = input("Interested in playing again? (yes/no): ").lower()
    if play_again != "yes":
        break
