const marvel_heroes = ["thor", "IronMan" , "Captain"]
const dc_heroes = ["Batman", "SuperMan"]

//Spread Operator
const all_new_heroes = [...marvel_heroes, ...dc_heroes]

console.log(all_new_heroes);

const newArray = [1, 2, 3, [4, 5, 6], 7, [8, 9, [10, 11]]]

//Flat Operator
const newArray1 = newArray.flat(Infinity)
console.log(newArray1);

//from Operator
console.log(Array.from("Vaibhav"));

//of Operator
let score1 = 100
let score2 = 200
let score3 = 300
console.log(Array.of(score1,score2,score3));