const regularUser = {
    email: "vaibhavbaneshi@gmail.com",
    fullName: {
        userName: {
            firstName: "Vaibhav",
            middleMan: "",
            lastName: "Baneshi"
        }
    }
}

console.log(regularUser)
console.log(regularUser.fullName.userName.firstName)

const obj = {
    name: "vaibhav",
    email: "vaibhav@gmail.com",
    id: 123
}

console.log(Object.keys(obj))
console.log(Object.values(obj))
console.log(Object.entries(obj))