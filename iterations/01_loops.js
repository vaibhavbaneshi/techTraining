const arr = [1,2,3,4,5]

for(const num of arr) {
    console.log(num);
}

const greetings = "Heelo world!";
for(const greet of greetings) {
    console.log(greet);
}

//Maps
const map = new Map();
map.set("IN", "India");
map.set("USA", "America");
map.set("FR", "France")

console.log(map);

for(const [key, value] of map) {
    console.log(key, '=>', value);
}

//for of loop does not work on objects
// const myObject = {
//     'game1': "NFS",
//     'game2': "GOW",
//     'game3': "POP"
// }

// for(const [key, value] of myObject) {
//     console.log(key, '=>', value);
// }

