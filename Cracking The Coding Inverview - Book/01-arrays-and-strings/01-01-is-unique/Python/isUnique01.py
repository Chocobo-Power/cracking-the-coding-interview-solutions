# Iterates string and counts occurences of each character on the string
def isUnique(str):
    str = str.lower()
    for c in str:
        if str.count(c) > 1:
            return False
    return True

print(isUnique("Aitana"))
