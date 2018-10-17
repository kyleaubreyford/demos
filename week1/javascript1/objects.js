let person = {
    name: "Nick",
    age: 26
};

console.log(person);

// can use dot to access properties
console.log(person.name);

// can also use "indexing" bracket syntax
console.log(person["name"]);
// just use the dot whenever you can

person.fingers = 10;
// you can just add new properties
// even after the object has been created

person.sayName = function() {
    console.log(this.name);
};

// i can add "methods" to my object
// they are just properties with "function" value
person.sayName();

// constructor functions PascalCase by convention
function Person(name, age, fingers) {
    this.name = name;
    this.age = age;
    this.fingers = fingers;
    this.sayName = function() {
        console.log(this.name);
    };
}
// it's just a function! that happens to use "this"

// btw, functions without return statement
//   return undefined

let person2 = new Person("Nick", 26, 10);

console.log(person2);
person2.sayName();

// now in ES6/ES2015, we can use classes
// (but we would really transpile to ES5 for
// maximum compatibility)

class PersonClass {
    // also new in ES2015: default
    // params for any function
    constructor(name = "Sam",
                age = 3,
                fingers = 10) {
        this.name = name;
        this.age = age;
        this.fingers = fingers;
    }

    // "method" syntax for declaring function
    sayName() {
        console.log(this.name);
    }
}

let person3 = new PersonClass();
console.log(person3);
console.log(typeof(person3));

// INHERITANCE

// back to ES5 for the moment...

// we had only "prototypal" inheritance, not class

function Graduate(name, age, fingers, degree) {
    // all property access "falls back" to the
    // __proto__ object a.k.a. the prototype
    this.__proto__ = new Person(name, age, fingers);
    this.degree = degree;
};

let grad = new Graduate("Sam", 10, 10, "BS CS");
console.log(grad);
console.log(grad.age);
grad.sayName();


// now forward to ES2015

// (only using this "Class" suffix
// to avoid conflict with other stuff in file)
class GraduateClass extends PersonClass {
    constructor(name, age, fingers, degree) {
        // calls parent class constructor
        super(name, age, fingers);

        this.degree = degree;
    }
}

let grad2 = new GraduateClass("Sam", 10, 10, "BS CS");
console.log(grad2);
console.log(grad2.age);
grad2.sayName();

console.log({}.toString());
