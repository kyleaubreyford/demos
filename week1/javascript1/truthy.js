// also new in ES2015
// but we can use it everywhere anyway:
// template string interpolation
var x = 4;
var y = "4";
var z = "`x: ${";

console.log(`x: ${x}, y: ${y}, equals:${x == y}`);

function truthyFalsy(x) {
    let bool = Boolean(x);
    console.log(`${x} as bool: ${bool}`);
}

truthyFalsy(-1);
truthyFalsy(-0);
truthyFalsy(0);
truthyFalsy(1);
truthyFalsy(1.5);
truthyFalsy(Infinity);
truthyFalsy(NaN);

// falsy numbers: 0, -0, NaN

truthyFalsy({});
truthyFalsy([]);

// all objects are truthy

truthyFalsy("");
truthyFalsy("false");

// falsy strings: ""

truthyFalsy(truthyFalsy);

// functions are objects, always truthy

// falsy booleans: false

truthyFalsy(null);
truthyFalsy(undefined);
// both falsy


// all falsy values:
// "" false 0 -0 NaN null undefined
// everything else is truthy

let q = null;
if (q) {

}
