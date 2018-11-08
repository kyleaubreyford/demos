const arr = [
  {
    name: 'bob',
    age: 2
  },
  {
    name: 'sally',
    age: 41
  },
  {
    name: 'johnny',
    age: 8
  },
  {
    name: 'william',
    age: 61
  }
]

// filter out all people over age 20
const filtered = arr.filter(each => {
  return each.age <= 20;
})

console.log(arr);
console.log('after filter');
console.log(filtered);