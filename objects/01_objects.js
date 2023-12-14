//Creating object using constructor
//Object.create

const mySym = Symbol("key1")

const JsUser = {
    name : "Vaibhav Baneshi",
    username: "vaibhav_baneshi",
    [mySym]: "myKey1",
    age: 21,
    location: "Dehradun",
    email: "vaibhavbaneshi@gmail.com",
    isLoggedIn: false,
    lastLoginDays: ["Monday", "Saturday"]
}

console.log(JsUser["email"])
console.log(JsUser[mySym])

//Updating object value
JsUser.email = "vaibhavbaneshi@google.com"
//Object is freeze now the values of the object cannot b changed
Object.freeze(JsUser)
JsUser.email = "vaibhavbaneshi@12345.com"

console.log(JsUser)

 const user2 = {
    name: "vaibhav"
 }

 user2.greeting = function() {
    console.log(`Hello JS user, ${this.name}`)
 }

 console.log(user2.greeting())