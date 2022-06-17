
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

