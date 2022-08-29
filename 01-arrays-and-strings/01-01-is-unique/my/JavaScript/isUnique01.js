function isUnique(myString) {
    const testSet = [];
    for (c of myString) {
        if (testSet.indexOf(c.toLowerCase()) === -1) {
            testSet.push(c.toLowerCase());
        } else {
            return false;
        }        
    }
    return true;
}

console.log(isUnique("Aitana"));
