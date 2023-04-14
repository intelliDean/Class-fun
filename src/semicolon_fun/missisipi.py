# Given the string “Mississippi”,
# find the number of occurrences of character ’s’ and character
# ‘i’.


def occurrences(word):
    s = 0
    i = 0
    for j in word:
        if j == 's':
            s = s + 1
        elif j == 'i':
            i = i + 1
    return f"the number of 's' in {word} is {s} and the number of 'i' in {word} is {i}"


if __name__ == '__main__':
    string = 'Mississippi'
    print(occurrences(word=string))

