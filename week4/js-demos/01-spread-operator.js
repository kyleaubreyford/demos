let obj = {
  field1: 5,
  field2: 'hello',
  name: 'Nigel',
  sure: true
}

let obj2 = {
  ...obj, // copy all contents from obj
  sure: false
}

console.log(obj2);

let arr = [ 'a', 53, true, {name: 'blake'}, 'hello', 43];
let arr2 = [...arr, 2, ...arr];
console.log(arr2);