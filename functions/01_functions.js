function loggedUserMessage(username = "defaultValue") {
    if(!username)
        console.log("Please enter a username!!!")
    else
        return `${username} just logged in.`
}

console.log(loggedUserMessage());

//Spread/Rest Operator 
function calculateCartPrice(...num1) {
    return num1
}

console.log(calculateCartPrice(100, 200, 300));


function userDetails(getObject) {
    return `Username is ${getObject.username} and email is ${getObject.email}`
}

const result = userDetails({
    username: "vaibhav",
    email: "vaibhav@gmail.com"
});

console.log(result);


function resturnSecondValue(getAnyArray) {
    console.log(getAnyArray[1]);
}

const myArray = [1,2,3,4,5];
resturnSecondValue(myArray);