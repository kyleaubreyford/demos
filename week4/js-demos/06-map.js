const arr = [
  'blake',
  'clark',
  'aaron',
  'kyle',
  'paul'
]

const newArr = arr.map(each => {
  return {
    name: each
  }
})

console.log(arr);
console.log(newArr);