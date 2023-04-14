# You just made a new friend at school and he is trying to guess your birthday. He has already
# guessed the month and year of your birth, and is now trying to guess the date d. Write a loop
# to allow your friend to keep guessing until he guesses right. Stop once he has guessed
# correctly. Print out “Incorrect Guess” if the guess is not correct, and “Correct Guess” if the
# guess is correct.

def guess_birthday():
    birthday = 24

    while True:
        guess = int(input("Guess my birth date: "))
        if guess == birthday:
            print("Correct Guess")
            break
        else:
            print("Incorrect Guess")


if __name__ == '__main__':
    guess_birthday()
