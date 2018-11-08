import def, {b, d} from './03-module-exports'; // no {} gives default export
import * as myExports from './03-module-exports'; // creates namespace with all exports on it

console.log(`default export = ${JSON.stringify(def)}`);
console.log(`normal exports b=${b} and d=${d}`);

console.log(`Using namespace for exports
default= ${JSON.stringify(myExports.default)}
h=${myExports.h}
b=${myExports.b}
d=${myExports.d}
`)