# Creates a Set and compares it's size with the length of the string
def isUnique(str):
    return len(str) == len(set(str))

print(isUnique("Abigail"))
