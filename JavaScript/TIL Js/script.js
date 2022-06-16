const mon = "mon";
const tue = "tue";
const wed = "wed";
const thr = "thr";
const fri = "fri";
const sat = "sat";
const sun = "sun";

// 그룹화(string)
const Week = mon + tue + wed + thr + fri + sat + sun;
console.log(Week);

// 데이터 타입 그룹화(Array)
const Week2 = [mon , tue , wed , thr , fri , sat , sun];
console.log(Week2);

//변수 할당 없이
const Week3 = ["mon" , "tue" , "wed" , "thr" , "fri" , "sat"];
console.log(Week3);
// console.log(Week3[index]);  데이터 접근 -> "sat" 출력 배열은 0부터 시작

//데이터 추가
Week3.push("sun");
console.log(Week3);