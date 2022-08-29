def isUnique(myStr):
    testStr = []
    for c in myStr:
        if c.lower() not in testStr:
            testStr.append(c.lower())
        else:
            return False
    return True

print(isUnique("Renzo"))
