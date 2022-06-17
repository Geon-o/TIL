// NaN 판별
const age = parseInt(prompt("몇 살임?"));
console.log(isNaN(age));

// 조건
// if (condition) {
//     // condition 참일때 실행
// } else {
//     // condition 거짓일 때 실행
// }

//활용 예시1
if (isNaN(age)) {
    console.log("숫자를 입력해주세요.");
} else {
    console.log("숫자를 입력하였습니다.")
}