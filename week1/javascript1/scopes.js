'use strict'; // enables strict mode globally
// (can instead be done func-by-func)

// THREE kinds of scope in JavaScript:
// 1. global scope (always accessible)
// 2. function scope (only within the same func)
// 3. block scope (within the same { })
//       (new in ES2015 with "let" and "const")

// undeclared_var = 'value';

// console.log(undeclared_var);

// assigning a variable without declaring it
// creates a global variable.
// has global scope (aka document scope)

// strict mode makes that an error!

// correct way to make global variables:
var asdf = 5;
let asdf2 = 5; // let new in ES2015

function func() {

    // x = 45; // global!

    console.log(abc123); // ReferenceError?
    // really, undefined.
    // because abc123 is already declared here!

    var abc123;
    // declarations (not assignments!) are
    // "hoisted" to the top of the function.

    console.log(abc123); // undefined

    abc123 = 'asdf'; // function scope

    // console.log(x);
};

func();

// console.log(x);

// console.log(abc123); // ReferenceError

// block scope demo

function f() {
    var x = true;
    if (x) {
        // "var" = function scope
        var funcScope = 3;
        let blockScope = 3;
        const blockScope2 = 3;

        console.log(funcScope);
        console.log(blockScope);
        console.log(blockScope2);
    }
    console.log();

    console.log(funcScope);
    // console.log(blockScope); // error!
    // console.log(blockScope2); // error!

    // those variables are "out of scope"
};

f();

// (new in ES2015 but supported everywhere:)
// let: block-scoped variable that can be
//      reassigned
// const: block-scoped constant that must be
//        assigned when declared and is fixed
//        thereafter

const obj = {name: "Nick"};

// obj = {}; // not allowed!

obj.abc = 1234;
obj.x = 567;
obj.name = "Drew";
// all allowed! watch out for this.

let name = "Nick";

// shorthand property initializer (ES2015)
let obj2 = { name };
// ES5 equivalent:
let obj3 = { name: name };
