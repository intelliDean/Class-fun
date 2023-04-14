# Write a program to print the letters of the word "SEMICOLON"
# with each alphabet in a separate line


def new_line(word: str):
    for i in word:
        print(i)


if __name__ == '__main__':
    string = 'SEMICOLON'
    new_line(string)