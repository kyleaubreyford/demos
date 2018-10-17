var x = 0; // number
x = -0;
x = NaN;
x = Infinity;
x = -Infinity; // IEEE floats have special things like these values, but all are number type
x = 'string'; // string
x = true; // boolean
x = null; // null (but typeof = object)
x = undefined; // undefined
x = [1, 2]; // object (array)
x = {}; // object
x = function(a) { return a; }; // object (typeof = function)
x.abc = 3;
// symbol -- new in ES2015

console.log("value of x: " + x);
console.log("type of x: " + typeof(x));

var y;

console.log("value of y: " + y);
console.log("type of y: " + typeof (y));

console.log("value of x.dontexist: " + x.dontexist);
console.log("type of x.dontexist: " + typeof (x.dontexist));
