// Immediately Invoked Function Expressions (IIFE)

//Named IIFE
(function chai(name) {
    console.log(`IIFE 1 ${name}`);
})('vaibhav');


//Un-named IIFE
( (name) => {  
    console.log(`IIFE 2 ${name}`);
})('baneshi'); 