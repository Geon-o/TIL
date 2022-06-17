
// console에 출력
const calculator = {
    add: function (a, b) {
        console.log("add = " + (a + b));
    },
    min: function (a, b) {
        console.log("min = " + (a - b));
    },
    div: function (a, b) {
        console.log("div = " + (a / b));
    },
    mul: function (a, b) {
        console.log("mul = " + (a * b));
    },
    squ: function (a, b) {
        console.log("squ = " + (a ** b));
    },
};

calculator.add(2, 3);
calculator.min(2, 3);
calculator.div(2, 3);
calculator.mul(2, 3);
calculator.squ(2, 3);

// alert 사용

const calculator2 = {
    add: function (a, b) {
        alert("add = " + (a + b));
    },
    min: function (a, b) {
        alert("min = " + (a - b));
    },
    div: function (a, b) {
        alert("div = " + (a / b));
    },
    mul: function (a, b) {
        alert("mul = " + (a * b));
    },
    squ: function (a, b) {
        alert("squ = " + (a ** b));
    },
};

calculator2.add(2, 3);
calculator2.min(2, 3);
calculator2.div(2, 3);
calculator2.mul(2, 3);
calculator2.squ(2, 3);

// return 키워드
const age = 20;
function calculateKrAge(ageOfForeigner) {
    return ageOfForeigner + 2;
}

const krAge = calculateKrAge(age);
console.log(krAge);

const calculator3 = {
    add: function (a, b) {
        return a + b;
    },
    min: function (a, b) {
        return a - b;
    },
    div: function (a, b) {
        return a / b;
    },
    mul: function (a, b) {
        return a * b;
    },
    squ: function (a, b) {
        return a ** b;
    },
};

const addTmp = calculator3.add(2, 3);
const minTmp = calculator3.min(addTmp, 3);
const divTmp = calculator3.div(2, minTmp);
const mulTmp = calculator3.mul(divTmp, minTmp);
const squTmp = calculator3.squ(mulTmp, addTmp);

