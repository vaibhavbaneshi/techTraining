const buttons = document.querySelectorAll('.button');

const body = document.querySelector("body")

buttons.forEach(function (button) {
    button.addEventListener('click' , function(e) {
        switch(e.target.id) {
            case 'grey' : document.body.style.background = e.target.id
                            var h1 = document.querySelectorAll('.heading')
                            h1.forEach(function (h) {
                            h.style.color = 'white'
                            })
            break;

            case 'white' : document.body.style.background = e.target.id;
                            h1 = document.querySelectorAll('.heading')
                            h1.forEach(function (h) {
                            h.style.color = 'black'
                            })
            break;

            case 'blue' : document.body.style.background = e.target.id
                            h1 = document.querySelectorAll('.heading')
                            h1.forEach(function (h) {
                                h.style.color = 'white'
                            })
            break;

            case 'yellow' : document.body.style.background = e.target.id
                            h1 = document.querySelectorAll('.heading')
                            h1.forEach(function (h) {
                            h.style.color = 'black'
                            })
            break;

            case 'purple': document.body.style.background = e.target.id
                        h1 = document.querySelectorAll('.heading')
                        h1.forEach(function (h) {
                            h.style.color = 'white'
                        })
            break;

            default : document.body.style.background = 'black'
                        h1 = document.querySelectorAll('.heading')
                        h1.forEach(function (h) {
                            h.style.color = 'white'
                        })
        }
    })
})
