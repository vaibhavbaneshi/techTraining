const books = [
    { title: 'Book One', genre: 'Fiction', publish: 1981, edition: 2004 },
    { title: 'Book Two', genre: 'Non-Fiction', publish: 1992, edition: 2008 },
    { title: 'Book Three', genre: 'History', publish: 1999, edition: 2007 },
    { title: 'Book Four', genre: 'Non-Fiction', publish: 1989, edition: 2010 },
    { title: 'Book Five', genre: 'Science', publish: 2009, edition: 2014 },
    { title: 'Book Six', genre: 'Fiction', publish: 1987, edition: 2010 },
    { title: 'Book Seven', genre: 'History', publish: 1986, edition: 1996 },
    { title: 'Book Eight', genre: 'Science', publish: 2011, edition: 2016 },
    { title: 'Book Nine', genre: 'Non-Fiction', publish: 1981, edition: 1989 },
];

let output = books.filter((item) => item.genre === 'History' && item.publish >= 1995)
console.log(output);

output = books.filter((item) => item.genre === 'Science')
console.log(output);

const newNumber = [1,2,3,4,5,6,7,8,9,10]
const result = newNumber
                        .map((num) => num * 10) 
                        .map((num) => num + 1)
                        .filter((num) => num >= 41)

console.log(result);

const myArr = [1,2,3]
const total = myArr.reduce(function(acc, currVal) {
    console.log(`acc : ${acc} and currVal: ${currVal}`);
    return acc + currVal
},0)

console.log(total);

const total1 = myArr.reduce((acc,currVal) => acc+currVal, 0)
console.log(total1)

const shoppingCart = [
    {
        courseName: "py course",
        price: 999
    },
    {
        courseName: "js course",
        price: 1999
    },
    {
        courseName: "java course",
        price: 2999
    },
    {
        courseName: "c++ course",
        price: 3999
    },
]

const price = shoppingCart.reduce((acc,currVal) => acc + currVal.price, 0)
console.log(`The total price of the cart is: ${price}`)
