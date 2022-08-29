function checkPermutation(str01, str02) {
    str01 = Array.from(str01).sort().join('');
    str02 = Array.from(str02).sort().join('');
    return str01 === str02;
}

console.log(checkPermutation("renzo", "ozner"));
