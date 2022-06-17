// 값 받기
const age = parseInt(prompt("몇 살임?"));
// NaN 판별
console.log(isNaN(age));

// 조건
// if (condition) {
//     // condition 참일때 실행
// } else {
//     // condition 거짓일 때 실행
// }

// 활용 예시1
// if (isNaN(age)) {
//     console.log("숫자를 입력해주세요.");
// } else {
//     console.log("숫자를 입력하였습니다.")
// }

// 활용 예시2
if (isNaN(age) || age < 0) {
    console.log("(양의)숫자를 입력해주세요.");
} else if (age < 18) {
    console.log("미성년자");
} else if (age >= 18 && age <= 50) {
    console.log("18세부터 50세");
} else if (age > 50 && age <= 80) {
    console.log("51살부터 80세");
} else if (age === 100) {
    console.log("장수");
} else if (age > 80) {
    console.log("81세~")
} 