const user = {
    userName: "vaibhav",
    price: 999,

    welcomeMessage: function() {
        console.log(`${this.userName}, welcome to the website`);

        //this keyword is refering to the current context/values.
        console.log(this);
    }
}

user.welcomeMessage();
user.userName = "baneshi";
user.welcomeMessage();

console.log('\n');
//this keyword here refers to empty object because there is no global context/value
console.log(this);

//If we do console.log(this) in any website console then that "this" keyword would refer to the window object

function chai() {
    console.log(this);
}
chai();
