function isPalindromePermutation(str) {
    str = str.toLowerCase().replace(" ", "");
    const arr = Array.from(str);

    for (let i = 0, l = arr.length; i < l; i++) {

        if (arr[i] !== "") {
            const arrSlice = arr.slice(i+1,l);
            const secondIndex = arrSlice.indexOf(arr[i]);
    
            // Destroy pairs of characters
            if (secondIndex !== -1) {
                arr[i] = "";
                arr[secondIndex+i+1] = "";
            }
        }
    }

    return (arr.filter(c => c !== "").length <= 1);
}

console.log(isPalindromePermutation("Tact Coa"));
