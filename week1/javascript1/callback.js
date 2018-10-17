// i can use this function
// with whatever behavior i want at the end
function addNumbers(a, b, callback) {
    let result = a + b;

    return callback(result);
}

function addNumbersNoCallback(a, b) {
    let result = a + b;

    return result;
}

addNumbers(1, 2, console.log);

addNumbers(1, 2, function (x) {
    console.log(x + 1);
});

addNumbers(1, 2, alert);

alert(addNumbersNoCallback(1, 2));

// new in ES2015: arrow functions
// aka "lambda functions"

// arrow function returning the value of one expression
addNumbers(1, 2, x => console.log(x));

// arrow functions with a block
addNumbers(1, 2, x => {
    console.log(x);
    // return ??
});

let lambda = (a, b) => a + b;
console.log(typeof(lambda));

// there is one big difference between
{
    f: x => this.thing = 34;
}
// and
{
    function f(x) { this.thing = 34; }
}
// the second way, "this" only gets a value
// when the function is called.

// but the first way, arrow function,
// "this" gets its value bound right away.

// that behavior is called "lexical this".

// loops

for (let x = 0; x < 5; x++) {
    console.log(x);
}
