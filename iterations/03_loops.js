const myArr = ["java", "c", "c++", "javaScript", "cpp"];

myArr.forEach((item, index, myArr) => {
    console.log(item, index, myArr);
})

const arr = [
    {
        languageName: "java",
        fileName: "java"
    },
    {
        languageName: "javaScript",
        fileName: "js"
    },
    {
        languageName: "Python",
        fileName: "py"
    }
]

arr.forEach((item) => {
    console.log(`Language name is: ${item.languageName} and file name is: ${item.fileName}`)
})