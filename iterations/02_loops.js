//Object can be iterated using for each loop
const myObject = {
    js: "javaScript",
    cpp: "C++",
    java: "java",
    py: "Python"
}

for (const key in myObject) {
    console.log(`key is: ${key} and value is: ${myObject[key]}`);
}

const myArr = ["java", "c", "c++", "javaScript"]

for (const key in myArr) {
    console.log(key+` `+myArr[key]);
}

const map = new Map();
map.set("IN", "India");
map.set("USA", "America");
map.set("FR", "France");

for (const key in map) {
    console.log(key);
}