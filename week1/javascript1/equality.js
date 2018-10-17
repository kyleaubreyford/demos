// variable decl., = to function expression
var compare1 = function(a, b) {
    console.log("a: " + a + ", b: " + b);
    console.log("a == b: " + (a == b));
    console.log("a === b: " + (a === b));
};

// equivalent function declaration syntax
function compare2(a, b) {
    console.log("a: " + a + ", b: " + b);

    // double equals: loose equality
    // compares value regardless of type
    // by coercing the types (type conversion)
    console.log("a == b: " + (a == b));

    // triple equals: strict equality
    // if type is different, always not equal.
    // ALWAYS use strict equality.
    console.log("a === b: " + (a === b));
};

// explicit type conversions:
var z = String(5);

var a1 = [];
var a2 = a1;

// compare2(5, "5");
// compare2(97, "5");
// compare2(null, undefined);
// compare2([], []);
// compare2(a1, a2);
// compare2([1, 2], [1, 2]);
compare2(NaN, NaN);
// how can i tell if x is NaN? isNaN(x)

// validate user input!
