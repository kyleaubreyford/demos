class Shape {
  constructor (id, x, y) {
      this.id = id
      this.move(x, y)
      this.lambdaMove = (newX, newY) => {
        this.x = newX;
      }
  }
  move (x, y) {
      this.x = x
      this.y = y
  }
}

let s = new Shape(1, 2,3);
let move = s.move.bind(s);
console.log(s.x);
move(5);
console.log(s.x);

let lambdaMove = s.lambdaMove;
lambdaMove(25);
console.log(s.x);