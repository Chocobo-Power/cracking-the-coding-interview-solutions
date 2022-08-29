function oneAway(str01, str02) {

    // String lengths differ by more than one
    if (Math.abs(str01.length - str02.length) > 1) {
        return false;
    }

    // Find larger and smaller
    const larger = Array.from(str01.length > str02.length ? str01 : str02);
    const smaller = Array.from(str02.length < str01.length ? str02 : str01);

    // If one is smaller, smaller destroys larger
    // If both are the same, any of the two can destroy the other
    for (let c of smaller) {
        const index = larger.indexOf(c);
        larger.splice(index, index+1);
    }
    return (larger.length <= 1);

}

console.log(oneAway("ren", "ran"));
