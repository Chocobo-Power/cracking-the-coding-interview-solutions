// Creates a Set and compares it's size with the length of the string
function isUnique(str) {
    str = str.toLowerCase();
    const strSet = new Set(str);
    return (str.length === strSet.size);
}

console.log(isUnique("Abigail"));
