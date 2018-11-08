let obj = {
  name: 'James',
  lunch: 'Hamburger',
  field: 'pickles'
}

let {lunch, name} = obj; // copy the contents of the obj fields where fiels are the variable names
console.log(name);
console.log(lunch);