const arr = [1,2,3,4,5]
const heoresArray = ["iron_man", "Batman"]

const myArr = new Array(1,2,3,4,5)
myArr.push(6)
myArr.push(7);
myArr.pop();

myArr.unshift(0);
myArr.unshift(9);
myArr.shift();

console.log(myArr);
console.log(myArr.includes(9))

const newArray = myArr.join();
console.log(newArray);
console.log(typeof newArray);

console.log("The original Array: ", myArr);
console.log("\n");

console.log("The original Array: ", myArr);
const myArr2 = myArr.slice(1,3);
console.log("Slice Function: ", myArr2);
console.log("Array after Slice: ", myArr);
console.log("\n");

console.log("The original Array: ", myArr);
const myArr3 = myArr.splice(1,3);
console.log("Splice Function: ", myArr3);
console.log("Array after Splice: ", myArr);


