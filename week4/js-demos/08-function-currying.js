function add(a, b, c) {
  return a + b;
}
console.log(add(2,3));


let curriedAdd = (a) => (b) => {
    return a + b;
}

console.log(curriedAdd(2)(3))

let add2 = curriedAdd(2);

console.log(`add2 with 5 = ${add2(5)}`);
console.log(`add2 with 10 = ${add2(10)}`);

let add3 = curriedAdd(3);
console.log(`add3 with 20 = ${add3(20)}`);