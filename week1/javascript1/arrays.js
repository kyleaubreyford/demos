// a lot of these array methods are new in ES2015

let a = [1,3,2,4];

// new array with only values matching some condition
let filtered = a.filter(x => x != 3);

console.log(filtered);

// prefer array forEach to loops when possible.
a.forEach(x => console.log(x));

// we can even use index with forEach:
a.forEach((x, i) => console.log(`${i}:${x}`));

// a new array adding 10 to every value
console.log(a.map(x => x + 10));

// product of all elements
console.log(a.reduce(
    (accumulate, current) => accumulate * current,
    1));

// find max value in array
console.log(a.reduce(
    (maxSoFar, current) => current > maxSoFar
        ? current
        : maxSoFar,
    Number.MIN_VALUE));

// are there any elements less than 1? (no)
console.log(a.some(x => x < 1));

// are all elements less than 10? (yes)
console.log(a.every(x => x < 10));
console.log(a.some(x => x >= 10));

// ternary statement
// let x = a ? b : c;
// is the shorthand for:
// let x2;
// if (a) { x2 = b; }
// else { x2 = c; }
