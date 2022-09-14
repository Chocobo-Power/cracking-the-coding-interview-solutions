// Iterates string and counts occurences of each character on the string
function isUnique(str) {
    str = str.toLowerCase();
    for (const c of str) {
        if (str.split(c).length > 2) {
            return false;
        }
    }
    return true;
}

console.log(isUnique("Aitana"));
