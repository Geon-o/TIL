//function
console.log("Hello name is a");
console.log("Hello name is b");
console.log("Hello name is c");
console.log("Hello name is d");

function Hello(name1, age) {
    console.log("hello " + name1 + "and " + age);
}

Hello();
Hello("G", 20);
Hello("J", 25);
Hello("O", 27);

function plus(FN, SN) {
    console.log(FN + SN);
}

function minus(a, b) {
    console.log(a - b);
}

plus(10, 11);
minus(50, 10);

// function in object
const profile = {
    name: "G",
    say: function (anotherName) {
        console.log("hello! " + anotherName + " how are you");
    },
};

console.log(profile.name);
profile.say("J");
profile.say("O");
